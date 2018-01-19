package com.ipower365.saas.basic.constants.shareresource;

/**
 * 共享资源预定状态枚举
 * @author Chris Yin
 * @date Feb 10, 2017
 */
public enum ShareResourceReserveStatusEnum {
    FREE(0, "空闲"), 
    RESERVED_BY_SELF(1, "已预定"), 
    RESERVED_BY_OTHERS(2, "已售出"), 
    NOT_APPLICABLE(3, "不可用"), 
    ;

    private Integer code;
    private String desc;

    private ShareResourceReserveStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取枚举
     */
    public static ShareResourceReserveStatusEnum getByCode(Integer code) {
        for (ShareResourceReserveStatusEnum type : ShareResourceReserveStatusEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的状态：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
