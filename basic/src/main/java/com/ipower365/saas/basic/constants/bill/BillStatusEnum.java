package com.ipower365.saas.basic.constants.bill;

public enum BillStatusEnum {
	EXAMINING(0, "待审核"), APPROVED(1, "审核通过"), DENIED(2, "拒绝");
	private Integer code;
	private String name;

	private BillStatusEnum(Integer code, String name) {
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

	public static BillStatusEnum get(Integer code) {
		for (BillStatusEnum e : BillStatusEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
