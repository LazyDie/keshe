package com.ipower365.saas.basic.constants;

/**
 * 改为从HouseDeliveryConstants.RecordFeeType中取
 * @author tigerli
 *
 */
public enum PropertyDeliveryAdvanceType {
	PrePayment("0", "预付费"), 
	PostPayment("1", "后付费");

    private String code;
    private String name;

    private PropertyDeliveryAdvanceType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static PropertyDeliveryAdvanceType get1(String code) {
        for (PropertyDeliveryAdvanceType type : PropertyDeliveryAdvanceType.values()) {
            if(type.getCode().equals(code)){
            	return type;
            }
        }
        throw new IllegalArgumentException("无效的编码：" + code);
    }

    

    public String getCode() {
		return code;
	}

	public String getName() {
        return name;
    }
}
