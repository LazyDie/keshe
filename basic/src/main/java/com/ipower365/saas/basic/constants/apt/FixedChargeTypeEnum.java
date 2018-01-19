package com.ipower365.saas.basic.constants.apt;


/**
 * 支付方式
 * 
 * @ProjectName: basic
 * @ClassName: ChargeTypeEnum.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年7月5日 下午2:16:52
 */
public enum FixedChargeTypeEnum {

	CHARGE_TYPE_POSTPAID(1, "后付费"),
	CHARGE_TYPE_PREPAYMENT(2, "预付费")
    ;

    private Integer code;
    private String desc;

    private FixedChargeTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static FixedChargeTypeEnum getByCode(Integer code) {
        for (FixedChargeTypeEnum type : FixedChargeTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的资源支付类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
