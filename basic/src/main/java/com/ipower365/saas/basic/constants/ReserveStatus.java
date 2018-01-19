package com.ipower365.saas.basic.constants;

public enum ReserveStatus {
    // 初始化, 看房，待签约，已签约
    INIT("1006000"), VIEW("1006001"), FOR_SIGN("1006002"), SIGNED("1006003");

    ReserveStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }



}
