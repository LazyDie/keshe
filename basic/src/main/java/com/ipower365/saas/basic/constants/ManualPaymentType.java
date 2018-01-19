package com.ipower365.saas.basic.constants;

public enum ManualPaymentType {
//	OrderPayment(0, "租客在线付账"), 
	OrderPaymentManually(1, "租客线下付账"), 
//	RentPaymentToRoomOwner(2, "业主租金支付"), 
//	CashWithdrawal(3, "租客取现"),
//	Recharge(4, "租客充值"), 
//	Settlement2Org(5, "运营商结算"), 
//	ResourceOrderAutomaticDeductment(6, "资源缴费"), 
//    RefundToBalance(7, "退款至余额"), 
//    FiCorrectionForTenant(8, "租客财务纠错"),
//    FiCorrectionForOrg(11, "运营商财务纠错"), 
//    Org2TenantOffLine(9, "运营商代租客充值"), 
    PreDepositRecharge( 10, "预付费充值"), 
//    WithdrawalPreDeposit2Balance(12, "预付费转出到余额"), 
//    ResourceOperating(13, "电费运营"), 
//    Cutover4ResourceOperating(14, "电费运营割接"), 
//    Other(100, "其它")
    ;

    private int code;
    private String name;

    private ManualPaymentType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ManualPaymentType getPaymentType(Integer code) {
        if (null == code) return null;
        for (ManualPaymentType c : ManualPaymentType.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的支付渠道：" + code);
    }
	
}
