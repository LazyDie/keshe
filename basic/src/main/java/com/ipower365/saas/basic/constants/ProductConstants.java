package com.ipower365.saas.basic.constants;

public class ProductConstants {
	//产品类型
	public static String PRODUCT_TYPE="1051";
	public static String PRODUCT_TYPE_CENTER=PRODUCT_TYPE+"001";//集中式
	public static String PRODUCT_TYPE_DISPERSED=PRODUCT_TYPE+"002";//分散式
	
	//出租方式
	public static String RENT_WAY="1059";//
	public static String RENT_WAY_SHORT=RENT_WAY+"001";//短租
	public static String RENT_WAY_LONG=RENT_WAY+"002";//长租
	
	//出租类型
	public static String RENT_TYPE="1060";
	public static String RENT_TYPE_ENTIRE=RENT_TYPE+"001";//整租
	public static String RENT_TYPE_JOIN=RENT_TYPE+"002";//合租
	
	//租客要求
	public static String RENTER_NEED="1061";//
	public static String RENTER_NEED_CARD=RENTER_NEED+"001";//身份证明
	public static String RENTER_NEED_SOCIETY=RENTER_NEED+"002";//社会证明
	
	
	//产品状态
	public static String PRODUCT_STATUS="1052";
	public static String PRODUCT_STATUS_USED=PRODUCT_STATUS+"001";//启用
	public static String PRODUCT_STATUS_STOP=PRODUCT_STATUS+"002";//停用
	public static String PRODUCT_STATUS_UNUSED=PRODUCT_STATUS+"003";//未使用
	
	//管理中心状态
	public static String MANAGER_CENTER_STATUS="1053";
	public static String MANAGER_CENTER_STATUS_USED=MANAGER_CENTER_STATUS+"001";//启用
	public static String MANAGER_CENTER_STATUS_STOP=MANAGER_CENTER_STATUS+"002";//停用
	public static String MANAGER_CENTER_STATUS_UNUSED=MANAGER_CENTER_STATUS+"003";//未使用
	
	//产品参数类型
	public static String PRODUCT_PARAM_TYPE="1058";
	public static String PRODUCT_PARAM_TYPE_PRD=PRODUCT_PARAM_TYPE+"001";//产品参数
	public static String PRODUCT_PARAM_TYPE_RENT=PRODUCT_PARAM_TYPE+"002";//租约策略
	public static String PRODUCT_PARAM_TYPE_PRICE=PRODUCT_PARAM_TYPE+"003";//价格方案
	
	///退房结算账期字段
	public static String PRODUCT_PARAM_CHECKOUT_BILL_TERM="checkout_bill_term";
	
	
}
