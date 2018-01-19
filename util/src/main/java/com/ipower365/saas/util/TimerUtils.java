package com.ipower365.saas.util;

import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TimerUtils {
	private static final ScheduledExecutorService service = Executors.newScheduledThreadPool(128);
	private static final Map<String, ScheduledFuture<?>> m = new ConcurrentHashMap<>();

	private TimerUtils() {

	}

	private static Logger log = LoggerFactory.getLogger(TimerUtils.class);

	public static abstract class AbstractTimerTask {

		public abstract void run();

	}

	public static class WrapperTimerTask extends TimerTask {
		private AbstractTimerTask task;
		private String id;
		private boolean needRemove;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public WrapperTimerTask(final AbstractTimerTask task, final boolean needRemove) {
			this.task = task;
			this.id = ArithUtils.getFixedLenthRandomNumber(32);
			this.needRemove = needRemove;
		}

		@Override
		public void run() {
			try {
				if (null != task)
					task.run();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (needRemove) {
					ScheduledFuture<?> scheduledFuture = m.get(id);
					if (CommonUtil.isNotEmpty(scheduledFuture)) {
						scheduledFuture.cancel(true);
						m.remove(id);
					}
				}
			}
		}

	}

	/**
	 * Creates and executes a one-shot action that becomes enabled after the
	 * given delay.
	 *
	 * @param command
	 *            the task to execute
	 * @param delay
	 *            the time from now to delay execution
	 * @param unit
	 *            the time unit of the delay parameter
	 * @return
	 * @return a ScheduledFuture representing pending completion of the task and
	 *         whose <tt>get()</tt> method will return <tt>null</tt> upon
	 *         completion
	 * @throws RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 */
	public static String schedule(final AbstractTimerTask task, final long delay, TimeUnit unit) {
		if (null == task)
			return null;
		WrapperTimerTask wtt = new WrapperTimerTask(task, true);
		ScheduledFuture<?> schedule = service.schedule(wtt, delay, unit);
		m.put(wtt.getId(), schedule);
		return wtt.getId();
	}

	/**
	 * Creates and executes a periodic action that becomes enabled first after
	 * the given initial delay, and subsequently with the given period; that is
	 * executions will commence after <tt>initialDelay</tt> then
	 * <tt>initialDelay+period</tt>, then <tt>initialDelay + 2 * period</tt>,
	 * and so on. If any execution of the task encounters an exception,
	 * subsequent executions are suppressed. Otherwise, the task will only
	 * terminate via cancellation or termination of the executor. If any
	 * execution of this task takes longer than its period, then subsequent
	 * executions may start late, but will not concurrently execute.
	 *
	 * @param command
	 *            the task to execute
	 * @param initialDelay
	 *            the time to delay first execution
	 * @param period
	 *            the period between successive executions
	 * @param unit
	 *            the time unit of the initialDelay and period parameters
	 * @return
	 * @return a ScheduledFuture representing pending completion of the task,
	 *         and whose <tt>get()</tt> method will throw an exception upon
	 *         cancellation
	 * @throws RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 * @throws IllegalArgumentException
	 *             if period less than or equal to zero
	 */
	public static String scheduleAtFixedRate(final AbstractTimerTask task, final long initialDelay, final long period, TimeUnit unit) {
		if (null == task)
			return null;
		WrapperTimerTask wtt = new WrapperTimerTask(task, false);
		ScheduledFuture<?> scheduleAtFixedRate = service.scheduleAtFixedRate(wtt, initialDelay, period, unit);
		m.put(wtt.getId(), scheduleAtFixedRate);
		return wtt.getId();
	}

	/**
	 * Creates and executes a periodic action that becomes enabled first after
	 * the given initial delay, and subsequently with the given delay between
	 * the termination of one execution and the commencement of the next. If any
	 * execution of the task encounters an exception, subsequent executions are
	 * suppressed. Otherwise, the task will only terminate via cancellation or
	 * termination of the executor.
	 *
	 * @param command
	 *            the task to execute
	 * @param initialDelay
	 *            the time to delay first execution
	 * @param delay
	 *            the delay between the termination of one execution and the
	 *            commencement of the next
	 * @param unit
	 *            the time unit of the initialDelay and delay parameters
	 * @return
	 * @return a ScheduledFuture representing pending completion of the task,
	 *         and whose <tt>get()</tt> method will throw an exception upon
	 *         cancellation
	 * @throws RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 * @throws IllegalArgumentException
	 *             if delay less than or equal to zero
	 */
	public static String scheduleWithFixedDelay(final AbstractTimerTask task, final long initialDelay, final long period, final TimeUnit unit) {
		if (null == task)
			return null;
		WrapperTimerTask wtt = new WrapperTimerTask(task, false);
		ScheduledFuture<?> scheduleWithFixedDelay = service.scheduleWithFixedDelay(wtt, initialDelay, period, unit);
		m.put(wtt.getId(), scheduleWithFixedDelay);
		return wtt.getId();
	}

	/**
	 * Cancels this timer task. If the task has been scheduled for one-time
	 * execution and has not yet run, or has not yet been scheduled, it will
	 * never run. If the task has been scheduled for repeated execution, it will
	 * never run again. (If the task is running when this call occurs, the task
	 * will run to completion, but will never run again.)
	 *
	 * <p>
	 * Note that calling this method from within the <tt>run</tt> method of a
	 * repeating timer task absolutely guarantees that the timer task will not
	 * run again.
	 *
	 * <p>
	 * This method may be called repeatedly; the second and subsequent calls
	 * have no effect.
	 *
	 * @return true if this task is scheduled for one-time execution and has not
	 *         yet run, or this task is scheduled for repeated execution.
	 *         Returns false if the task was scheduled for one-time execution
	 *         and has already run, or if the task was never scheduled, or if
	 *         the task was already cancelled. (Loosely speaking, this method
	 *         returns <tt>true</tt> if it prevents one or more scheduled
	 *         executions from taking place.)
	 */
	public static boolean cancel(String id) {
		boolean cancel = false;
		ScheduledFuture<?> timerTask = m.get(id);
		if (CommonUtil.isEmpty(timerTask)) {
			cancel = true;
		} else {
			cancel = timerTask.cancel(true);
			if (cancel)
				m.remove(id);
		}
		return cancel;
	}

	public static class Test extends AbstractTimerTask {

		@Override
		public void run() {
			log.debug("run:{}", System.currentTimeMillis());
		}

	}

	public static void main(String[] args) {
		AbstractTimerTask task = new Test();
		long delay = 5;
		TimeUnit unit = TimeUnit.SECONDS;
		log.info("start:{}", System.currentTimeMillis());
		String id = TimerUtils.schedule(task, delay, unit);
		TimerUtils.cancel(id);
		log.info("end:{}", System.currentTimeMillis());
	}
}
