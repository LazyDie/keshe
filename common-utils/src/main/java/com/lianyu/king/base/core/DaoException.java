package com.lianyu.king.base.core;

@SuppressWarnings("serial")
public class DaoException extends RuntimeException {

	public DaoException(String message) {
		super(DaoConstants.DAO_EVENT_EXCEPTION + message);
	}
}
