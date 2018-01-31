package com.lianyu.king.base.core;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author kevin
 *
 */
@SuppressWarnings("serial")
public class DaoEvent extends ApplicationEvent {
	/**
	 * 基本操作类型
	 * 
	 * @author kevin
	 *
	 */
	public enum Operation {
		insert, save, update, delete, logicDelete;
	}

	public static class DaoEventSource<T> {
		private Object source;
		private Object id;
		private Operation operation;
		private String tableName;

		public DaoEventSource(String tableName, Operation opertion) {
			this.tableName = tableName;
			this.operation = opertion;
		}

		public String getTableName() {
			return tableName;
		}

		public Object getSource() {
			return source;
		}

		public void setSource(Object source) {
			this.source = source;
		}

		public Object getId() {
			return id;
		}

		public void setId(Object id) {
			this.id = id;
		}

		public Operation getOpertion() {
			return operation;
		}
	}

	public DaoEvent(final DaoEventSource<?> source) {
		super(source);
	}
}
