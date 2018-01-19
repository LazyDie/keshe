package com.ipower365.saas.util;

import static com.ipower365.saas.util.CommonUtil.isEmpty;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

/**
 * 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精确的浮点数运算，包括加减乘除和四舍五入。
 * 
 * @author kevin
 *
 */
public final class ArithUtils {
	public static ArithUtils getInstance() {
		return new ArithUtils();
	}

	// 默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;
	public static final int MULTIPLE = 10000;
	public static final int MULTIPLE_THOUND = 1000;
	public static final int TIME_THOUND = 60;
	private static final NumberFormat nf = NumberFormat.getInstance();

	private ArithUtils() {
	}

	/**
	 * 提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @return 两个参数的和
	 */
	public static Double add(Double v1, Double v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	public static Long add(Long v1, Long v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Long.toString(v1));
		BigDecimal b2 = new BigDecimal(Long.toString(v2));
		return b1.add(b2).longValue();
	}

	/**
	 * 提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @return 两个参数的差
	 */
	public static Double sub(Double v1, Double v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	public static Long sub(Long v1, Long v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Long.toString(v1));
		BigDecimal b2 = new BigDecimal(Long.toString(v2));
		return b1.subtract(b2).longValue();
	}

	/**
	 * 提供精确的乘法运算。
	 * 
	 * @param v1
	 *            被乘数
	 * @param v2
	 *            乘数
	 * @return 两个参数的积
	 */
	public static Double mul(Double v1, Double v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	public static Long mul(Long v1, Long v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Long.toString(v1));
		BigDecimal b2 = new BigDecimal(Long.toString(v2));
		return b1.multiply(b2).longValue();
	}

	/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 两个参数的商
	 */
	public static Double div(Double v1, Double v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		return div(v1, v2, DEF_DIV_SCALE);
	}

