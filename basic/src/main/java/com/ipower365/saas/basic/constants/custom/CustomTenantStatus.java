package com.ipower365.saas.basic.constants.custom;

public enum CustomTenantStatus {
    // 已签约 已支付首期房租 已入住 已结算 已支付结算账单 退房
    SIGNED("1049001"), PAID_CHECKIN("1049006"), CHECKINED("1049002"), CLOSE_FEE("1049003"), PAID_CLOSE("1049004"), CHECKOUT("1049005");

    CustomTenantStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
