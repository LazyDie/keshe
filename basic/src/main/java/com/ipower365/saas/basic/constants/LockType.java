package com.ipower365.saas.basic.constants;

public enum LockType {
	BOSS(1, "联寓"), SCIENER(2, "科技侠"), NLOCK(3, "800门锁"), ZELKOVA(4, "榉树"), DDING(5, "丁盯");
	private Integer code;
	private String name;

	private LockType(Integer code, String name) {
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

	public static LockType getByCode(Integer code) {
		if (code == null) {
			return null;
		}
		LockType[] types = LockType.values();
		for (LockType type : types) {
			if (type.getCode().intValue() == code) {
				return type;
			}
		}
		return null;
	}

	public static boolean canBeLocked(Integer code) {
		if (code == null)
			return false;
		LockType type = getByCode(code);
		if (type == null) {
			return false;
		}
		switch (type) {
		case NLOCK:
			return true;
		default:
			break;
		}
		return false;
	}
}
