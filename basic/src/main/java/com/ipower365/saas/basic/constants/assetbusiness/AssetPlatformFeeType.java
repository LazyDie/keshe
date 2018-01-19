package com.ipower365.saas.basic.constants.assetbusiness;

/**
 * 平台费用类型
 */
public enum AssetPlatformFeeType {
    SERVICE_FEE(1, "服务费");

    private int code;
    private String desc;

    AssetPlatformFeeType(int code, String desc) {
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

    public static AssetPlatformFeeType codeOf(int code) {
        for (AssetPlatformFeeType model : AssetPlatformFeeType.values()) {
            if (model.code == code) {
                return model;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetPlatformFeeType model = codeOf(code);
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
