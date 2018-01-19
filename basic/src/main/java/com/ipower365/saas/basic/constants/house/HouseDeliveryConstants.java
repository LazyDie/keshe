package com.ipower365.saas.basic.constants.house;

import java.util.Calendar;
import java.util.Date;

/**
 * 物业交割常量定义
 * @author zhoujiagen
 */
public final class HouseDeliveryConstants {
    /**
     * <pre>
     * 应付日期计算: MonthRange, SpecialDateEnum的翻译
     *
     * </pre>
     * @param monthRangeCode
     * @param specialDateCode
     * @param date
     * @return 日期, 不带时分秒
     */
    public static Date translate(Integer monthRangeCode, Integer specialDateCode, Date date) {
        if (date == null) {
            return null;
        }

        MonthRange mr = MonthRange.byCode(monthRangeCode);
        SpecialDateEnum sde = SpecialDateEnum.byCode(specialDateCode);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // 1 月份
        if (mr == null) {
            mr = MonthRange.DEFAULT();
        }
        if (MonthRange.MEXT_MONTH.equals(mr)) { // 下月
            calendar.add(Calendar.MONTH, 1);
        }

        // 2 月中日期
        if (sde == null) {
            calendar.set(Calendar.DAY_OF_MONTH, specialDateCode);
        } else {
            if (SpecialDateEnum.LAST_DAY_OF_MONTH.equals(sde)) { // 月底
                calendar.add(Calendar.MONTH, 1);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                calendar.add(Calendar.DAY_OF_MONTH, -1);
            } else {// 月中
                calendar.set(Calendar.DAY_OF_MONTH, 15);
            }
        }

        // 时分秒清零
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();

    }

    /**
     * 固定资产(设施)
     * <p>
     * 对应t_room_facilities表
     * </p>
     */
    public enum FacilitiesType {
        TELEVISION("D003"), // 电视
        AIR_CONDITION("D004"), // 空调
        WASHER("D002"), // 洗衣机
        WATERHEATER("D008"), // 热水器
        RANGE_HOOD("D014"), // 油烟机
        DESK("D007"), // 桌子
        CABINET("D006"), // 柜子
        CHAIR("D015"), // 椅子
        BED("D005"), // 床
        KEY("D016"), // 钥匙
        ;

        private String code;

