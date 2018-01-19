package com.ipower365.saas.basic.constants;

public enum ReconciliationErrorType {
	PaymentPlatformLost(0, "系统有交易记录但第三方支付平台没交易记录"), SystemLost(1, "第三方支付平台有交易记录但系统无交易纪录"), TransferGTDeal(3, "第三方支付平台金额大于系统金额"), DealGTTransfer(4, "系统金额大于第三方支付平台金额"), SystemFailedStatusButUnovoSus(5,
			"状态不一致：第三方支付平台为失败状态，系统为成功状态"), SystemSusStatusButUnovoEFailed(6, "状态不一致：第三方支付平台为成功状态，系统为失败状态");
	private Integer code;
	private String name;

	private ReconciliationErrorType(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ReconciliationErrorType get(Integer code) {
		if (null == code)
			return null;
		for (ReconciliationErrorType c : ReconciliationErrorType.values()) {
			if (c.code == code)
				return c;
		}
		throw new IllegalArgumentException("没找到匹配的对账出错类型码：" + code);
	}
}
