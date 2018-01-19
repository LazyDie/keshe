package com.ipower365.saas.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {

	/**
	 * 加载资源文件
	 * 
	 * @param filePath
	 *            文件相对路径
	 * @return
	 */
	public static Properties loadProperties(String filePath) {
		Properties prop = new Properties();
		try {
			InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream(filePath);
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			prop.load(isr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
