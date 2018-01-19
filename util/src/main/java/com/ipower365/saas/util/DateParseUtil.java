package com.ipower365.saas.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 日期解析
 * @author Chris Yin
 * @date Dec 22, 2015
 */

public class DateParseUtil {

    private static final Logger log = LoggerFactory.getLogger(DateParseUtil.class);

    private static final String fmt_year = "yyyy";
    private static final String fmt_month = "yyyyMM";
    private static final String fmt_day = "yyyyMMdd";
    private static final String fmt_hour = "yyyyMMddHH";
    private static final String fmt_minute = "yyyyMMddHHmm";
    private static final String fmt_second = "yyyyMMddHHmmss";
    private static final String fmt_millionSecond = "yyyyMMddHHmmssSSS";

    /**
     * 使用{yyyyMMddHHmmssSSS}的格式智能解析日期字符串
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date parse(String strDate) throws ParseException {
        if (StringUtils.isBlank(strDate)) {
            log.info("Argument is blank.");
            return null;
        }
        Date date = null;
        switch (strDate.length()) {
            case 4:
                // yyyy
                date = DateUtil.parse(fmt_year, strDate);
                break;
            case 6:
                // yyyyMM
                date = DateUtil.parse(fmt_month, strDate);
                break;
            case 8:
                // yyyyMMdd
                date = DateUtil.parse(fmt_day, strDate);
                break;
            case 10:
                // yyyyMMddHH
                date = DateUtil.parse(fmt_hour, strDate);
                break;
            case 12:
                // yyyyMMddHHmm
                date = DateUtil.parse(fmt_minute, strDate);
                break;
            case 14:
                // yyyyMMddHHmmss
                date = DateUtil.parse(fmt_second, strDate);
                break;
            case 17:
                // yyyyMMddHHmmssSSS
                date = DateUtil.parse(fmt_millionSecond, strDate);
                break;
            default:
                log.error("Invalid date format {}! Expected format like yyyyMMddHHmmssSSS", strDate);
                break;
        }
        // 返回时间
        return date;
    }

    /**
     * 使用{yyyyMMddHHmmssSSS}的格式智能解析日期字符串 <br />
     * 处理为给定时间精度的最大时间
     */
    public static Date parseOfEnd(String strDate) throws ParseException {
        if (StringUtils.isBlank(strDate)) {
            log.info("Argument is blank.");
            return null;
        }
        Date date = null;
        Date end = null;
        switch (strDate.length()) {
            case 4:
                // yyyy
                date = DateUtil.parse(fmt_year, strDate);
                end = DateUtil.getEndOfYear(date);
                break;
            case 6:
                // yyyyMM
                date = DateUtil.parse(fmt_month, strDate);
                end = DateUtil.getEndOfMonth(date);
                break;
            case 8:
                // yyyyMMdd
                date = DateUtil.parse(fmt_day, strDate);
                end = DateUtil.getEndOfDay(date);
                break;
            case 10:
                // yyyyMMddHH
                date = DateUtil.parse(fmt_hour, strDate);
                end = DateUtil.getEndOfHour(date);
                break;
            case 12:
                // yyyyMMddHHmm
                date = DateUtil.parse(fmt_minute, strDate);
                end = DateUtil.getEndOfMinute(date);
                break;
            case 14:
                // yyyyMMddHHmmss
                date = DateUtil.parse(fmt_second, strDate);
                end = DateUtil.getEndOfSecond(date);
                break;
            case 17:
                // yyyyMMddHHmmssSSS
                // 精确到毫秒的时间不做处理
                end = DateUtil.parse(fmt_millionSecond, strDate);
                break;
            default:
                log.error("Invalid date format {}! Expected format like yyyyMMddHHmmssSSS", strDate);
                break;
        }
        // 返回结束时间
        return end;
    }
    
}
