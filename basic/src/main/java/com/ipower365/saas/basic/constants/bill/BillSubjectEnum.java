package com.ipower365.saas.basic.constants.bill;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账单科目<br>
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
 *
 */
public enum BillSubjectEnum {
	RENT_ROOM("10000", "房屋租金"), RENT_ASSETS("10001", "资产租金"), RENT_SERVICE("10002", "服务费"), RENT_PROPERTY_MANAGEMENT_FEE("10003", "物业费"), RENT_PARKING_FEE("10004", "停车费"), RENT_BED("10005", "床位费"), RENT_GARBAGE("10006", "垃圾清运费"), RENT_MAINTENANCE("10007", "维护费"),RENT_UTILITIES_FEE("10008","公共事业费"),RENT_POUNDAGE_FEE("10009","手续费"), RENT_OTHERS("10099", "其他租金"), FOREGIFT_RENT(
			"10100", "租金押金"), FOREGIFT_ASSETS("10101", "资产押金"), FOREGIFT_RESOURCE("10102", "水电煤押金"), FOREGIFT_INTELLIGENT_DEVICE("10103", "智能设备押金"), FOREGIFT_OTHERS("10199", "其他押金"), EARNEST_MONEY_RENT("10200", "租金定金"), EARNEST_MONEY_OTHERS("10299", "其他定金"), RESOURCE_WATER_RATE("10300", "水费"), RESOURCE_POWER_RATE(
			"10301", "电费"), RESOURCE_GAS_BILL("10302", "燃气费"), RESOURCE_HEATING_FEE("10303", "供暖费"), RESOURCE_WIFI_FEE("10304", "宽带费"), RESOURCE_SHARED("10305", "共享资源"), RESOURCE_OTHERS("10399", "其他资源"), SERVICE_CHARGE_CLEANING("10400", "清洁服务费"), SERVICE_CHARGE_MOVE_HOUSE("10401", "搬家服务费"), SERVICE_CHARGE_REPAIR(
			"10402", "维修服务费"), SERVICE_CHARGE_RESOURCE_SMS("10403", "短信服务费"), SERVICE_CHARGE_RESOURCE_CONTRACT("10404", "合同服务费"), SERVICE_CHARGE_RESOURCE_ADVERTISEMENT("10405", "广告服务费"), SERVICE_CHARGE_FIXED_PER_ROOM_MONTH("10406", "间月服务费"), SERVICE_CHARGE_FIXED_PER_ROOM_DAY("10407", "间夜服务费"), SERVICE_CHARGE_OPERATION_ELECTRIC(
			"10408", "电费运营服务费"), SERVICE_CHARGE_OPERATION_HOT_WARTER("10409", "热水运营服务费"), SERVICE_CHARGE_OPERATION_NETWORK("10410", "网络运营服务费"), SERVICE_CHARGE_OPERATION_APPLIANCE("10411", "家电运营服务费"), SERVICE_CHARGE_OPERATION_FURNITURE("10412", "家具运营服务费"), SERVICE_CHARGE_OPERATION_GOODS("10413",
			"商品运营服务费"), SERVICE_CHARGE_OPERATION_FINANCIAL_2B("10414", "金融运营2b服务费"), SERVICE_CHARGE_OPERATION_FINANCIAL_2C("10415", "金融运营2c服务费"), SERVICE_CHARGE_OPERATION_OTHERS("10416", "其他运营服务费"), SERVICE_CHARGE_LIFE("10417", "生活服务费"), SERVICE_CHARGE_OTHERS("10499", "其他服务费"), POUNDAGE_EXCHANGE_HOUSES(
			"10500", "换房手续费"), POUNDAGE_SUBLEASE("10501", "转租手续费"), POUNDAGE_TRANSFER("10502", "转账手续费"), POUNDAGE_OTHERS("10599", "其他手续费"), LIQUIDATED_DAMAGES_RENT("10600", "租金违约金"), LIQUIDATED_DAMAGES_OTHERS("10699", "其他违约金"), LATE_FEE_RENT("10700", "租金滞纳金"), LATE_FEE_RESOURCE("10701", "资源费滞纳金"), LATE_FEE_SERVICE_CHARGE(
			"10702", "服务费滞纳金"), LATE_FEE_OTHERS("10799", "其他滞纳金"), INDEMNITY_ASSETS("10800", "资产赔偿金"), INDEMNITY_OTHERS("10899", "其他赔偿金"), RECHARGE_BALANCE("10900", "余额充值"), WITHDRAW_CASH_PERSON("11000", "个人提现"), WITHDRAW_CASH_COMPANY("11001", "企业提现"), REFUND_PERSON("11100", "个人退款"), REFUND_COMPANY(
			"11101", "企业退款"), REFUND_DEDUCTION("11102", "退款抵扣"), CORRECTION_PERSON("11200", "个人纠错"), CORRECTION_COMPANY("11201", "企业纠错"), SETTLEMENT_COMPANY("11300", "运营商结算"), DELIVERY_WATER_RATE("11400", "水费交割"), DELIVERY_POWER_RATE("11401", "电费交割"), DELIVERY_GAS_BILL("11402", "燃气交割"), DELIVERY_PRE_RATE("11403", "预付费交割"),DELIVERY_OTHERS(
			"11499", "其他交割"), BENEFITS_POWER_RATE("11500", "电费分利"), BENEFITS_OTHERS("11599", "其他分利"), DECORATION_HARDWARE("11600", "硬装"), DECORATION_SOFT("11601", "软装"), DECORATION_OTHERS("11699", "其他装修"), PREPAYMENT_RECHARGE("11700", "预付费充值"), PREPAYMENT_REFOUND("11701", "预付费退款"), PREPAYMENT_ABANDON(
			"11702", "预付费放弃"), PREPAYMENT_OTHERS("11799", "其他预付费"), ACCOUNT_DIVIDED_POWER_RATE("11800", "电费分账"), ACCOUNT_DIVIDED_PREPAYMENT("11801", "预付费分账"), ACCOUNT_DIVIDED_OTHERS("11899", "其他分账"),FINE("11900","罚款");
	private String code;
	private String name;
	private static Map<BillSubjectTypeEnum, Collection<BillSubjectEnum>> map = new ConcurrentHashMap<BillSubjectTypeEnum, Collection<BillSubjectEnum>>();
	private final static ReentrantLock lock = new ReentrantLock();

