package com.ipower365.boss.util.test;

import java.util.Locale;

public class TestNullCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object l = null;
		System.out.println((Locale) l);

		long t = System.currentTimeMillis();
		System.out.println(t);
		System.out.println((int) t);
		System.out.println(new Long(t).intValue());
		System.out.println((int) (0x0000FFFFl & t));
		
		System.out.println(System.currentTimeMillis());
		System.out.println(0xFF);
		System.out.println((byte)0xFF);
		System.out.println((byte)0xF3);
		System.out.println((byte)-128);
		System.out.println((byte)127);
	}

}
