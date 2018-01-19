package com.ipower365.saas.basic.constants;

public enum SettlementStatusEnum {
	DONT_NEED(0, "无需结算"), NEED(1, "需要结算"), DONE(2, "已结算");
	private Integer code;
	private String name;

	private SettlementStatusEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static SettlementStatusEnum get(Integer code) {
		for (SettlementStatusEnum e : SettlementStatusEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
