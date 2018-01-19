package com.ipower365.saas.basic.constants;

/**
 * 支付渠道
 * 
 * @author kevin
 */
public enum PaymentChannel {
	ali(0, "支付宝"), wechat(1, "微信"), yee(2, "易宝"), manually(3, "手工入账"), balance(4, "账户余额"), discountvoucher(5, "折扣券"), tokenvoucher(6, "抵用券"), valuablevoucher(7, "有价证券"), credit(8, "积分"),
	predeposit(9, "预付费"), operatingaccount(10, "运营帐户"), direct(11, "直付"), injia(11, "赢家"),cash(12,"现金");

	private int code;
	private String name;

	private PaymentChannel(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static PaymentChannel getChannel(Integer code) {
		if (null == code)
			return null;
		for (PaymentChannel c : PaymentChannel.values()) {
			if (c.code == code)
				return c;
		}
		throw new IllegalArgumentException("没找到匹配的支付渠道：" + code);
	}

}
