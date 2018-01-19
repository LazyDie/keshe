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
 * 线程池只含一个线程，排队处理
 * @author anker
 *
 */
public class SingleExecutorServiceUtil {
	private List<AbstractThread> threads;
	private CountDownLatch latch;
	private static final int corePoolSize = 1;
	private static final int maxPoolSize = 1;
	private static final ExecutorService pool = new ThreadPoolExecutor(corePoolSize, maxPoolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
	private final ReentrantLock lock = new ReentrantLock();

	public SingleExecutorServiceUtil() {
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
