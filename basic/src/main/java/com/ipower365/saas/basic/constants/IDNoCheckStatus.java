package com.ipower365.saas.basic.constants;

public enum IDNoCheckStatus {
	UnAuthen(0,"未认证"),Authened(1,"已通过"),Authening(2,"审核中"),
	AuthenRefuse(3,"已拒绝"),AuthenCancel(4,"取消认证"),Invalid(10,"无效")
	;
	
	
	private Integer code;
	private String name;
	
	private IDNoCheckStatus(Integer code,String name){
		this.code=code;
		this.name=name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static IDNoCheckStatus getCheckStatus(Integer code) {
        if (null == code) return null;
        for (IDNoCheckStatus c : IDNoCheckStatus.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的审批状态：" + code);
    }

}
