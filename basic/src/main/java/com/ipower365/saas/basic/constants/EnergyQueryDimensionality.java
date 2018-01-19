package com.ipower365.saas.basic.constants;


public enum EnergyQueryDimensionality {
    PROPERTY("0", "物业纬度"), //
    ROOM("1", "客户纬度");

    private String code;
    private String desc;

    EnergyQueryDimensionality(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static EnergyQueryDimensionality codeOf(String code) {
        for (EnergyQueryDimensionality value : values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid code. = " + code);
    }

    public static boolean isValid(String code) {
        try {
            codeOf(code);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
