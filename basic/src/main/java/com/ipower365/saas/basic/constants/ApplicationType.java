package com.ipower365.saas.basic.constants;

/**
 * 申请类型
 * @author Aron
 */
public enum ApplicationType {
    TenantCashWithdrawalApplication(0, "租客提现申请"), 
    OrgSettlementApplication(1, "运营商结算申请"), 
    TenantFiCorrectionApplication(2, "租客财务纠错申请"), 
    OrgFiCorrectionApplication(3, "运营商财务纠错申请"),
    
    OrgCashWithdrawalApplication(4,"运营商提现申请")
    
    ;

    private Integer code;
    private String name;

    private ApplicationType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }


    public static ApplicationType get(Integer code) {
        for (ApplicationType type : ApplicationType.values()) {
            if (type.code == code) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的申请类型ID:" + code);
    }


    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
