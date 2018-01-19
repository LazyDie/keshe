package com.ipower365.saas.basic.constants.bill;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 账单子科目科目<br>
 * 租金:RENT_*<br>
 * 押金:FOREGIFT_*<br>
 * 定金:EARNEST_*<br>
 * 资源:RESOURCE_*<br>
 * 服务:SERVICE_CHARGE_*<br>
 * 手续费:POUNDAGE_*<br>
 * 违约金:LIQUIDATED_DAMAGES_*<br>
 * 滞纳金:LATE_FEE_*<br>
 * 赔偿金:INDEMNITY_*<br>
 * 充值:RECHARGE_*<br>
 * 提现:WITHDRAW_CASH_*<br>
 * 退款:REFUND_*<br>
 * 纠错:CORRECTION_*<br>
 * 结算:SETTLEMENT_*<br>
 * 交割:DELIVERY_*<br>
 * 分利:BENEFITS_*<br>
 * 装修:DECORATION_*<br>
 * 预付费:PREPAYMENT_*<br>
 * 分账:ACCOUNT_DIVIDED_*<br>
 * 
 * @author kevin
 */
public enum BillSubSubjectEnum {
	RENT_ROOM("1000000", "房屋租金"), RENT_ASSETS("1000100", "资产租金"), RENT_SERVICE("1000200", "服务费"), RENT_PROPERTY_MANAGEMENT_FEE("1000300", "物业费"), RENT_PARKING_FEE("1000400", "停车费"), RENT_BED("1000500", "床位费"), RENT_GARBAGE("1000600", "垃圾清运费"), RENT_MAINTENANCE("1000700", "维护费"),RENT_UTILITIES_FEE("1000800","公共事业费"),RENT_POUNDAGE_FEE("1000900","手续费"), RENT_OTHERS("1009900", "其他租金"), FOREGIFT_RENT("1010000", "租金押金"), FOREGIFT_ASSETS(
			"1010100", "资产押金"),FOREGIFT_RESOURCE("1010200", "水电煤押金"),FOREGIFT_INTELLIGENT_DEVICE("1010300", "智能设备押金"), FOREGIFT_OTHERS("1019900", "其他押金"), EARNEST_MONEY_RENT("1020000", "租金定金"), EARNEST_MONEY_OTHERS("1029900", "其他定金"), RESOURCE_WATER_RATE("1030000", "冷水"), RESOURCE_WATER_RATE_SHARED("1030001", "公摊冷水"), RESOURCE_HOT_WATER_RATE("1030002", "热水"), RESOURCE_HOT_WATER_RATE_SHARED(
			"1030003", "公摊热水"), RESOURCE_PURIFIED_WATER_RATE("1030004", "纯净水"), RESOURCE_WATER_RATE_OTHERS("1030099", "其他水费"), RESOURCE_POWER_RATE("1030100", "电费"), RESOURCE_POWER_RATE_SHARED("1030101", "公摊电费"), RESOURCE_CENTRAL_AIR_CONDITIONING("1030102", "中央空调电费"), RESOURCE_CENTRAL_AIR_CONDITIONING_SHARED(
			"1030103", "公摊中央空调电费"), RESOURCE_POWER_RATE_OTHERS("1030199", "其他电费"), RESOURCE_GAS_BILL("1030200", "燃气费"), RESOURCE_GAS_BILL_SHARED("1030201", "公摊燃气费"), RESOURCE_GAS_BILL_OTHERS("1030299", "其他燃气费"), RESOURCE_HEATING_FEE("1030300", "供暖费"), RESOURCE_HEATING_FEE_OTHERS("1030399", "其他供暖费"), RESOURCE_WIFI_FEE(
			"1030400", "宽带费"), RESOURCE_WIFI_FEE_OTHERS("1030499", "其他宽带费"), RESOURCE_SHARED_RESOURCE_KITCHEN("1030500", "厨房"), RESOURCE_SHARED_RESOURCE_TOILET("1030501", "卫生间"), RESOURCE_SHARED_RESOURCE_SHOWER_ROOM("1030502", "淋浴房"), RESOURCE_SHARED_RESOURCE_BOARDROOM("1030503", "会议室"), RESOURCE_SHARED_RESOURCE_PLAYROOM(
			"1030504", "棋牌室"), RESOURCE_SHARED_RESOURCE_ACTIVITY_ROOM("1030505", "活动室"),RESOURCE_SHARED_RESOURCE_WASHHOUSE("1030506", "洗衣房"), RESOURCE_SHARED_RESOURCE_OTHERS("1030599", "其他共享资源"), SERVICE_CHARGE_CLEANING("1040000", "清洁服务费"), SERVICE_CHARGE_MOVE_HOUSE("1040100", "搬家服务费"), SERVICE_CHARGE_REPAIR("1040200", "维修"), SERVICE_CHARGE_RESOURCE_SMS(
			"1040300", "短信服务费"), SERVICE_CHARGE_RESOURCE_CONTRACT("1040400", "合同服务费"), SERVICE_CHARGE_RESOURCE_ADVERTISEMENT("1040500", "广告服务费"), SERVICE_CHARGE_FIXED_PER_ROOM_MONTH("1040600", "间月服务费"), SERVICE_CHARGE_FIXED_PER_ROOM_DAY("1040700", "间夜服务费"), SERVICE_CHARGE_OPERATION_ELECTRIC(
			"1040800", "电费运营服务费"), SERVICE_CHARGE_OPERATION_HOT_WARTER("1040900", "热水运营服务费"), SERVICE_CHARGE_OPERATION_NETWORK("1041000", "网络运营服务费"), SERVICE_CHARGE_OPERATION_APPLIANCE("1041100", "家电运营服务费"), SERVICE_CHARGE_OPERATION_FURNITURE("1041200", "家具运营服务费"), SERVICE_CHARGE_OPERATION_GOODS(
			"1041300", "商品运营服务费"), SERVICE_CHARGE_OPERATION_FINANCIAL_2B("1041400", "金融运营2b服务费"), SERVICE_CHARGE_OPERATION_FINANCIAL_2C("1041500", "金融运营2c服务费"), SERVICE_CHARGE_OPERATION_OTHERS("1041600", "其他运营服务费"), SERVICE_CHARGE_LIFE_DRY_CLEAN("1041700", "干洗"), SERVICE_CHARGE_OTHERS("1049900",
			"其他服务费"), POUNDAGE_EXCHANGE_HOUSES("1050000", "换房手续费"), POUNDAGE_SUBLEASE("1050100", "转租手续费"), POUNDAGE_TRANSFER("1050200", "转账手续费"), POUNDAGE_OTHERS("1059900", "其他手续费"), LIQUIDATED_DAMAGES_RENT("1060000", "租金违约金"), LIQUIDATED_DAMAGES_OTHERS("1069900", "其他违约金"), LATE_FEE_RENT("1070000",
			"租金滞纳金"), LATE_FEE_RESOURCE("1070100", "资源费滞纳金"), LATE_FEE_SERVICE_CHARGE("1070200", "服务费滞纳金"), LATE_FEE_OTHERS("1079900", "其他滞纳金"), INDEMNITY_ASSETS("1080000", "资产赔偿金"), INDEMNITY_OTHERS("1089900", "其他赔偿金"), RECHARGE_BALANCE("1090000", "余额充值"), WITHDRAW_CASH_PERSON("1100000", "个人提现"), WITHDRAW_CASH_COMPANY(
			"1100100", "企业提现"), REFUND_PERSON("1110000", "个人退款"), REFUND_COMPANY("1110100", "企业退款"), REFUND_DEDUCTION_EARNEST("1110200", "定金退款抵扣"), CORRECTION_PERSON("1120000", "个人纠错"), CORRECTION_COMPANY("1120100", "企业纠错"), SETTLEMENT_COMPANY("1130000", "运营商结算"), DELIVERY_WATER_RATE("1140000", "水费交割"), DELIVERY_POWER_RATE("1140100", "电费交割"), DELIVERY_GAS_BILL(
			"1140200", "燃气交割"), DELIVERY_PRE_RATE("1140300", "预付费交割"), DELIVERY_OTHERS("1149900", "其他交割"), BENEFITS_POWER_RATE("1150000", "电费分利"), BENEFITS_OTHERS("1159900", "其他分利"), DECORATION_HARDWARE("1160000", "硬装"), DECORATION_SOFT("1160100", "软装"), DECORATION_OTHERS("1169900", "其他装修"), PREPAYMENT_RECHARGE("1170000", "预付费充值"), PREPAYMENT_POWER_RATE_RECHARGE("1170001", "预付费充值"), PREPAYMENT_REFOUND(
			"1170100", "预付费退款"), PREPAYMENT_ABANDON("1170200", "预付费放弃"), PREPAYMENT_OTHERS("1179900", "其他预付费"), ACCOUNT_DIVIDED_POWER_RATE("1180000", "电费分账"), ACCOUNT_DIVIDED_PREPAYMENT("1180100", "预付费分账"), ACCOUNT_DIVIDED_OTHERS("1189900", "其他分账"),FINE("1190000","罚款");
	private String code;
	private String name;
	private static Map<String, BillSubSubjectEnum> publicMap = new HashMap<String, BillSubSubjectEnum>();
	private static Map<String, BillSubSubjectEnum> privateMap = new HashMap<String, BillSubSubjectEnum>();

