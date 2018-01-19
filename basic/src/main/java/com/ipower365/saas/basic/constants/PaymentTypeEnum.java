package com.ipower365.saas.basic.constants;

public enum PaymentTypeEnum {
	SELF(0, "自付"), OTHER_PERSON(1, "个人代付"), OTHER_COMPANY(2, "企业代付");
	private Integer code;
	private String name;

	private PaymentTypeEnum(Integer code, String name) {
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

	public static PaymentTypeEnum get(Integer code) {
		for (PaymentTypeEnum e : PaymentTypeEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
