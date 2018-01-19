package com.ipower365.saas.basic.constants.shareresource;

/**
 * 计量单位
 * @author Chris Yin
 * @date Apr 8, 2017
 */
public enum MeasurementUnitEnum {
    SECOND(0, "秒"), 
    MILLI_KWH(1, "千分之一度"),
    MILLI_T(2, "千分之一吨"),
    HOUSEHOLD(3, "户"),
    PERSON(4, "人"),
    MILLI_CM(5, "千分之一立方米"),
    ;

    private Integer code;
    private String desc;

    private MeasurementUnitEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static MeasurementUnitEnum getByCode(Integer code) {
        for (MeasurementUnitEnum type : MeasurementUnitEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的单位：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
