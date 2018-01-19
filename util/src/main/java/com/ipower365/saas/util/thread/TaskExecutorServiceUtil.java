package com.ipower365.saas.util.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.ipower365.saas.util.CommonUtil;
/**
 * 批量任务处理线程池
 * 单个任务处理慢，对处理速度要求不高的情况使用，防止处理期间过长时间占用数据库连接
 * @author anker
 *
 */
public class TaskExecutorServiceUtil {
	private List<AbstractThread> threads;
	private CountDownLatch latch;
	private static final int corePoolSize = 30;
	private static final int maxPoolSize = 50;
	private static final ExecutorService pool = new ThreadPoolExecutor(corePoolSize, maxPoolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
	private final ReentrantLock lock = new ReentrantLock();

	public TaskExecutorServiceUtil() {
		this.threads = new ArrayList<AbstractThread>();
	}

	/**
	 * 添加要执行的线程
	 * 
	 * @param thread
	 */
	public void addThread(AbstractThread thread) {
		if (null == this.threads || null == thread)
			return;
		this.threads.add(thread);
	}

	/**
	 * 同步执行
	 */
	public void execute() {
		try {
			lock.lock();
			if (CommonUtil.isEmpty(this.threads))
				return;
			latch = new CountDownLatch(this.threads.size());
			for (AbstractThread t : this.threads) {
				if (null != t) {
					t.setLatch(latch);
					pool.execute(t);
				}
			}
			try {
				latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} finally {
			this.threads = null;
			lock.unlock();
		}

	}

	/**
	 * 异步执行
	 */
	public void asyncExecute() {
		try {
			lock.lock();
			if (CommonUtil.isEmpty(this.threads))
				return;
			for (AbstractThread t : this.threads) {
				if (null != t) {
					pool.execute(t);
				}
			}
		} finally {
			this.threads = null;
			lock.unlock();
		}

	}

}
