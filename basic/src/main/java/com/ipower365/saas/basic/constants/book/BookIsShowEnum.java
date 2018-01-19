package com.ipower365.saas.basic.constants.book;

/**
 * 标示账本流水是否显示在UI
 * 
 * @ProjectName: BOOK
 * @ClassName: BookIsShowEnum.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年4月8日 下午2:42:09
 */
public enum BookIsShowEnum {
	BOOK_IS_SHOW_YES(1, "显示账本流水"), BOOK_IS_SHOW_NO(0, "不显示账本流水");
	private Integer code;
	private String name;

	private BookIsShowEnum(Integer code, String name) {
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

	public static BookIsShowEnum get(Integer code) {
		for (BookIsShowEnum e : BookIsShowEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
}
