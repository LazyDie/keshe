package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetBillSubjectBigType {
    TYPE_1(1, "客房电费"),
    TYPE_2(2, "物业电费"),
    ;

    private int code;
    private String desc;

    AssetBillSubjectBigType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetBillSubjectBigType codeOf(int code) {
        for (AssetBillSubjectBigType type : values()) {
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
