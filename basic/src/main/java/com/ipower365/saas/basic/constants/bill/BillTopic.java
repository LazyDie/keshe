package com.ipower365.saas.basic.constants.bill;

/**
 * 账单主题
 * 
 * @author Aron
 */
public enum BillTopic {
	ROOM(0, "客房"), HOUSE(1, "物业"), PLATFORM(2, "平台"), ELECTRICITY_OPERATION(3, "电费运营"), ASSET_OPERATION(4, "资产运营"), OTHERS(99, "其他");
	private Integer code;
	private String name;

	private BillTopic(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public static BillTopic get(Integer code) {
		for (BillTopic type : BillTopic.values()) {
			if (type.code.equals(code)) {
				return type;
			}
		}

		throw new IllegalArgumentException("无效类型码：" + code);
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}
