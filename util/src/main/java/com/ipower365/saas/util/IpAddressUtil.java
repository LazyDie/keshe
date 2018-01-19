package com.ipower365.saas.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * IP地址的工具类
 * @author Chris Yin
 * @date May 26, 2016
 */
public class IpAddressUtil {

    private static final Logger log = LoggerFactory.getLogger(IpAddressUtil.class);

    /**
     * 获取请求的源IP（忽略负载均衡等中间地址）
     * @param request
     * @return
     */
    public static String getOriginalRequestIp(HttpServletRequest request) {
        // 获取经过代理或者负载均衡后的真实ip
        String ip = request.getHeader("X-Forwarded-For");
        log.trace("Ips got from X-Forwarded-For: {}", ip);
        if (!isValidIp(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
            log.trace("Ips got from Proxy-Client-IP: {}", ip);
        }
        if (!isValidIp(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            log.trace("Ips got from WL-Proxy-Client-IP: {}", ip);
        }
        if (!isValidIp(ip)) {
            ip = request.getRemoteAddr();
            log.trace("Ips got from getRemoteAddr: {}", ip);
        }
        // 对于多级代理，取第一个
        String realIp = null;
        String splitChar = ",";
        if (ip.contains(splitChar)) {
            String[] ips = StringUtils.split(ip, splitChar);
            realIp = ips[0];
        } else {
            realIp = ip;
        }
        log.trace("Finally returned ip: {}", realIp);
        return realIp;
    }

    /**
     * 校验是否是有效的ip地址
     */
    private static boolean isValidIp(String ip) {
        if (StringUtils.isBlank(ip)) {
            return false;
        }
        if ("unknown".equalsIgnoreCase(ip)) {
            return false;
        }
        return true;
    }

}
