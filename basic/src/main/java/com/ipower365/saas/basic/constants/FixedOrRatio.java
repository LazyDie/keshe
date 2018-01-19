package com.ipower365.saas.basic.constants;

public enum FixedOrRatio {

	fixed("1", "固定值"), ratio("2", "比例");

	private String code;
	private String desc;

	private FixedOrRatio(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static FixedOrRatio getType(String code) {
		for (FixedOrRatio t : FixedOrRatio.values()) {
			if (t.getCode().equals(code))
				return t;
		}
		throw new IllegalArgumentException("没有匹配的枚举项：" + code);
	}

}
