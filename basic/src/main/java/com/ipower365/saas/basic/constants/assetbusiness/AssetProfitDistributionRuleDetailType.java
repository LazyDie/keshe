package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetProfitDistributionRuleDetailType {
    RATIO(1, "按比率"), AMOUNT(2, "固定数据");

    private int code;
    private String desc;

    AssetProfitDistributionRuleDetailType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static AssetProfitDistributionRuleDetailType codeOf(int code) {
        for (AssetProfitDistributionRuleDetailType model : AssetProfitDistributionRuleDetailType.values()) {
            if (model.code == code) {
                return model;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetProfitDistributionRuleDetailType model = codeOf(code);
        return model.getDesc();
    }

    public static boolean isValid(int code) {
        try {
            codeOf(code);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
