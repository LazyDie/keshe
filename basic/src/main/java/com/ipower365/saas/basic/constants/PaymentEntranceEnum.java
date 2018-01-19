package com.ipower365.saas.basic.constants;

public enum PaymentEntranceEnum {
	APP(0, "移动端"), WEB(1, "PC端"),SYSTEM(2,"系统");
	private Integer code;
	private String name;

	private PaymentEntranceEnum(Integer code, String name) {
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

	public static PaymentEntranceEnum get(Integer code) {
		for (PaymentEntranceEnum e : PaymentEntranceEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
