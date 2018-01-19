package com.ipower365.saas.basic.constants.assetbusiness;



//物业、客房
public enum AssetBillTopic {
    PROPERTY(1, "物业"), ROOM(2, "客房");

    private int code;
    private String desc;

    AssetBillTopic(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetBillTopic codeOf(int code) {
        for (AssetBillTopic model : AssetBillTopic.values()) {
            if (model.code == code) {
                return model;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetBillTopic model = codeOf(code);
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
