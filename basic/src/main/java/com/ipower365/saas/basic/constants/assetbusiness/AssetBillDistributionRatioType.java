package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetBillDistributionRatioType {
    RATIO(1, "按比率"), AMOUNT(2, "固定数据");
    private int code;
    private String desc;

    AssetBillDistributionRatioType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetBillDistributionRatioType codeOf(int code) {
        for (AssetBillDistributionRatioType type : AssetBillDistributionRatioType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static boolean isValid(int code) {
        try {
            codeOf(code);
            return true;
        } catch (Exception e) {
            return false;
        }
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
}
