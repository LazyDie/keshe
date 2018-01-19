package com.ipower365.saas.basic.constants.house;

/**
 * 物业合同相关常量定义
 * @author zhoujiagen
 * @see ContractStatus 合同状态
 */
public final class HouseContractConstants {
    /**
     * 甲方选择枚举常量
     */
    public enum PartyASelection {
        PROPRIETOR(0, "业主"), DELEGATEE(1, "委托人");

        private Integer code;
        private String description;

        PartyASelection(Integer code, String description) {
            this.code = code;
            this.description = description;
        }

        public Integer code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }

    /**
     * 合同状态
     */
    public enum ContractStatus {
        SIGNED("000003", "已签约"), //
        EFFECTIVE("000004", "合约生效"), //
        FREEZE("000005", "合约冻结"), //
        CANCEL_FREEZE("000006", "取消冻结"), //
        CANCEL("000007", "合约废止"), //
        EXPIRE("000008", "合约到期");

        private String code;
        private String description;

        ContractStatus(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public static ContractStatus codeOf(String code) {
            for (ContractStatus status : ContractStatus.values()) {
                if (status.code.equals(code)) {
                    return status;
                }
            }
            throw new IllegalArgumentException("无效的code:" + code);
        }

        /**
         * 判断是否是有效的合同状态编码
         * @param code
         * @return
         */
        public static boolean valid(String code) {
            for (ContractStatus es : ContractStatus.values()) {
                if (es.code.equals(code)) {
                    return true;
                }
            }

            return false;
        }

        /**
         * 按code获取description
         * @param code
         * @return
         */
        public static String description(String code) {
            for (ContractStatus es : ContractStatus.values()) {
                if (es.code.equals(code)) {
                    return es.description;
                }
            }
            return "";
        }

        public String code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }

    /**
     * 合同审批状态
     */
    public enum ExamStatus {
        INIT("000001", "财务审核中"), //
        APPROVED("000002", "财务审核通过"), //
        REJECTED("000003", "财务审核驳回"), //
        BACK("000004", "审批撤回");

        private String code;
        private String description;

        ExamStatus(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public static ExamStatus codeOf(String code) {
            for (ExamStatus status : ExamStatus.values()) {
                if (status.code.equals(code)) {
                    return status;
                }
            }
            throw new IllegalArgumentException("无效的code:" + code);
        }

        /**
         * 判断是否是有效的审批状态编码
         * @param code
         * @return
         */
        public static boolean valid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
            }
            return false;
        }

        /**
         * 按code获取description
         * @param code
         * @return
         */
        public static String description(String code) {
            try {
                ExamStatus status = codeOf(code);
                return status.description();
            } catch (Exception e) {
            }
            return "";
        }

        public String code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }

}
