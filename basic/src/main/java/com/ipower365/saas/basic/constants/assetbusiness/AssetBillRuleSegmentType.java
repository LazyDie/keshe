package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetBillRuleSegmentType {
    SEGMENT(1, "按阶段类型"), TIME(2, "按时间");

    private int code;
    private String desc;

    AssetBillRuleSegmentType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetBillRuleSegmentType codeOf(int code) {
        for (AssetBillRuleSegmentType type : AssetBillRuleSegmentType.values()) {
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

    public int getCode() {
        return code;
    }
}
