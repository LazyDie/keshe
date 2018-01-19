package com.ipower365.saas.basic.constants.assetbusiness;

/**
 * 规则阶段类型:1:按阶段;2:按时间
 */
public enum AssetRuleSegmentType {
    SEGMENT(1, "按阶段类型"), TIME(2, "按时间");

    private int code;
    private String desc;

    AssetRuleSegmentType(int code, String desc) {
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

    public static AssetRuleSegmentType codeOf(int code) {
        for (AssetRuleSegmentType type : AssetRuleSegmentType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetRuleSegmentType type = codeOf(code);
        return type.getDesc();
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
