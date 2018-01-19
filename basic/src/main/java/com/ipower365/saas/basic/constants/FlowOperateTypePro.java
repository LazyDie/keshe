package com.ipower365.saas.basic.constants;

public enum FlowOperateTypePro {

	Request("1038001","request"), 
	Claim("1038002","sure"),
	Start("1038003","start"),
	Finish("1038006","finish"),
	Transfer("1038008","transfer"),
	Return("1038004","return"),
	Cancel("1038005","cancel"),
	Close("1038007","close");

	private String code;
	private String name;

	FlowOperateTypePro(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public static FlowOperateTypePro get(String code) {
		for (FlowOperateTypePro type : FlowOperateTypePro.values()) {
			if (type.code.equals(code)) {
				return type;
			}
		}

		throw new IllegalArgumentException("无效编码：" + code);
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
