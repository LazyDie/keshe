package com.ipower365.saas.basic.constants;


/**
 * 系统房租支付方式配置方式配置常量
 * @author zhoujiagen
 */
public final class SysRentPayAckConstants {

    /**
     * <pre>
     * 房租支付方式       
     *      1100001 线上
     *      1100002 线下
     *      1100003 会分期
     *      1100004 巴乐兔
     *      1100005 58
     *      1100006 盈家分期
     * </pre>
     */
    public enum PayWayEnum {
        ONLINE("1100001", "线上"), //
        OFFLINE("1100002", "线下"), //
        HUIFENQI("1100003", "会分期"), //
        BALETU("1100004", "巴乐兔"), //
        WUBA("1100005", "58"),
        INJIA("1100014","盈家分期");

        private String code;
        private String desc;

        /**
         * @param code 编号
         * @param desc 描述
         */
        PayWayEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        /** 获取编号对应的描述 */
        public static String desc(String code) {
            if (code == null || "".equals(code.trim())) {
                return null;
            }

            for (PayWayEnum t : PayWayEnum.values()) {
                if (code.equals(t.code())) {
                    return t.desc();
                }
            }
            return null;
        }
        
        public static PayWayEnum getByCode(String code) {
            if (code == null) return null;
            PayWayEnum[] targets = PayWayEnum.values();
            for (PayWayEnum t : targets) {
                if (t.code.equals(code)) {
                    return t;
                }
            }
            return null;
        }
    }

    /**
     * <pre>
     * 房租确认方式       
     *      1112001 到账
     *      1112002 财务确认
     *      1112003 API确认
     *      1112004 自动确认
     * </pre>
     */
    public enum AckWayEnum {
        TRANSFERD("1112001", "到账"), //
        ACCOUNTANT_ACK("1112002", "财务确认"), //
        API_ACK("1112003", "API确认"), //
        AUTO_ACK("1112004", "自动确认");

        private String code;
        private String desc;

        /**
         * @param code 编号
         * @param desc 描述
         */
        AckWayEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        /** 获取编号对应的描述 */
        public static String desc(String code) {
            if (code == null || "".equals(code.trim())) {
                return null;
            }

            for (AckWayEnum t : AckWayEnum.values()) {
                if (code.equals(t.code())) {
                    return t.desc();
                }
            }
            return null;
        }
    }

    /*public static ManualPaymentChannel getManualChannelByPayMode(String payMode) {
        if (payMode == null || "".equals(payMode)) {
            return ManualPaymentChannel.Cash;
        }
        switch (payMode) {
            case "1100002":
                return ManualPaymentChannel.Cash;
            case "1100005":
                return ManualPaymentChannel.yuefu58;
            case "1100003":
                return ManualPaymentChannel.B2C;
            case "1100004":
                return ManualPaymentChannel.baletu;
            default:
                break;
        }
        return ManualPaymentChannel.Cash;
    }*/
    
    public static OfflinePaymentChannel getOfflineChannelByPayMode(String payMode) {
        if (payMode == null || "".equals(payMode)) {
            return OfflinePaymentChannel.Cash;
        }
        switch (payMode) {
            case "1100002":
                return OfflinePaymentChannel.Cash;
            case "1100005":
                return OfflinePaymentChannel.Yuefu58;
            case "1100003":
                return OfflinePaymentChannel.Hfq;
            case "1100004":
                return OfflinePaymentChannel.Baletu;
            default:
                break;
        }
        return OfflinePaymentChannel.Cash;
    }
}
