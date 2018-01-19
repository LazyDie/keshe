package com.ipower365.saas.basic.constants;

public enum CapitalFlowType {
    InCome(0, "入账"), OutCome(1, "出账");

    private Integer code;
    private String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private CapitalFlowType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static CapitalFlowType getPaymentStatus(String code) {
        for (CapitalFlowType status : CapitalFlowType.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }

        throw new IllegalArgumentException("没匹配到对应的资金流向码：" + code);
    }
}
