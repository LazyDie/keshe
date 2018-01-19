package com.ipower365.saas.basic.constants.custom;

public enum CustomSexTypeEnum {
	
	Male("1048001", "男"), 
	Female("1048002", "女")
	;
	
	private String code;
	private String name;
	
	private CustomSexTypeEnum(String code,String name){
		this.code=code;
		this.name=name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static CustomSexTypeEnum getCustomSexTypeDesc(String code) {
        if (null == code) return null;
        for (CustomSexTypeEnum c : CustomSexTypeEnum.values()) {
            if (c.code.equals(code)) return c;
        }
        throw new IllegalArgumentException("没找到匹配的类型：" + code);
    }
	
	public static CustomSexTypeEnum getCustomSexTypeCode(String name) {
        if (null == name) return null;
        for (CustomSexTypeEnum c : CustomSexTypeEnum.values()) {
            if (c.name.equals(name)) return c;
        }
        throw new IllegalArgumentException("没找到匹配的类型：" + name);
    }
	
}
