package com.ipower365.saas.basic.constants;

public enum PayBillType {
    // 租金押金，定金，退款
    RENT("1056001"), EARNEST("1056002"), RENT_BACK("1056003");

    PayBillType(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
