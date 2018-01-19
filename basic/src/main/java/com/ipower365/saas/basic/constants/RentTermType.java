package com.ipower365.saas.basic.constants;

public enum RentTermType {
    // 长租 短租 时租 分钟租
    LONG_TERM("1065001"), SHORT_TERM("1065002"), HOUR_TERM("1065003"), MIN_TERM("1065004");

    RentTermType(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RentTermType getByCode(String code) {

        for (RentTermType status : RentTermType.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
