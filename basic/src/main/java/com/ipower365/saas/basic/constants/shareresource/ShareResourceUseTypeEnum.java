package com.ipower365.saas.basic.constants.shareresource;

/**
 * 共享资源使用类型的枚举
 * @author Chris Yin
 * @date Nov 29, 2016
 */
public enum ShareResourceUseTypeEnum {
    Queue(0, "排队资源"), 
    Reserve(1, "预定资源"),
    ;

    private Integer code;
    private String desc;

    private ShareResourceUseTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取使用类型
     */
    public static ShareResourceUseTypeEnum getByCode(Integer code) {
        for (ShareResourceUseTypeEnum type : ShareResourceUseTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的资源使用类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
