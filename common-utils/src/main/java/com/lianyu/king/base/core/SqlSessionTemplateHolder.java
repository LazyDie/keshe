package com.lianyu.king.base.core;

public class SqlSessionTemplateHolder {
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();

	public static void put(String name) {
		holder.set(name);
	}

	public static String get() {
		return holder.get();
	}

	public static void remove() {
		holder.remove();
	}
}
