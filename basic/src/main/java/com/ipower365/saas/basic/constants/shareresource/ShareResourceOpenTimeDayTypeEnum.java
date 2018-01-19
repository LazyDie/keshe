package com.ipower365.saas.basic.constants.shareresource;

/**
 * 共享资源开放时间的日期类型枚举
 * @author Chris Yin
 * @date Jan 20, 2017
 */
public enum ShareResourceOpenTimeDayTypeEnum {
    Workday(0, "工作日"), 
    Weekend(1, "周末"), 
    ;

    private Integer code;
    private String desc;

    private ShareResourceOpenTimeDayTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static ShareResourceOpenTimeDayTypeEnum getByCode(Integer code) {
        for (ShareResourceOpenTimeDayTypeEnum type : ShareResourceOpenTimeDayTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的日期类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
