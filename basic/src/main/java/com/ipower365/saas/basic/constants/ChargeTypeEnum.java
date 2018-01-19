package com.ipower365.saas.basic.constants;

public enum ChargeTypeEnum {
	PERIOD(0, "周期"), ONCE(1, "一次");

	private Integer code;
	private String name;

	private ChargeTypeEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ChargeTypeEnum get(Integer code) {
		for (ChargeTypeEnum e : ChargeTypeEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项,code:" + code);
	}

}
