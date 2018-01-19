package com.ipower365.saas.basic.constants.bill;

public enum BillSourceTypeEnum {
	SYSTEM(0, "系统自动创建"), MANUAL(1, "手动创建");
	private Integer code;
	private String name;

	private BillSourceTypeEnum(Integer code, String name) {
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

	public static BillSourceTypeEnum get(Integer code) {
		for (BillSourceTypeEnum e : BillSourceTypeEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
