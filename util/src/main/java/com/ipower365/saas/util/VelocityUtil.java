package com.ipower365.saas.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.ipower365.saas.basic.constants.Constants;

/**
 * Velocity工具
 * @author anker.du
 * @date 2015年6月8日 上午11:17:09
 */
public class VelocityUtil {

    private static final String DEFAULT_ENCODING = "UTF-8";

    // 初始化Velocity容器，单例
    static {
        Velocity.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.setProperty(Velocity.ENCODING_DEFAULT, DEFAULT_ENCODING);
        Velocity.setProperty(Velocity.INPUT_ENCODING, DEFAULT_ENCODING);
        Velocity.setProperty(Velocity.OUTPUT_ENCODING, DEFAULT_ENCODING);
        Velocity.init();
    }

    /**
     * 获取Velocity输出内容
     * @param vmFile
     * @param params
     * @return
     */
    public static String getFormatMessage(String vmFile, Map<String, Object> params) {
        Template t = Velocity.getTemplate(vmFile, DEFAULT_ENCODING);
        VelocityContext context = new VelocityContext();
        for (Entry<String, Object> param : params.entrySet()) {
            context.put(param.getKey(), param.getValue());
        }
        // 设置输出
        StringWriter writer = new StringWriter();
        // 将环境数据转化输出
        t.merge(context, writer);
        return writer.toString();
    }


    public static void genHtml(String template, String destFile, Map<String, Object> params) {

        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, Constants.DEFAULT_ENCODING));
            VelocityContext context = new VelocityContext();
            for (Entry<String, Object> param : params.entrySet()) {
                context.put(param.getKey(), param.getValue());
            }
            Template t = Velocity.getTemplate(template, DEFAULT_ENCODING);
            t.merge(context, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("partA", "AAAAAA");
        params.put("partB", "BBBBBB");
        //com/ipower365/saas/templet/
        System.out.println(111111);
        VelocityUtil.genHtml("com/ipower365/saas/templet/rent_contract.htm", "/work/temp/abc.html", params);
    }

}