	public static Long div(Long v1, Long v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Long.toString(v1));
		BigDecimal b2 = new BigDecimal(Long.toString(v2));
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).longValue();
	}

	public static Double longDiv(Long v1, Long v2) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		BigDecimal b1 = new BigDecimal(Long.toString(v1));
		BigDecimal b2 = new BigDecimal(Long.toString(v2));
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static Double div(Double v1, Double v2, int scale) {
		if (isEmpty(v1) || isEmpty(v2))
			return null;
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供精确的小数位四舍五入处理。
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 * @return 四舍五入后的结果
	 */
	public static Double round(Double v, int scale) {
		if (isEmpty(v))
			return null;
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供精确的类型转换(Float)
	 * 
	 * @param v
	 *            需要被转换的数字
	 * @return 返回转换结果
	 */
	public static Float convertsToFloat(Double v) {
		if (isEmpty(v))
			return null;
		BigDecimal b = new BigDecimal(v);
		return b.floatValue();
	}

	/**
	 * 提供精确的类型转换(Int)不进行四舍五入
	 * 
	 * @param v
	 *            需要被转换的数字
	 * @return 返回转换结果
	 */
	public static Integer convertsToInt(Double v) {
		if (isEmpty(v))
			return null;
		BigDecimal b = new BigDecimal(v);
		return b.intValue();
	}

	/**
	 * 提供精确的类型转换(Long)
	 * 
	 * @param v
	 *            需要被转换的数字
	 * @return 返回转换结果
	 */
	public static Long convertsToLong(Double v) {
		if (isEmpty(v))
			return null;
		BigDecimal b = new BigDecimal(v);
		return b.longValue();
	}

	/**
	 * 返回两个数中大的一个值
	 * 
	 * @param v1
	 *            需要被对比的第一个数
	 * @param v2
	 *            需要被对比的第二个数
	 * @return 返回两个数中大的一个值
	 */
	public static Double returnMax(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.max(b2).doubleValue();
	}

	/**
	 * 返回两个数中小的一个值
	 * 
	 * @param v1
	 *            需要被对比的第一个数
	 * @param v2
	 *            需要被对比的第二个数
	 * @return 返回两个数中小的一个值
	 */
	public static Double returnMin(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.min(b2).doubleValue();
	}

	/**
	 * 精确对比两个数字
	 * 
	 * @param v1
	 *            需要被对比的第一个数
	 * @param v2
	 *            需要被对比的第二个数
	 * @return 如果两个数一样则返回0，如果第一个数比第二个数大则返回1，反之返回-1
	 */
	public static int compareTo(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.compareTo(b2);
	}

	/**
	 * 金额数字格式化，用于数据库存储<br>
	 * 
	 * @param d
	 * @param multiple
	 * @return Long 原值乘以multiple四舍五入取整
	 */
	public static Long formatNumber(Double d, int multiple) {
		if (CommonUtil.isEmpty(d))
			return null;
		return convertsToLong(round(mul(d, (double) multiple), 0));
	}

	/**
	 * 金额数字格式化，用于数据库存储<br>
	 * 
	 * @param d
	 * @return Long 原值乘以10000四舍五入取整
	 */
	public static Long formatNumber(Double d) {
		if (CommonUtil.isEmpty(d))
			return null;
		return formatNumber(d, MULTIPLE);
	}

	/**
	 * 金额数字格式化，用于数据库存储<br>
	 * 
	 * @param s
	 * @return Long 原值乘以10000四舍五入取整
	 */
	public static Long formatNumber(String s) {
		if (CommonUtil.isEmpty(s))
			return null;
		try {
			Double d = Double.parseDouble(s);
			return convertsToLong(round(mul(d, (double) MULTIPLE), 0));
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 金额数字格式化，用于数据库存储<br>
	 * 
	 * @param s
	 * @return Long 原值乘以10000四舍五入取整
	 */
	public static Long formatNumber(String s, int multiple) {
		if (CommonUtil.isEmpty(s))
			return null;
		try {
			Double d = Double.parseDouble(s);
			return convertsToLong(round(mul(d, (double) multiple), 0));
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 金额数字格式化，用于数据库存储<br>
	 * 
	 * @param s
	 * @return 原值乘以10000四舍五入取整
	 */
	public static Integer formatToInt(String s) {
		if (CommonUtil.isEmpty(s))
			return null;
		try {
			Double d = Double.parseDouble(s);
			return convertsToInt(round(mul(d, (double) MULTIPLE), 0));
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 数据库存储的金额数字解析还原
	 * 
	 * @param l
	 * @return Double 除以10000，保留2位小数
	 */
	public static Double parseNumber(Long l) {
		return parseNumber(l, 2);
	}

	/**
	 * 数据库存储的金额数字解析还原
	 * 
	 * @param l
	 * @return Long 除以10000，保留2位小数
	 */
	public static Long parseNumberToLong(Long l) {
		return convertsToLong(parseNumber(l, 2));
	}

	/**
	 * 数据库存储的金额数字解析还原
	 * 
	 * @param l
	 * @return String 除以10000，保留2位小数
	 */
	public static String parseNumberToString(Long l) {
		Double result = parseNumber(l, 2);
		if (result == null) {
			return StringUtils.EMPTY;
		}
		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");
		return df.format(result.doubleValue());
		// return String.valueOf(result);
	}

	public static String parseDoubleToString(Double l) {
		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");
		return df.format(l);
	}

	public static String parseDoubleToString(Double l, Integer scale) {
		if (l == null)
			return StringUtils.EMPTY;
		StringBuffer format = new StringBuffer("#0");
		if (scale != null && scale > 0) {
			format.append(".");
			for (int i = 0; i < scale; i++)
				format.append("0");
		}
		java.text.DecimalFormat df = new java.text.DecimalFormat(format.toString());
		return df.format(l);
	}

	public static String parseIntToString(Integer l) {
		Double result = parseNumber(l, 2);
		if (result == null) {
			return StringUtils.EMPTY;
		}
		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");
		return df.format(result.doubleValue());
		// return String.valueOf(result);
	}

	/**
	 * 将string格式的金额数字 除以10000，保留两位小数
	 * 
	 * @param l
	 * @return
	 */
	public static String parseStringNumber(String l) {
		if (CommonUtil.isNotEmpty(l)) {
			Long ln = Long.parseLong(l);
			return parseNumberToString(ln);
		}
		return null;
	}

	/**
	 * 数据库存储的金额数字解析还原，自定义小数位数
	 * 
	 * @param l
	 *            原值
	 * @param scale
	 *            小数位数
	 * @return Double 除以10000，保留scale位小数
	 */
	public static Double parseNumber(Long l, int scale) {
		if (CommonUtil.isEmpty(l))
			return null;
		return div((double) l, (double) MULTIPLE, scale);
	}

	/**
	 * 数据库存储的金额数字解析还原，自定义小数位数
	 * 
	 * @param l
	 *            原值
	 * @param scale
	 *            小数位数
	 * @return Double 除以10000，保留scale位小数
	 */
	public static Double parseNumber(Integer l, int scale) {
		if (CommonUtil.isEmpty(l))
			return null;
		return div((double) l, (double) MULTIPLE, scale);
	}

	/**
	 * 数据库存储的金额数字解析还原，自定义小数位数
	 * 
	 * @param l
	 *            原值
	 * @param scale
	 *            小数位数
	 * @return Double 除以multiple，保留scale位小数
	 */
	public static Double parseNumber(Long l, int multiple, int scale) {
		if (CommonUtil.isEmpty(l))
			return null;
		return div((double) l, (double) multiple, scale);
	}

	/**
	 * 数字转字符串（四舍五入）
	 * 
	 * @param value
	 *            原数字
	 * @param scale
	 *            小数位数
	 * @return
	 */
	public static String format(Number value, int scale) {
		return format(value, scale, false, RoundingMode.HALF_UP);
	}

	/**
	 * 数字转字符串
	 * 
	 * @param value
	 *            原数字
	 * @param scale
	 *            小数位数
	 * @param groupingUsed
	 *            是否带千分位
	 * @param roundingMode
	 *            保留小数方式
	 * @return
	 */
	public static String format(Number value, int scale, boolean groupingUsed, RoundingMode roundingMode) {
		if (null == value)
			return null;
		nf.setGroupingUsed(groupingUsed);
		nf.setMaximumFractionDigits(scale);
		nf.setMinimumFractionDigits(scale);
		nf.setRoundingMode(roundingMode);
		try {
			return nf.format(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 直接在前端显示
	 * 
	 * @param value
	 * @param scale
	 * @return
	 */
	public static String format2v(Number value, int scale) {
		return format(value, scale, true, RoundingMode.HALF_UP);
	}

	public static void main(String[] args) {
		// System.out.println(format(32132463634643.0446d, 2, false,
		// RoundingMode.HALF_UP));
		for (int i = 0; i < 40; i++) {
			System.out.println("length=" + i + ",value=" + getFixedLenthRandomNumber(i));
		}
	}

	/**
	 * 固定位数随机数
	 * 
	 * @param length
	 * @return
	 */
	public static String getFixedLenthRandomNumber(int length) {
		if (length < 1)
			return "";
		char[] cs = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		Random rm = new Random();
		long nextLong = Math.abs(rm.nextLong());
		StringBuffer sb = new StringBuffer(nextLong + "");
		if (sb.length() >= length)
			return sb.toString().substring(0, length);
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < length - sb.length(); i++) {
			sb1.append(cs[rm.nextInt(10)]);
		}
		sb1.append(sb);
		return sb1.toString();
	}

}
