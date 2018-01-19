package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetAccountingSubject {
    ELECTRIC_CHARGE(1, "电费"), ESTATE(2, "资产");

    private int code;
    private String desc;

    AssetAccountingSubject(int code, String desc) {
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

    public static String quietDesc(int code) {
        for (AssetAccountingSubject e : AssetAccountingSubject.values()) {
            if (e.code == code) {
                return e.desc;
            }
        }
        return "";
    }
    
    public static AssetAccountingSubject codeOf(int code) {
        for (AssetAccountingSubject type : AssetAccountingSubject.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("code = " + code);
    }

    public static String getDescByCode(int code) {
        AssetAccountingSubject type = codeOf(code);
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
