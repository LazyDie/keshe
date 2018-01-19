package com.ipower365.saas.basic.constants;

public enum PaymentStatus {

	TRADE_SUCCESS(0, "成功"), 
	TRADE_FAIL(1, "失败"), 
	TRADE_FINISHED(2, "结束"), 
	WAIT_BUYER_PAY(3, "待付款"), 
	TRADE_CLOSED(4, "关闭"), 
	TRADE_NOTFULLY_SUCCESS(5, "部分成功"), 
	TRADE_DOING(6, "处理中"), 
	BANNED(7,"禁止支付");
	
	private Integer code;
	private String name;

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	private PaymentStatus(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public static PaymentStatus getPaymentStatus(Integer code) {
		for (PaymentStatus status : PaymentStatus.values()) {
			if (status.getCode().equals(code))
				return status;
		}
		throw new IllegalArgumentException("没匹配到对应的支付状态：" + code);
	}

	public static PaymentStatus getPaymentStatusByName(String name) {
		for (PaymentStatus status : PaymentStatus.values()) {
			if (status.name().equals(name))
				return status;
		}
		throw new IllegalArgumentException("没匹配到对应的支付状态：" + name);
	}

	/**
	 * 和支付平台约定，放款只返回TRADE_SUCCESS和TRADE_FAIL，该方法提供这状态和放款状态的映射
	 * 
	 * @param transferOutStatus
	 * @return
	 */
	public static PaymentStatus getPaymentStatus(UnovoTranferOutApplicationStatus transferOutStatus) {
		if (transferOutStatus.equals(UnovoTranferOutApplicationStatus.TransferOutDone)) {
			return PaymentStatus.TRADE_SUCCESS;
		}

		if (transferOutStatus.equals(UnovoTranferOutApplicationStatus.TransferOutFailed)) {
			return PaymentStatus.TRADE_FAIL;
		}

		if (transferOutStatus.equals(UnovoTranferOutApplicationStatus.NotFullyTransferOut)) {
			return PaymentStatus.TRADE_NOTFULLY_SUCCESS;
		}

		return PaymentStatus.TRADE_FAIL;
	}
	
	/**
	 * @Title: getPaidStatus 
	 * @Description: 获取账单已支付状态
	 * @return Integer[]
	 * @Author: Shuaibing.zhao 
	 * @Date: 2017年7月28日 下午7:59:15
	 */
	public static Integer[] getPaidStatus(){
		return new Integer[]{TRADE_SUCCESS.getCode(), TRADE_CLOSED.getCode()};
	}
	
	/**
	 * @Title: getNotPaidStatus 
	 * @Description: 获取账单未支付状态
	 * @return Integer[]
	 * @Author: Shuaibing.zhao 
	 * @Date: 2017年7月28日 下午7:59:33
	 */
	public static Integer[] getNotPaidStatus(){
		return new Integer[]{TRADE_FAIL.getCode(), WAIT_BUYER_PAY.getCode(), TRADE_NOTFULLY_SUCCESS.getCode(), TRADE_DOING.getCode()};
	}
	
	/**
	 * @Title: getAllPaymentStatus 
	 * @Description: 获取排除2：结束，7：禁止支付，账单支付状态
	 * @return Integer[]
	 * @Author: Shuaibing.zhao 
	 * @Date: 2017年7月28日 下午8:04:23
	 */
	public static Integer[] getAllPaymentStatus(){
		return new Integer[]{TRADE_SUCCESS.getCode(), TRADE_CLOSED.getCode(), TRADE_FAIL.getCode(), WAIT_BUYER_PAY.getCode(), TRADE_NOTFULLY_SUCCESS.getCode(), TRADE_DOING.getCode()};
	}
}
