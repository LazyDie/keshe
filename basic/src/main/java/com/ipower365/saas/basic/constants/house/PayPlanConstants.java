package com.ipower365.saas.basic.constants.house;

/**
 * 物业租赁费用应付计划和应付计划详情中常量
 * @author zhoujiagen
 */
public class PayPlanConstants {

    /**
     * 计划/计划详情状态
     */
    public enum PlanStatus {
        INIT(0, "录入待审核"), //
        EFFECTIVE(1, "有效"), //
        FREEZE(2, "冻结"), //
        CANCEL(3, "废止");

        private Integer code;
        private String description;

        PlanStatus(Integer code, String description) {
            this.code = code;
            this.description = description;
        }

        public Integer code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }

        public static String description(Integer code) {
            if (code == null) return "";

            for (PlanStatus e : PlanStatus.values()) {
                if (e.code().equals(code)) {
                    return e.description();
                }
            }

            return "";
        }


    }

}
