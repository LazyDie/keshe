package com.ipower365.boss.util.test;

import java.text.ParseException;
import java.util.UUID;

import org.apache.commons.lang3.ArrayUtils;

import com.ipower365.saas.util.DateUtil;
import com.ipower365.saas.util.JsonUtils;
import com.ipower365.saas.util.calendar.ChineseEra;
import com.ipower365.saas.util.calendar.LunarDate;
import com.ipower365.saas.util.calendar.SolarDate;

public class TestDate {

	
	public static void main(String[] args) {
		//阴历
		LunarDate lunardate=new LunarDate(2016,2,21);
		ChineseEra c= lunardate.toChineseEra();
		SolarDate solar= lunardate.toSolarDate();
		
		System.out.println(c.toString());
		System.out.println(solar.toString());
		System.out.println("农历==>"+lunardate.toString());
		System.out.println(lunardate.toDateStr()+"转换成公历==>"+solar.toString());
		
		System.out.println("-----------------------------");
		//阳历
		SolarDate sdate=new SolarDate(2016, 4, 15);
		LunarDate ldate= sdate.toLunarDate();
		System.out.println("-->"+sdate.toString());
		System.out.println(ldate.toString());
		System.out.println(ldate.toDateStr());
		System.out.println(ldate.toDate());
		System.out.println(sdate.toWeek().toString());
		System.out.println(ldate.toWeek().toString());
		
		System.out.println("============================");
		try {
			System.out.println(DateUtil.parse("yyyyMMdd", "19900909"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(UUID.randomUUID().toString()
				);
		int index=0;
		Integer[] ids=new Integer[3];
		for(int i=0;i<ids.length;i++)
			ids[index++]=i;
		System.out.println(JsonUtils.toJson(ids));
		Integer[] testIds=new Integer[]{1,2,3,4,5};
		ArrayUtils.remove(testIds, 4);
		System.out.println(JsonUtils.toJson(testIds));
		
	}
}
