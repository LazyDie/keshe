package com.ipower365.saas.basic.constants;

/**
 * 计量方式
 * @author Aron
 */
public enum MeasurementType {
    UnovoMeasure(0, "联寓计量"), TraditionManual(1, "人工抄表"), ByRoom(2, "按住户"), ByUser(3, "按住客"), ByTime(4, "按时间");

    private Integer code;
    private String name;

    private MeasurementType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }


    public String getName() {
        return name;
    }



    public static MeasurementType get(int code) {
        for (MeasurementType type : MeasurementType.values()) {
            if (type.code == code) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的计费方式Id:" + code);
    }

}
