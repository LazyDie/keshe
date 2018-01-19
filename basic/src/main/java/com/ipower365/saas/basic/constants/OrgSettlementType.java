package com.ipower365.saas.basic.constants;


/**
 * 运营商结算类型枚举
 * @author tigerli
 *
 */
public enum OrgSettlementType {
	ORG_SETTLEMENT_ALL(0,"全部"),
	ORG_SETTLEMENT_APARTMENT(1,"公寓运营商结算"),
	ORG_SETTLEMENT_ELECTRIC(2,"电费运营商结算")
	
	;
	
	OrgSettlementType(int code,String name){
		this.code=code;
		this.name=name;
	}
	
	private int code;
	private String name;
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	
	public static OrgSettlementType get(Integer code){
		 for (OrgSettlementType type : OrgSettlementType.values()) {
	            if (type.code==code.intValue()) {
	                return type;
	            }
	        }

	        throw new IllegalArgumentException("无效编码：" + code);
	 }
	
	

}
