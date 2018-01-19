package com.ipower365.boss.util.test;

import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;

import com.ipower365.saas.util.StringUtil;


public class TestChineseSort {
	public static void main(String[] args) {

		Set<String> x = new TreeSet<String>(StringUtil.getComparator());
		x.add("1");
		x.add("2");
		x.add("3");
		x.add("4");
		x.add("上海");
		x.add("挚慧");
		x.add("电源");
		x.add("科技");
		x.add("有限");

		for (String s : x) {
			System.out.println(s);
		}

		TimeZone z = TimeZone.getDefault();
		System.out.println(z);
		
		Locale e = Locale.forLanguageTag("zh");
		e= new Locale("zh_TW");
		System.out.println(e);
		for(Locale l:Locale.getAvailableLocales()){

			System.out.println(l);
			System.out.println(l.getLanguage());
			System.out.println(l.getDisplayLanguage());
			System.out.println(l.getDisplayName());
		}
//		l=Locale.getDefault();
		System.out.println(Locale.getAvailableLocales().length);
		
		System.out.println(StringUtil.localeFromString("zh_TW"));
	}

}