	static {
		publicMap.put(RESOURCE_WATER_RATE.getCode(), RESOURCE_WATER_RATE_SHARED);// 公摊冷水
		publicMap.put(RESOURCE_HOT_WATER_RATE.getCode(), RESOURCE_HOT_WATER_RATE_SHARED);// 公摊热水
		publicMap.put(RESOURCE_POWER_RATE.getCode(), RESOURCE_POWER_RATE_SHARED);// 公摊电费
		publicMap.put(RESOURCE_CENTRAL_AIR_CONDITIONING.getCode(), RESOURCE_CENTRAL_AIR_CONDITIONING_SHARED);// 公摊中央空调
		publicMap.put(RESOURCE_GAS_BILL.getCode(), RESOURCE_GAS_BILL_SHARED);// 公摊燃气费

		privateMap.put(RESOURCE_WATER_RATE.getCode(), RESOURCE_WATER_RATE);// 私有冷水
		privateMap.put(RESOURCE_HOT_WATER_RATE.getCode(), RESOURCE_HOT_WATER_RATE);// 私有热水
		privateMap.put(RESOURCE_POWER_RATE.getCode(), RESOURCE_POWER_RATE);// 私有电费
		privateMap.put(RESOURCE_CENTRAL_AIR_CONDITIONING.getCode(), RESOURCE_CENTRAL_AIR_CONDITIONING);// 私有中央空调
		privateMap.put(RESOURCE_GAS_BILL.getCode(), RESOURCE_GAS_BILL);// 私有燃气费
	}

	private BillSubSubjectEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static BillSubSubjectEnum getSharedBillSubSubjectEnum(String code) {
		BillSubSubjectEnum res = publicMap.get(code);
		if (res != null)
			return res;
		throw new IllegalArgumentException("没有匹配的公摊科目枚举项:" + code);
	}

	public static BillSubSubjectEnum getPrivateBillSubSubjectEnum(String code) {
		BillSubSubjectEnum res = privateMap.get(code);
		if (res != null)
			return res;
		throw new IllegalArgumentException("没有匹配的私有科目枚举项:" + code);
	}

	public static BillSubSubjectEnum get(String code) {
		for (BillSubSubjectEnum e : BillSubSubjectEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}

	/**
	 * 根据账单科目获取子科目
	 * 
	 * @param billSubject
	 *            账单科目编码
	 * @return
	 */
	public static Set<BillSubSubjectEnum> getChildren(String billSubject) {
		Set<BillSubSubjectEnum> s = new HashSet<>();
		for (BillSubSubjectEnum bss : BillSubSubjectEnum.values()) {
			if (bss.getCode().startsWith(billSubject))
				s.add(bss);
		}
		return s;
	}
}
