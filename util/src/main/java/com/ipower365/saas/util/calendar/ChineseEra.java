package com.ipower365.saas.util.calendar;

/**
 * 
 * @ProjectName : 公寓系统-util
 * @ClassName: ChineseEra
 * @Description: 转换中文农历
 * @author liwh
 * @date 2015年10月12日 下午9:40:56
 *
 */
public class ChineseEra {
	int iYear;
	String[] sHeavenlyStems = { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸" };
	String[] sEarthlyBranches = { "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥" };

	public ChineseEra() {
	}

	public ChineseEra(int iYear) {
		if ((iYear < 2050) && (iYear > 1901))
			this.iYear = iYear;
		else
			this.iYear = 1981;
	}

	public String toString() {
		int temp;
		temp = Math.abs(iYear - 1924);
		return sHeavenlyStems[temp % 10] + sEarthlyBranches[temp % 12];
	}
}
