package com.ipower365.saas.basic.message;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;



public class ResourcePropertiesUtil {

    private static final String APPTARGET_NAME_PATH = "com/ipower365/saas/basic/message/appTarget";
    private static final String DOORLOCK_OPERATYPE_PATH = "com/ipower365/saas/basic/message/doorlockOperaType";

    private static Properties appTargetProps = null;
    private static Properties doorOperaTypeProps = null;

    public static String getAppTargetName(String key) {
        if (appTargetProps == null) {
            // 初始化对应语言的Properties
            appTargetProps = initSimpleProperties(APPTARGET_NAME_PATH);
        }
        return appTargetProps.getProperty(key);
    }

    public static String getDoorOperaTypeName(String key) {
        if (doorOperaTypeProps == null) {
            // 初始化对应语言的Properties
            doorOperaTypeProps = initSimpleProperties(DOORLOCK_OPERATYPE_PATH);
        }
        return doorOperaTypeProps.getProperty(key);
    }


    private static Properties initSimpleProperties(String filePath) {
        // 资源文件路径
        String fullFilePath = filePath + ".properties";
        Properties prop = loadProperties(fullFilePath);
        return prop;
    }

    /**
     * 加载Properties的方法
     * @param fullFilePath
     * @return
     */
    private static Properties loadProperties(String fullFilePath) {
        Properties prop = new Properties();
        try {
            InputStream in = ResourcePropertiesUtil.class.getClassLoader().getResourceAsStream(fullFilePath);
            InputStreamReader isr = new InputStreamReader(in, "utf-8");
            prop.load(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
