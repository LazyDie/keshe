package com.ipower365.saas.basic.constants;

public enum CreditSubject {
    ConsumptionCredit("0", "消费积分"), UnovoMarketingCredit("1", "平台营销积分"), OperatorMarketingCredit("2", "运营商营销积分");

    private String code;
    private String name;

    private CreditSubject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static CreditSubject get(String code) {
        for (CreditSubject type : CreditSubject.values()) {
            if (type.code == code) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的积分类别码：" + code);
    }



    public String getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
