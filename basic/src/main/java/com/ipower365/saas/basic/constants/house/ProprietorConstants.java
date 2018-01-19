package com.ipower365.saas.basic.constants.house;

/**
 * 业主相关常量定义
 */
public final class ProprietorConstants {
    /**
     * 朝向
     */
    public enum ProprietorStatus {
        ProprietorStatus_1("1116001", "未合作"), //
        ProprietorStatus_2("1116002", "已合作"), //
        ProprietorStatus_3("1116003", "合作结束"), //
        ;
        public static String PRE_CODE = "1116";
        private String code;
        private String desc;

        ProprietorStatus(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static ProprietorStatus codeOf(String code) {
            for (ProprietorStatus value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
