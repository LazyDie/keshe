package com.ipower365.saas.basic.exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("serial")
public class GatewayException extends RuntimeException implements Serializable {

	public static class ModulePropertiesCache {
		private static Map<String, Properties> moduleProps = null;

		private static Map<String, Properties> getModuleProps() {
			synchronized (ModulePropertiesCache.class) {
				if (moduleProps == null) {
					moduleProps = new HashMap<String, Properties>();
				}
			}
			return moduleProps;
		}

		public static void put(String module, Properties prop) {
			getModuleProps().put(module, prop);
		}

		public static Properties get(String module) {
			return getModuleProps().get(module);
		}
	}

	private String resultCode = "ERROR";
	private String resultMessage;
	private String subCode;
	private String subMessage;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	@Override
	public String getMessage() {
		return resultMessage + "~~" + subMessage;
	}

	public String getSubCode() {
		return subCode;
	}

	public String getSubMessage() {
		return subMessage;
	}

	public void setMessage(String message) {
		this.setResultMessage(message);
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	/**
	 * api异常+业务异常
	 * 
	 * @param module
	 * @param resultCode
	 * @param resultParams
	 * @param subCode
	 * @param subMessage
	 */
	public GatewayException(String module, String resultCode, Object[] resultParams, String subCode, String subMessage) {
		this.resultCode = resultCode;
		this.setResultMessage(parse(module, resultCode, resultParams));
		this.subCode = subCode;
		this.subMessage = subMessage;
	}

	/**
	 * 业务异常
	 * 
	 * @param module
	 * @param subCode
	 * @param params
	 */
	public GatewayException(String module, String subCode, Object... params) {
		this.subCode = subCode;
		this.subMessage = parse(module, subCode, params);
	}

	private String parse(String module, String code, Object... params) {
		Properties props = null;
		String EXCEPTION_PATH = "com/ipower365/saas/exceptions/@/gatewayException.properties";
		if (null == module || module.trim().length() == 0)
			return null;
		if (null == ModulePropertiesCache.get(module)) {
			String path = EXCEPTION_PATH.replaceFirst("@", module);
			props = loadProperties(path);
			ModulePropertiesCache.put(module, props);
		}
		props = ModulePropertiesCache.get(module);
		if (props == null) {
			return null;
		}
		String errInfo = props.getProperty(String.valueOf(code));
		if (errInfo == null) {
			return null;
		}
		String errMsg = getFormatedMessage(errInfo, params);
		return errMsg;
	}

	private static Properties loadProperties(String filePath) {
		Properties prop = new Properties();
		InputStream in = null;
		InputStreamReader isr = null;
		try {
			in = ServiceException.class.getClassLoader().getResourceAsStream(filePath);
			if (in != null) {
				isr = new InputStreamReader(in, "utf-8");
				prop.load(isr);
			}
		} catch (Exception e) {
			System.out.println("Fail to load properties:" + filePath);
		} finally {
			try {
				if (null != isr)
					isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (null != in)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}

	private static String getFormatedMessage(String templateMessage, Object... paras) {
		if (templateMessage == null) {
			return "";
		}
		// 使用传入的参数替换模板中的占位符
		String formatedMsg = MessageFormat.format(templateMessage, paras);
		// 将未处理的占位符替换，用于处理少传参数的情况
		String regex = "\\{[0|[1-9]\\d*]\\}";
		String replacement = "";
		formatedMsg = formatedMsg.replaceAll(regex, replacement);
		return formatedMsg;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append("\"resultCode\":");
		sb.append("\"").append(resultCode).append("\"");
		sb.append(",\"resultMessage\":");
		sb.append("\"").append(resultMessage).append("\"");
		sb.append(",\"subCode\":");
		sb.append("\"").append(subCode).append("\"");
		sb.append(",\"subMessage\":");
		sb.append("\"").append(subMessage).append("\"");
		sb.append("}");
		return sb.toString();
	}

}
