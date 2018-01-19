package com.ipower365.saas.basic.constants.house;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ipower365.saas.basic.constants.bill.BillSubjectEnum;

/**
 * 代付配置常量定义
 * @author zhoujiagen
 */
public final class PayingConfigConstants {

    /**
     * 配置项定义
     * @see com.ipower365.saas.basic.constants.bill.BillSubjectEnum
     * @see com.ipower365.saas.basic.constants.bill.BillSubSubjectEnum
     */
    public enum PayingItem {

        PROPERTY_RENT_FEE("10100", "物业租金"), // 112
        PROPERTY_RENT_DEPOSIT("10200", "物业押金"), // 102
        WATER_FEE("10400", "物业水费"), // 104
        GAS_FEE("10600", "物业煤气费"), // 106
        ELECTRIC_FEE("10500", "物业电费"), // 105
        PROPERTY_MGMT_FEE("11500", "物业费"), //
        DECORATION_FEE("12100", "装修费"), //
        CONFIG_FEE("12200", "配置费");

        private String code;
        private String description;

        PayingItem(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public String code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }

        /**
         * 获取编码的描述
         * @param code
         * @return
         */
        public static String description(String code) {
            if (code == null || "".equals(code.trim())) {
                return "";
            }

            for (PayingItem item : PayingItem.values()) {
                if (item.code().equals(code)) {
                    return item.description();
                }
            }

            return "";
        }

        /**
         * 是否是有效的编码
         * @param code
         * @return
         */
        public static boolean validCode(String code) {
            if (code == null || "".equals(code.trim())) {
                return false;
            }

            for (PayingItem item : PayingItem.values()) {
                if (item.code().equals(code)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static Map<String, String> SUBJECT_MAP = new HashMap<String, String>();
    static {
        SUBJECT_MAP.put(PayingItem.PROPERTY_RENT_FEE.code, BillSubjectEnum.RENT_ROOM.getCode());
        SUBJECT_MAP.put(PayingItem.PROPERTY_RENT_DEPOSIT.code, BillSubjectEnum.FOREGIFT_RENT.getCode());

        SUBJECT_MAP.put(PayingItem.WATER_FEE.code, BillSubjectEnum.RESOURCE_WATER_RATE.getCode());
        SUBJECT_MAP.put(PayingItem.GAS_FEE.code, BillSubjectEnum.RESOURCE_GAS_BILL.getCode());
        SUBJECT_MAP.put(PayingItem.ELECTRIC_FEE.code, BillSubjectEnum.RESOURCE_POWER_RATE.getCode());
        SUBJECT_MAP.put(PayingItem.PROPERTY_MGMT_FEE.code, BillSubjectEnum.RENT_PROPERTY_MANAGEMENT_FEE.getCode());
        SUBJECT_MAP.put(PayingItem.DECORATION_FEE.code, BillSubjectEnum.DECORATION_OTHERS.getCode());// ???
        SUBJECT_MAP.put(PayingItem.CONFIG_FEE.code, BillSubjectEnum.DECORATION_OTHERS.getCode());// ???
    }

    /**
     * 转换为财务模型使用的科目定义
     * @param subject
     * @return
     */
    public static String translateSubject(String subject) {
        if (subject == null || "".equals(subject.trim())) {
            return "";
        }

        if (SUBJECT_MAP.containsKey(subject)) {
            return SUBJECT_MAP.get(subject);
        }
        return "";
    }

    /**
     * 将财务模型使用的科目定义转换为物业模块使用的科目定义
     * @param financialSubject
     * @return
     */
    public static String tranlateFrom(String financialSubject) {
        if (financialSubject == null || "".equals(financialSubject.trim())) {
            return "";
        }

        for (Entry<String, String> entry : SUBJECT_MAP.entrySet()) {
            if (entry.getValue().equals(financialSubject)) {
                return entry.getKey();
            }
        }

        return "";
    }


    /**
     * 配置项状态
     */
    public enum PayingConfigState {
        OPEN(0, "已开通"), //
        FREEZE(1, "冻结"), //
        CLOSED(2, "终止");

        private int code;
        private String description;

        PayingConfigState(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }

        /**
         * 获取编码的描述
         * @param code
         * @return
         */
        public static String description(Integer code) {
            if (code == null) {
                return "";
            }

            for (PayingConfigState item : PayingConfigState.values()) {
                if (code.equals(item.code())) {
                    return item.description();
                }
            }

            return "";
        }

        /**
         * 是否开通判断
         * @param code
         * @return
         */
        public static boolean isOpen(Integer code) {
            if (code == null) {
                return false;
            }

            if (OPEN.code() == code.intValue()) {
                return true;
            }
            return false;
        }

    }


}
