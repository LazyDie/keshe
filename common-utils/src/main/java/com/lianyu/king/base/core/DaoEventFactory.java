package com.lianyu.king.base.core;

import com.lianyu.king.base.core.DaoEvent.DaoEventSource;
import com.lianyu.king.base.core.DaoEvent.Operation;
import com.ipower365.saas.util.CommonUtil;

public class DaoEventFactory {
	private final static String IllegalArgumentExceptionMessage = "非法的请求参数，请检查！";

	/**
	 * delete事件
	 * 
	 * @return
	 */
	public static <T> DaoEvent delete(String tableName, Object source) {
		if (CommonUtil.isEmpty(source))
			throw new IllegalArgumentException(IllegalArgumentExceptionMessage);
		DaoEventSource<T> s = new DaoEventSource<>(tableName, Operation.delete);
		s.setSource(source);
		return new DaoEvent(s);
	}

	/**
	 * insert事件
	 * 
	 * @param source
	 * @return
	 */
	public static <T> DaoEvent insert(String tableName, Object source) {
		DaoEventSource<T> s = new DaoEventSource<>(tableName, Operation.insert);
		s.setSource(source);
		return new DaoEvent(s);
	}

	/**
	 * save事件，全覆盖更新
	 * 
	 * @param source
	 * @return
	 */
	public static <T> DaoEvent save(String tableName, Object source) {
		if (CommonUtil.isEmpty(source))
			throw new IllegalArgumentException(IllegalArgumentExceptionMessage);
		DaoEventSource<T> s = new DaoEventSource<>(tableName, Operation.save);
		s.setSource(source);
		return new DaoEvent(s);
	}

	/**
	 * update事件
	 * 
	 * @return
	 */
	public static <T> DaoEvent update(String tableName, Object source) {
		if (CommonUtil.isEmpty(source))
			throw new IllegalArgumentException(IllegalArgumentExceptionMessage);
		DaoEventSource<T> s = new DaoEventSource<>(tableName, Operation.update);
		s.setSource(source);
		return new DaoEvent(s);
	}

	/**
	 * logicDelete事件
	 * 
	 * @return
	 */
	public static <T> DaoEvent logicDelete(String tableName, Object source) {
		if (CommonUtil.isEmpty(source))
			throw new IllegalArgumentException(IllegalArgumentExceptionMessage);
		DaoEventSource<T> s = new DaoEventSource<>(tableName, Operation.logicDelete);
		s.setSource(source);
		return new DaoEvent(s);
	}
}
