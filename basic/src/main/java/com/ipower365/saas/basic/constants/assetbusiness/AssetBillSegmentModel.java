package com.ipower365.saas.basic.constants.assetbusiness;

/**
 * 分段模型
 */
public enum AssetBillSegmentModel {
    PROPERTY(1, "物业纬度继时分利"), TIME(2, "时间纬度同时分利");

    private int code;
    private String desc;

    AssetBillSegmentModel(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetBillSegmentModel codeOf(int code) {
        for (AssetBillSegmentModel model : AssetBillSegmentModel.values()) {
            if (model.code == code) {
                return model;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        try {
            AssetBillSegmentModel model = codeOf(code);
            return model.getDesc();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
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
