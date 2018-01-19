package com.ipower365.saas.basic.constants;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public final class Constants {
	private static Properties p;
	static {
		if (null == p) {
			InputStream resourceAsStream = Constants.class.getResourceAsStream("/properties/basicconfig.properties");
			InputStreamReader is = null;
			try {
				is = new InputStreamReader(resourceAsStream, "utf-8");
				p = new Properties();
				p.load(is);
				if (null != p) {
					NOSQL_SWITCH = p.getProperty("NOSQL_SWITCH");
					CACHE_SWITCH = p.getProperty("CACHE_SWITCH");
					DAOLOG_SWITCH = p.getProperty("DAOLOG_SWITCH");
					IMG_ROOT_PATH = p.getProperty("IMG_ROOT_PATH");
					FILE_UPLOAD_PATH = p.getProperty("FILE_UPLOAD_PATH");
					ACTIVITI_FILE_UPLOAD_PATH = p.getProperty("ACTIVITI_FILE_UPLOAD_PATH");
					EXPORT_FILE_PATH = p.getProperty("EXPORT_FILE_PATH");
					SHOW_EXPORT_FILE_PATH = p.getProperty("SHOW_EXPORT_FILE_PATH");
					MQTT_SERVER = p.getProperty("MQTT.SERVER");
					MQTT_TCPPORT = p.getProperty("MQTT.TCPPORT");
					MQTT_SSLPORT = p.getProperty("MQTT.SSLPORT");
					REST_API = p.getProperty("REST.API");
					API_SERVER_NAME = p.getProperty("API.SERVER.NAME");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (null != is)
						is.close();
					if (null != resourceAsStream)
						resourceAsStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

	private Constants() {
	}

	public final static String DEFAULT_ENCODING = "UTF-8";
	public final static String DEFAULT_CONTENTTYPE = "application/x-www-form-urlencoded";
	public final static String DEFULT_DATE_FORMATTER = "yyyy-MM-dd HH:mm:ss";
	public static final String SUCCESS = "success";
	public static final String FAILED = "failed";
	public static final String SIGN1 = ",";
	public static final String APP_TYPE_IOS = "ios";
	public static final String APP_TYPE_ANDROID = "android";
	public static String NOSQL_SWITCH;
	public static String CACHE_SWITCH;
	public static String DAOLOG_SWITCH;
	public static String IMG_ROOT_PATH;
	public static String FILE_UPLOAD_PATH;
	public static String ACTIVITI_FILE_UPLOAD_PATH;
	public static String EXPORT_FILE_PATH;
	public static String SHOW_EXPORT_FILE_PATH;
	public static String DEFAULT_END_TIME = "2200-12-31";
	public static String MQTT_SERVER;
	public static String MQTT_TCPPORT;
	public static String MQTT_SSLPORT;
	public static String REST_API;
	public static String API_SERVER_NAME;
	public static String BAI_YUN_SEN = "白云深";

	public static final Integer MoneyRatio = 10000;
	public static final Integer MoneyScale = 2;
	// 系统用户id customId/userId
	public static final Integer SYSTEM_USERID = 0;
	// 平台的客户id 同orgId是同一个id
	public static final Integer PLATFORM_CUSTOMERID = 1;
	// reason：系统自动关闭
	public static final String SYSTEM_REASON = "1086007";
	// 管家最大持有的现金金额
	public static final Long ROOM_MANAGER_MAX_CASH_AMT = 20000000l;
	// 管家持有现金的最长时间（天）
	public static final Integer ROOM_MANAGER_MAX_CASH_DAYS = 5;

	// 订单默认的有效期
	public static final long ORDER_EXPIRY = 24;
	//
	public static final int ORDER_EXPIRY_UNIT = 0;

	public final static String SEPARATOR_BILL_NAME = "*";

	public static final String DEFAULT_TRANSACTIONMANAGER = "transactionManager";
	public static final String LOG_TRANSACTIONMANAGER = "logTransactionManager";
	public static final String ACTIVITI_TRANSACTIONMANAGER = "activitiTransactionManager";
public static final Integer SYSTEM_USERID_AUTO = 10;
}
