package com.ipower365.saas.basic.constants.assetbusiness;

/**
 * 电费运营区域配置类型
 * @author anker
 */
public enum AssetOrganizationType {
    // 平台；2运营商；3电费运营商
    PLATFORM(1, "平台"), APT_BUSINESS(2, "运营商"), INVEST_BUSINESS(3, "电费运营商"), ESTATE_BUSINESS(4,"资产运营商️");

    private int code;
    private String desc;

    AssetOrganizationType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetOrganizationType codeOf(int code) {
        for (AssetOrganizationType model : AssetOrganizationType.values()) {
            if (model.code == code) {
                return model;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetOrganizationType model = codeOf(code);
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
