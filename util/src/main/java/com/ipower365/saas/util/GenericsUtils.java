package com.ipower365.saas.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <p>
 * Title: GenericsUtils.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author: lijb
 * @version 1.0
 * @Date:2010-12-13,下午06:21:11
 */

public class GenericsUtils {
	/**
	 * 通过反射,获得定义Class时声明的父类的范型参数的类型. 如public BookManager extends
	 * GenricManager<Book>
	 * 
	 * @param clazz
	 *            The class to introspect
	 * @return the first generic declaration, or <code>Object.class</code> if
	 *         cannot be determined
	 */
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz) {
		return getSuperClassGenricType(clazz, 0);
	}

	/**
	 * 通过反射,获得定义Class时声明的父类的范型参数的类型. 如public BookManager extends
	 * GenricManager<Book>
	 * 
	 * @param clazz
	 *            clazz The class to introspect
	 * @param index
	 *            the Index of the generic ddeclaration,start from 0.
	 */
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz, int index) throws IndexOutOfBoundsException {

		Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}

		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

		if (index >= params.length || index < 0) {
			return Object.class;
		}
		if (!(params[index] instanceof Class)) {
			return Object.class;
		}
		return (Class) params[index];
	}
}
