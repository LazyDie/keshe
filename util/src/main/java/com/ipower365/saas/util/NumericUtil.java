package com.ipower365.saas.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


/**
 * 数据转换工具类
 * @author Anker.du
 * @date 2014年10月22日
 */
public class NumericUtil {

    /**
     * 数字规整
     * @param v：原始值
     * @param ratio：倍比
     * @param scale：保留的小数位数
     * @return
     */
    public static String round(Long v, int ratio, int scale) {
        if (v == null) {
            v = 0L;
        }
        double tmp = v / (ratio * 1.0);
        return NumericUtil.round(String.valueOf(tmp), scale);
    }

    public static String round(String v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     * @param v 需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @param round_mode 指定的舍入模式
     * @return 四舍五入后的结果，以字符串格式返回
     */
    public static String round(String v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(v);
        return b.setScale(scale, round_mode).toString();
    }

    /**
     * 获取时间戳(yyyyMMddHHmmssSSS+3位随机数)
     * @return
     */
    public static String getUniqueNumber() {
        StringBuilder timestamp = new StringBuilder();
        timestamp.append(DateUtil.format("yyyyMMddHHmmssSSS", new Date())).append((int) (Math.random() * 1000));
        return timestamp.toString();
    }

    /**
     * 整数按指定位数缩小后并得到相应位数的值
     * @param num
     * @param scale
     * @return
     */
    public static BigDecimal getDecimalByScale(int num, int scale) {
        BigDecimal result = new BigDecimal(num);
        StringBuilder ms = new StringBuilder("1");
        if (scale > 1) {
            for (int i = 0; i < scale; i++) {
                ms.append("0");
            }
        }
        int multiple = Integer.parseInt(ms.toString());
        result = result.divide(BigDecimal.valueOf(multiple), (scale + 1), BigDecimal.ROUND_HALF_UP);
        result = result.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return result;
    }
    
    /**
     * @Title: isNumeric 
     * @Description: 判断字符串是否为数字
     * @param valueStr
     * @return boolean
     * @Author: Shuaibing.zhao 
     * @Date: 2017年8月2日 上午11:19:11
     */
	public static boolean isNumeric(String valueStr) {
		if(StringUtils.isBlank(valueStr)){
			return false;
		}
		valueStr = StringUtils.trim(valueStr);
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(valueStr);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
}
