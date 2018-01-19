package com.ipower365.saas.basic.constants;

/**
 * 抄表类型
 * @author Aron
 */
public enum MeterReadingType {
    ReadingByCheckin(0, "签入抄表"), CommonReading(1, "常规抄表"), ReadingByCheckOut(2, "签出抄表");

    private int val;
    private String name;

    private MeterReadingType(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public static MeterReadingType get(int val) {
        for (MeterReadingType type : MeterReadingType.values()) {
            if (type.val == val) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的抄表类型码：" + val);
    }

    public int getValue() {
        return val;
    }

    public String getName() {
        return name;
    }
}
