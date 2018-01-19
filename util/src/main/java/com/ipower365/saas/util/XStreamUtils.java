package com.ipower365.saas.util;

import java.util.List;

import com.thoughtworks.xstream.XStream;

/**
 * xml转换
 * 
 * @author kevin
 *
 */
public class XStreamUtils {
	private final static String xmlTitle = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

	/**
	 * 对象转换成xml
	 * 
	 * @param alias
	 *            要转换的对象对应的xml标签名
	 * @param t
	 *            要转换的对象
	 * @param omitFields
	 *            忽略的字段
	 * @return String xml
	 */
	public static <T> String toXML(String alias, T t, List<AliasPair> omitFields, String encoding) {
		XStream xs = initXStream(alias, t.getClass(), omitFields);
		String xml2 = xs.toXML(t);
		String xml;
		if (null == encoding)
			xml = xmlTitle + xml2;
		else
			xml = "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?>" + xml2;
		return xml;
	}

	public static <T> String toXML(String alias, T t, List<AliasPair> omitFields) {
		return toXML(alias, t, omitFields, null);
	}

	/**
	 * xml转换成对象
	 * 
	 * @param alias
	 *            要转换的对象对应的xml标签名
	 * @param c
	 *            要转换的对象.class
	 * @param xml
	 *            String xml
	 * @param omitFields
	 *            忽略的字段
	 * @return
	 */
	public static <T> T fromXML(String alias, Class<T> c, String xml, List<AliasPair> omitFields) {
		XStream xs = initXStream(alias, c, omitFields);
		@SuppressWarnings("unchecked")
		T obj = (T) xs.fromXML(xml);
		return obj;
	}

	private static XStream initXStream(String alias, Class<?> c, List<AliasPair> omitFields) {
		XStream xs = new XStream();
		xs.alias(alias, c);
		// List<Class<?>> types = new ArrayList<Class<?>>();
		// if (CommonUtil.isNotEmpty(alias)) {
		// for (AliasPair ap : alias) {
		// if (CommonUtil.isNotEmpty(ap.getAlias()) &&
		// CommonUtil.isNotEmpty(ap.getClazz())) {
		// xs.alias(ap.getAlias(), ap.getClazz());
		// types.add(ap.getClazz());
		// }
		// }
		// }
		if (CommonUtil.isNotEmpty(omitFields)) {
			for (AliasPair ap : omitFields) {
				if (CommonUtil.isNotEmpty(ap.getAlias()) && CommonUtil.isNotEmpty(ap.getClazz())) {
					xs.omitField(ap.getClazz(), ap.getAlias());
				}
			}
		}
		// xs.processAnnotations(types.toArray(new Class<?>[types.size()]));
		xs.autodetectAnnotations(true);
		return xs;
	}

	public static class AliasPair {
		private String alias;
		private Class<?> clazz;

		public String getAlias() {
			return alias;
		}

		public AliasPair(String alias, Class<?> c) {
			this.alias = alias;
			this.clazz = c;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public Class<?> getClazz() {
			return clazz;
		}

		public void setClazz(Class<?> clazz) {
			this.clazz = clazz;
		}

	}
}
