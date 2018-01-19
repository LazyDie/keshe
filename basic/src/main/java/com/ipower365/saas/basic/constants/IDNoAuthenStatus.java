package com.ipower365.saas.basic.constants;

public enum IDNoAuthenStatus {
	UnAuthen(0,"未认证"),Authened(1,"已认证"),SystemAuthened(2,"认证中")
	,AuthenRefuse(3,"认证拒绝")
	;
	
	
	private Integer code;
	private String name;
	
	private IDNoAuthenStatus(Integer code,String name){
		this.code=code;
		this.name=name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static IDNoAuthenStatus getAuthenStatus(Integer code) {
        if (null == code) return null;
        for (IDNoAuthenStatus c : IDNoAuthenStatus.values()) {
            if (c.code.intValue() == code.intValue()) return c;
        }
//        return null;
        throw new IllegalArgumentException("没找到匹配的状态：" + code);
    }
}
