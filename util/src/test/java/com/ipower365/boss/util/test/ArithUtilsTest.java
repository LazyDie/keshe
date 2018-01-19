package com.ipower365.boss.util.test;

import org.junit.Assert;
import org.junit.Test;

import com.ipower365.saas.util.ArithUtils;

public class ArithUtilsTest {
	@Test
	public void arithUtilsTest() {
		Double v1 = 1.21;
		Double v2 = 2.12;
		double add = ArithUtils.add(v1, v2);
		Assert.assertEquals(3.33, add, 0);
		double sub = ArithUtils.sub(v1, v2);
		Assert.assertEquals(-0.91, sub, 0);
		double mul = ArithUtils.mul(v1, v2);
		Assert.assertEquals(2.5652, mul, 0);
		double div = ArithUtils.div(v1, v2);
		Assert.assertEquals(0.5707547170, div, 0);
		double returnMax = ArithUtils.returnMax(v1, v2);
		Assert.assertEquals(2.12, returnMax, 0);
		double returnMin = ArithUtils.returnMin(v1, v2);
		Assert.assertEquals(1.21, returnMin, 0);
		double round = ArithUtils.round(mul, 2);
		Assert.assertEquals(2.57, round, 0);
		int compareTo = ArithUtils.compareTo(v1, v2);
		Assert.assertEquals(-1, compareTo, 0);
		float convertsToFloat = ArithUtils.convertsToFloat(v1);
		Assert.assertEquals(1.2100000381469727, convertsToFloat, 0);
		int convertsToInt = ArithUtils.convertsToInt(v1);
		Assert.assertEquals(1, convertsToInt, 0);
		long convertsToLong = ArithUtils.convertsToLong(v1);
		Assert.assertEquals(1, convertsToLong, 0);
		double div2 = ArithUtils.div(v1, v2, 2);
		Assert.assertEquals(0.57, div2, 0);
		Long formatNumber = ArithUtils.formatNumber(1568.2451111);
		Assert.assertEquals(15682451, formatNumber, 0);
		Double parseNumber = ArithUtils.parseNumber(-13883615000l);
		Assert.assertEquals(-1388361.5000, parseNumber, 0);
		Long formatNumber2 = ArithUtils.formatNumber("-1568.2451111");
		Assert.assertEquals(-15682451, formatNumber2, 0);
		String parseNumberToString = ArithUtils.parseNumberToString(13883615000l);
		Assert.assertEquals("1388361.5", parseNumberToString);
		Long formatNumber3 = ArithUtils.formatNumber("ss");
		Assert.assertEquals(15682451, formatNumber3, 0);
	}

}
