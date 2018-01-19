package com.ipower365.saas.basic.constants;

public enum FrozenStatusEnum {
	NORMAL(0, "正常"), FROZEN(1, "冻结");
	private Integer code;
	private String name;

	private FrozenStatusEnum(Integer code, String name) {
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

	public static FrozenStatusEnum get(Integer code) {
		for (FrozenStatusEnum e : FrozenStatusEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