        FacilitiesType(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    /** 交割进度 */
    public enum Progress {
        UN_DELIVERIED(0, "未交割"), //
        DELIVERIED(1, "已交割");

        private int code;
        private String description;

        Progress(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }

    /** 计费方式 */
    public enum RecordFeeType {
        POST_PAY("000001", "后付费"), //
        PRE_PAY("000002", "预付费"), //

        POST_PAY_ONE_STEP("000003", "后付费不分阶梯"), //
        POST_PAY_TWO_STEPS("000004", "后付费分2阶梯"), //
        POST_PAY_THREE_STEPS("000005", "后付费分3阶梯"), //

        PRE_PAY_ONE_STEP("000006", "预付费不分阶梯"), //
        PRE_PAY_TWO_STEPS("000007", "预付费分2阶梯"), //
        PRE_PAY_THREE_STEPS("000008", "预付费分3阶梯");

        private String code;
        private String description;

        RecordFeeType(String code, String description) {
            this.code = code;
            this.description = description;
        }

        /**
         * @return 是否是与付费编码
         */
        public static boolean isPrePay(String code) {
            if (PRE_PAY.code().equals(code)) {
                return true;
            }
            if (PRE_PAY_ONE_STEP.code().equals(code)) {
                return true;
            }
            if (PRE_PAY_TWO_STEPS.code().equals(code)) {
                return true;
            }
            if (PRE_PAY_THREE_STEPS.code().equals(code)) {
                return true;
            }

            return false;
        }

        /**
         * @return 是否是后付费编码
         */
        public static boolean isPostPay(String code) {
            if (POST_PAY.code().equals(code)) {
                return true;
            }
            if (POST_PAY_ONE_STEP.code().equals(code)) {
                return true;
            }
            if (POST_PAY_TWO_STEPS.code().equals(code)) {
                return true;
            }
            if (POST_PAY_THREE_STEPS.code().equals(code)) {
                return true;
            }

            return false;
        }


        public static String description(String code) {
            for (RecordFeeType rft : RecordFeeType.values()) {
                if (rft.code.equals(code)) {
                    return rft.description;
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

    /** 差额付款方式 */
    public enum DiffHandleType {
        OFFLINE_PAY("000001", "线下付款"), //
        ONLINE_PAY("000002", "线上付款"), //
        RENT_DEDUCTION("000003", "线上与首月租金合并付款");

        private String code;
        private String description;

        DiffHandleType(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public static String description(String code) {
            for (DiffHandleType dht : DiffHandleType.values()) {
                if (dht.code.equals(code)) {
                    return dht.description;
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

    /** 缴纳方 */
    public enum PayParty {
        PROPRIETOR(0, "业主"), //
        ORG(1, "运营商");

        private int code;
        private String description;

        PayParty(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }

    }

    /** 账单应付日期相对于出账日期的月份范围 */
    public enum MonthRange {
        SAME_MONTH(0, "当月"), //
        MEXT_MONTH(1, "次月");

        private int code;
        private String description;

        MonthRange(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static String description(Integer code) {
            if (code == null) {
                return DEFAULT().description();
            }

            for (MonthRange bmr : MonthRange.values()) {
                if (bmr.code() == code) {
                    return bmr.description();
                }
            }
            // 默认为当月
            return DEFAULT().description();
        }

        // 为空时的默认值
        public static MonthRange DEFAULT() {
            return SAME_MONTH;
        }

        /**
         * <pre>
         * (1) code为null时, 返回{@link DEFAULT()}
         * (2) code存在时返回相应枚举
         * (3) code不存在时返回null
         * </pre>
         * @param code
         * @return
         */
        public static MonthRange byCode(Integer code) {
            if (code == null) {
                return DEFAULT();
            }

            for (MonthRange mr : MonthRange.values()) {
                if (mr.code() == code) {
                    return mr;
                }
            }
            return null;
        }

        public int code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }

    /** 特殊的月中日期 */
    public enum SpecialDateEnum {
        LAST_DAY_OF_MONTH(-1, "月底"), //
        MIDDLE_DAY_OF_MONTH(-2, "月中");

        private int code;
        private String description;

        SpecialDateEnum(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static String description(Integer code) {

            if (code == null) {
                code = DEFAULT().code();
            }

            for (SpecialDateEnum bsde : SpecialDateEnum.values()) {
                if (bsde.code() == code) {
                    return bsde.description();
                }
            }

            // 固定的月中日期
            return code + "号";
        }

        // 为空时的默认值
        public static SpecialDateEnum DEFAULT() {
            return LAST_DAY_OF_MONTH;
        }

        /**
         * <pre>
         * (1) code为null时, 返回{@link DEFAULT()}
         * (2) code存在时返回相应枚举
         * (3) code不存在时返回null
         * </pre>
         * @param code
         * @return
         */
        public static SpecialDateEnum byCode(Integer code) {
            if (code == null) {
                return DEFAULT();
            }

            for (SpecialDateEnum sde : SpecialDateEnum.values()) {
                if (sde.code() == code) {
                    return sde;
                }
            }

            return null;
        }

        public int code() {
            return this.code;
        }

        public String description() {
            return this.description;
        }
    }


    /**
     * 电表归属
     */
    public enum ElectricityMeterBelongs {

        PROPERTY_COMPANY(0, "物业公司"), //
        STATE_GRID_Corporation(1, "国家电网");

        private Integer code;
        private String description;

        ElectricityMeterBelongs(Integer code, String description) {
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

            for (ElectricityMeterBelongs e : ElectricityMeterBelongs.values()) {
                if (code.equals(e.code())) {
                    return e.description();
                }
            }
            return "";
        }

    }

}
