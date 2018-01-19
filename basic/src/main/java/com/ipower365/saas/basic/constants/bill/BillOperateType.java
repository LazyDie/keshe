package com.ipower365.saas.basic.constants.bill;

public enum BillOperateType {
	
	Payment("PAYMENT","支付"),
	Revise("REVISE","修正"),
	Abolish("ABOLISH","废止")
	;
	

	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	BillOperateType(String code,String name){
		this.code=code;
		this.name=name;
	}
	
	public static BillOperateType get(String code){
		for (BillOperateType e : BillOperateType.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}
	
}
