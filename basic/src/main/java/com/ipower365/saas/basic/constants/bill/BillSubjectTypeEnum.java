package com.ipower365.saas.basic.constants.bill;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 账单科目分类<br>
 * 租金:RENT<br>
 * 押金:FOREGIFT<br>
 * 定金:EARNEST<br>
 * 资源:RESOURCE<br>
 * 服务:SERVICE_CHARGE<br>
 * 手续费:POUNDAGE<br>
 * 违约金:LIQUIDATED_DAMAGES<br>
 * 滞纳金:LATE_FEE<br>
 * 赔偿金:INDEMNITY<br>
 * 充值:RECHARGE<br>
 * 提现:WITHDRAW_CASH<br>
 * 退款:REFUND<br>
 * 纠错:CORRECTION<br>
 * 结算:SETTLEMENT<br>
 * 交割:DELIVERY<br>
 * 分利:BENEFITS<br>
 * 装修:DECORATION<br>
 * 预付费:PREPAYMENT<br>
 * 分账:ACCOUNT_DIVIDED<br>
 * 
 * @author kevin
 *
 */
public enum BillSubjectTypeEnum {
	RENT("RENT_"), FOREGIFT("FOREGIFT_"), EARNEST("EARNEST_"), RESOURCE("RESOURCE_"), SERVICE_CHARGE(
			"SERVICE_CHARGE_"), POUNDAGE("POUNDAGE_"), LIQUIDATED_DAMAGES("LIQUIDATED_DAMAGES_"), LATE_FEE(
					"LATE_FEE_"), INDEMNITY("INDEMNITY_"), RECHARGE("RECHARGE_"), WITHDRAW_CASH(
							"WITHDRAW_CASH_"), REFUND("REFUND_"), CORRECTION("CORRECTION_"), SETTLEMENT(
									"SETTLEMENT_"), DELIVERY("DELIVERY_"), BENEFITS("BENEFITS_"), DECORATION(
											"DECORATION_"), PREPAYMENT(
													"PREPAYMENT_"), ACCOUNT_DIVIDED("ACCOUNT_DIVIDED_");

	private String prefix;

	private BillSubjectTypeEnum(String prefix) {
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}

	public static BillSubjectTypeEnum get(String code) {
		for (BillSubjectTypeEnum e : BillSubjectTypeEnum.values()) {
			if (e.getPrefix().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}

	public static Map<String, String> getBillSubjectTypes() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put(BillSubjectTypeEnum.RENT.getPrefix(), "租金");
		map.put(BillSubjectTypeEnum.FOREGIFT.getPrefix(), "押金");
		map.put(BillSubjectTypeEnum.EARNEST.getPrefix(), "定金");
		map.put(BillSubjectTypeEnum.RESOURCE.getPrefix(), "资源");
		map.put(BillSubjectTypeEnum.SERVICE_CHARGE.getPrefix(), "服务");
		map.put(BillSubjectTypeEnum.POUNDAGE.getPrefix(), "手续费");
		map.put(BillSubjectTypeEnum.LIQUIDATED_DAMAGES.getPrefix(), "违约金");
		map.put(BillSubjectTypeEnum.LATE_FEE.getPrefix(), "滞纳金");
		map.put(BillSubjectTypeEnum.INDEMNITY.getPrefix(), "赔偿金");
		map.put(BillSubjectTypeEnum.RECHARGE.getPrefix(), "充值");
		map.put(BillSubjectTypeEnum.WITHDRAW_CASH.getPrefix(), "提现");
		map.put(BillSubjectTypeEnum.REFUND.getPrefix(), "退款");
		map.put(BillSubjectTypeEnum.CORRECTION.getPrefix(), "纠错");
		map.put(BillSubjectTypeEnum.SETTLEMENT.getPrefix(), "结算");
		map.put(BillSubjectTypeEnum.DELIVERY.getPrefix(), "交割");
		map.put(BillSubjectTypeEnum.BENEFITS.getPrefix(), "分利");
		map.put(BillSubjectTypeEnum.DECORATION.getPrefix(), "装修");
		map.put(BillSubjectTypeEnum.PREPAYMENT.getPrefix(), "预付费");
		return map;
	}

	public static BillSubjectEnum[] RENT_BILLSUBJECTS = { BillSubjectEnum.RENT_ROOM, BillSubjectEnum.RENT_SERVICE,
			BillSubjectEnum.RENT_PROPERTY_MANAGEMENT_FEE, BillSubjectEnum.RENT_PARKING_FEE, BillSubjectEnum.RENT_BED,
			BillSubjectEnum.RENT_GARBAGE, BillSubjectEnum.RENT_MAINTENANCE, BillSubjectEnum.FOREGIFT_RENT,
			BillSubjectEnum.FOREGIFT_RESOURCE, BillSubjectEnum.FOREGIFT_INTELLIGENT_DEVICE,
			BillSubjectEnum.EARNEST_MONEY_RENT, BillSubjectEnum.RESOURCE_WIFI_FEE,
			BillSubjectEnum.SERVICE_CHARGE_CLEANING, BillSubjectEnum.SERVICE_CHARGE_REPAIR,
			BillSubjectEnum.RENT_UTILITIES_FEE,BillSubjectEnum.RENT_POUNDAGE_FEE};

	public static List<String> listRentBillSubjects() {
		List<String> results = new ArrayList<>(RENT_BILLSUBJECTS.length);
		for (BillSubjectEnum sbj : RENT_BILLSUBJECTS) {
			results.add(sbj.getCode());
		}
		results.add(BillSubjectEnum.FINE.getCode());
		return results;
	}
	public static void main(String[] args) {
		List<String> results = new ArrayList<>(RENT_BILLSUBJECTS.length);
		for (BillSubjectEnum sbj : RENT_BILLSUBJECTS) {
			results.add(sbj.getName());
		}
		int i=0;
		for(String v:results){
			i++;
			System.out.println(i+":"+v);
		}
	}
}
