package com.ipower365.saas.util.calendar;

import java.text.ParseException;
import java.util.Date;

import com.ipower365.saas.util.DateUtil;

/**
 * 
* @ProjectName : 公寓系统-util
* @ClassName: LunarDate 
* @Description: 阴历日期类,继承自定义日期类
* @author liwh 
* @date 2015年10月12日 下午8:37:11 
*
 */
public class LunarDate extends DateBase {
	private String sChineseNum[] = { "零", "一", "二", "三", "四", "五",
			"六", "七", "八", "九", "十" };

	private static int checkMonth(int iYear, int iMonth) {
		if ((iMonth > 12) && (iMonth == CalendarUtil.iGetLLeapMonth(iYear) + 12)) {
			return iMonth;
		} else if (iMonth > 12) {
			System.out.println(" Month out of range, I think you want 12 :) ");
			return 12;
		} else if (iMonth < 1) {
			System.out.println(" Month out of range, I think you want 1 :) ");
			return 1;
		} else
			return iMonth;
	}

	private static int checkDay(int iYear, int iMonth, int iDay) {
		int iMonthDays = CalendarUtil.iGetLMonthDays(iYear, iMonth);
		if (iDay > iMonthDays) {
			System.out.println(" Day out of range, I think you want  "
					+ iMonthDays + "  :) ");
			return iMonthDays;
		} else if (iDay < 1) {
			System.out.println(" Day out of range, I think you want 1 :) ");
			return 1;
		} else
			return iDay;
	}

	public LunarDate(int iYear, int iMonth, int iDay) {
		super(iYear);
		this.iMonth = checkMonth(this.iYear, iMonth);
		this.iDay = checkDay(this.iYear, this.iMonth, iDay);
	}

	public LunarDate(int iYear, int iMonth) {
		super(iYear);
		this.iMonth = checkMonth(this.iYear, iMonth);
	}

	public LunarDate(int iYear) {
		super(iYear);
	}

	public LunarDate() {
		super();
	}
	
	/**
	 * 返回字符串类型的农历  yyyy-MM-dd
	 * @return
	 */
	public String toDateStr(){
		return "" + this.iYear
		+ (this.iMonth > 9 ? "-" + this.iMonth : "-0" + this.iMonth)
		+ (this.iDay > 9 ? "-" + this.iDay : "-0" + this.iDay);
	}
	
	/**
	 * 返回 Date类型的农历
	 * @return
	 */
	public Date toDate(){
		
		String datestr=toDateStr();
		try {
			return DateUtil.parse("yyyy-MM-dd", datestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 返回中文农历 比如：农历一九九零(庚午)年 九月 初九
	 */
	public String toString() {
		String sCalendar = "农历";
		sCalendar += sChineseNum[iYear / 1000]
				+ sChineseNum[iYear % 1000 / 100]
				+ sChineseNum[iYear % 100 / 10] + sChineseNum[iYear % 10]
				+ "(" + toChineseEra() + ")年 ";
		if (iMonth > 12) {
			iMonth -= 12;
			sCalendar += "闰";
		}
		if (iMonth == 12)
			sCalendar += "腊月";
		else if (iMonth == 11)
			sCalendar += "冬月";
		else if (iMonth == 1)
			sCalendar += " 正月 ";
		else
			sCalendar += sChineseNum[iMonth] + "月 ";
		if (iDay > 29)
			sCalendar += "三十";
		else if (iDay > 20)
			sCalendar += "二十" + sChineseNum[iDay % 20];
		else if (iDay == 20)
			sCalendar += "二十";
		else if (iDay > 10)
			sCalendar += "十" + sChineseNum[iDay % 10];
		else
			sCalendar += "初" + sChineseNum[iDay];

		return sCalendar;
	}

	public CnWeek toWeek() {
		int iOffsetDays = 0;
		for (int i = 1901; i < iYear; i++)
			iOffsetDays += CalendarUtil.iGetLYearDays(i);

		iOffsetDays += CalendarUtil.iGetLNewYearOffsetDays(iYear, iMonth, iDay);
		return new CnWeek((iOffsetDays + 2) % 7);
	}

	/**
	 * 当前农历转换成中文农历日期-年份
	 * @return
	 */
	public ChineseEra toChineseEra() {
		return new ChineseEra(iYear);
	}

	/**
	 * 当前农历转换成阳历日期
	 * @return
	 */
	public SolarDate toSolarDate() {
		int iYear, iMonth, iDay, iDate;
		SolarDate sd;
		iDate = Integer.parseInt(CalendarUtil.sCalendarLundarToSolar(this.iYear,
				this.iMonth, this.iDay));
		iYear = iDate / 10000;
		iMonth = iDate % 10000 / 100;
		iDay = iDate % 100;
		sd = new SolarDate(iYear, iMonth, iDay);
		return sd;
	}
}