	private BillSubjectEnum(String code, String name) {
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

	public static BillSubjectEnum get(String code) {
		for (BillSubjectEnum e : BillSubjectEnum.values()) {
			if (e.getCode().equals(code))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}

	/**
	 * 通过子科目code查找科目
	 * 
	 * @param code
	 *            子科目code
	 * @return
	 */
	public static BillSubjectEnum getBySubsubjectCode(String code) {
		if (null == code || code.trim().length() == 0)
			throw new IllegalArgumentException("没有匹配的枚举项:" + code);
		String sc = code.trim().substring(0, 5);
		for (BillSubjectEnum e : BillSubjectEnum.values()) {
			if (e.getCode().equals(sc))
				return e;
		}
		throw new IllegalArgumentException("没有匹配的枚举项:" + code);
	}

	/**
	 * 获取账单分类对应的科目编码列表
	 * 
	 * @param type
	 * @return
	 */
	public static Collection<String> listSubjects(BillSubjectTypeEnum type) {
		Map<BillSubjectTypeEnum, Collection<BillSubjectEnum>> m = getMap();
		if (null == m || null == type)
			return null;
		Set<String> s = new HashSet<>();
		Collection<BillSubjectEnum> subjects = m.get(type);
		if (null == subjects || subjects.isEmpty())
			return null;
		for (BillSubjectEnum e : subjects) {
			s.add(e.getCode());
		}
		return s;
	}

	/**
	 * 获取账单分类对应的科目枚举列表
	 * 
	 * @param type
	 * @return
	 */
	public static Collection<BillSubjectEnum> listSubjectEnums(BillSubjectTypeEnum type) {
		Map<BillSubjectTypeEnum, Collection<BillSubjectEnum>> m = getMap();
		if (null == m || null == type)
			return null;
		return m.get(type);
	}

	private static Map<BillSubjectTypeEnum, Collection<BillSubjectEnum>> getMap() {
		try {
			lock.lock();
			if (map.isEmpty())
				initMap();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return map;
	}

	private static void initMap() {
		for (BillSubjectEnum e : BillSubjectEnum.values()) {
			for (BillSubjectTypeEnum te : BillSubjectTypeEnum.values()) {
				if (match(e, te)) {
					put(te, e);
					break;
				}
			}
		}
	}

	private static boolean match(BillSubjectEnum e, BillSubjectTypeEnum te) {
		return e.name().startsWith(te.getPrefix());
	}

	private static void put(BillSubjectTypeEnum k, BillSubjectEnum e) {
		Collection<BillSubjectEnum> l = map.get(k);
		if (null == l) {
			l = new HashSet<BillSubjectEnum>();
			map.put(k, l);
		}
		l.add(e);

	}
}
