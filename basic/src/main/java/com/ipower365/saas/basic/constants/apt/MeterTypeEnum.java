package com.ipower365.saas.basic.constants.apt;

public enum MeterTypeEnum {
    
    METER_TYPE_RESOUREMETER(1, "房间资源仪表"),
    METER_TYPE_TOTALMETER(2, "房间资源总仪表")
    ;

    private Integer code;
    private String desc;

    private MeterTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static MeterTypeEnum getByCode(Integer code) {
        for (MeterTypeEnum type : MeterTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的仪表类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
