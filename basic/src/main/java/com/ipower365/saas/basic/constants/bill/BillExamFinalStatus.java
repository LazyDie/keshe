package com.ipower365.saas.basic.constants.bill;

/**
 * 账单实体的最终审核状态定义
 */
public enum BillExamFinalStatus {
    Init("000", "提交审核"), //
    UpmsAccountantApprove("001", "UPMS会计审核通过"), //
    UpmsAccountantDeny("002", "UPMS会计审核拒绝"), //
    UpmsCashierApprove("003", "UPMS出纳审核通过"), //
    UpmsCashierDeny("004", "UPMS出纳审核拒绝"), //
    UportalAccountantApprove("005", "UPORTAL会计审核通过"), //
    UportalAccountantDeny("006", "UPORTAL会计审核拒绝"), //
    UportalCashierApprove("007", "UPORTAL出纳审核通过"), //
    UportalCashierDeny("008", "UPORTAL出纳审核拒绝");

    private String code;
    private String description;

    BillExamFinalStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String code() {
        return this.code;
    }

    public String description() {
        return this.description;
    }

    public static boolean isDeny(BillExamFinalStatus befs) {
        if (befs.equals(UpmsAccountantDeny) || befs.equals(UpmsCashierDeny) //
                || befs.equals(UportalAccountantDeny) || befs.equals(UportalCashierDeny)) {
            return true;
        }
        return false;
    }

    /**
     * 获取描述
     * @param code
     * @return
     */
    public static String description(String code) {
        if (code == null || "".equals(code.trim())) return "";

        for (BillExamFinalStatus befs : BillExamFinalStatus.values()) {
            if (befs.code().equals(code)) {
                return befs.description();
            }
        }

        return "";
    }


}
