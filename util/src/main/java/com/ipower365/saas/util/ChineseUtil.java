package com.ipower365.saas.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class ChineseUtil {
	public static String getPingYin(String src) {

		char[] t1 = null;
		t1 = src.toCharArray();
		String[] t2 = new String[t1.length];
		HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();

		t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		t3.setVCharType(HanyuPinyinVCharType.WITH_V);
		String t4 = "";
		int t0 = t1.length;
		try {
			for (int i = 0; i < t0; i++) {
				// 判断是否为汉字字符
				if (java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
					t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
					t4 += t2[0];
				} else
					t4 += java.lang.Character.toString(t1[i]);
			}
			// System.out.println(t4);
			return t4;
		} catch (BadHanyuPinyinOutputFormatCombination e1) {
			e1.printStackTrace();
		}
		return t4;
	}

	// 返回中文的首字母
	public static String getPinYinHeadChar(String str) {

		String convert = "";
		for (int j = 0; j < str.length(); j++) {
			char word = str.charAt(j);
			String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
			if (pinyinArray != null) {
				convert += pinyinArray[0].charAt(0);
			} else {
				convert += word;
			}
		}
		return convert;
	}

	// 将字符串转移为ASCII码
	public static String getCnASCII(String cnStr) {
		StringBuffer strBuf = new StringBuffer();
		byte[] bGBK = cnStr.getBytes();
		for (int i = 0; i < bGBK.length; i++) {
			strBuf.append(Integer.toHexString(bGBK[i] & 0xff));
		}
		return strBuf.toString();
	}

	// private static final String[] CHINESE_STR = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	private static final String[] CHINESE_STR = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
	// private static final String UNIT[] = new String[] { "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿" };
	private static final String UNIT[] = new String[] {"个", "十", "百", "千", "万", "十", "百", "千", "亿"};

	public static String toChinesNumber(int number) {
		String s = String.valueOf(number);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			String index = String.valueOf(s.charAt(i));
			sb = sb.append(CHINESE_STR[Integer.parseInt(index)]);
		}
		String sss = String.valueOf(sb);
		int i = 0;
		for (int j = sss.length(); j > 0; j--) {
			sb = sb.insert(j, UNIT[i++]);
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(getPingYin("綦江qq县"));
		System.out.println(getPinYinHeadChar("綦江县"));
		System.out.println(getCnASCII("綦江县"));

		System.out.println(toChinesNumber(0));
		System.out.println(toChinesNumber(3213));;

		System.out.println(toChinesNumber(912321321));;
	}


}
