package com.ipower365.saas.basic.constants.room;

/**
 * 客房白名单常量
 * @author zhoujiagen
 */
public final class RoomWhiteListConstants {

    /** 纳入白名单的条件类型 */
    public enum Type {

        // TODO 参考账本科目？？？
        RENT_FEE("000000", "房租"), ELECTRONIC_FEE("000001", "电费");

        private String code;
        private String desc;

        /**
         * @param code 编号
         * @param desc 描述
         */
        Type(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String code() {
            return code;
        }

        public String desc() {
            return desc;
        }

    }

    /** 获取编号对应的描述 */
    public static String desc(String code) {
        if (code == null || "".equals(code)) {
            return null;
        }

        for (Type t : Type.values()) {
            if (code.equals(t.code())) {
                return t.desc();
            }
        }
        return null;
    }
}
