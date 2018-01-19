package com.ipower365.saas.basic.exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 业务层异常类
 * 
 * @author anker.du
 * @date 2015年9月25日 下午1:15:31
 */
public class ServiceException extends BasicException {

	private static final long serialVersionUID = 3371736236625831376L;

	private String module;

	private static Map<String, Properties> moduleProps = null;

	/**
	 * 业务异常编码文件存放路径,@符号为模块名
	 */
	private final static String EXCEPTION_PATH = "com/ipower365/saas/exceptions/@/serviceException.properties";

	/**
	 * @param module
	 *            模块名
	 * @param reason
	 *            异常编码
	 * @param params
	 *            参数1,参数2..
	 */
	public ServiceException(String module, int reason, String... params) {
		super(reason, params);
		this.module = module;
	}

	public ServiceException(int reason, String... params) {
		super(reason, params);
	}

	public ServiceException(Throwable cause) {
		super(cause);
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

	/**
	 * 生成格式化的信息 使用参数替换模板中的占位符
	 * 
	 * @param templateMessage
	 * @param paras
	 * @return
	 */
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

	@Override
	public String getMessage() {
		Properties props = null;
		if (!ServiceException.getModuleProps().containsKey(module) || ServiceException.getModuleProps().get(module).size() < 1) {
			String path = EXCEPTION_PATH.replaceFirst("@", module);
			props = loadProperties(path);
			ServiceException.getModuleProps().put(module, props);
		}
		props = ServiceException.getModuleProps().get(module);
		if (props == null) {
			return null;
		}
		String errInfo = props.getProperty(String.valueOf(getReason()));
		if (errInfo == null) {
			return null;
		}
		Object[] paras = getParams();
		String errMsg = getFormatedMessage(errInfo, paras);
		return errMsg;
	}

	public static Map<String, Properties> getModuleProps() {
		synchronized (ServiceException.class) {
			if (moduleProps == null) {
				moduleProps = new HashMap<String, Properties>();
			}
		}
		return moduleProps;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
