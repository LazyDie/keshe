package com.ipower365.saas.basic.constants;

public enum RentFlow {

    //DEAD_CHECKOUT 到期了继续住
    
    VIEW("1021001"), RESERV("1021002"), SIGN("1021003"), CHECKIN("1021004"), EXTEND("1021005"), EXCHANGE("1021006"), CHECKOUT("1021007"), BREAK_CHECKOUT("1021008"), TRANSFER(
            "1021009"), DEAD_CHECKOUT("1021010");

    RentFlow(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    /**
     * 根据编码获取枚举项
     * @param code
     * @return
     */
    public static RentFlow getByCode(String code) {
        for (RentFlow f : RentFlow.values()) {
            if (code != null && code.equals(f.getCode())) {
                return f;
            }
        }
        return null;
    }

}
