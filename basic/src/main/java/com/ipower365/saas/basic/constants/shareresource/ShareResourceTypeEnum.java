package com.ipower365.saas.basic.constants.shareresource;

/**
 * 共享资源类型的枚举
 * @author Chris Yin
 * @date Dec 8, 2016
 */
public enum ShareResourceTypeEnum {
    KITCHEN(0, "厨房"),
    REST_ROOM(1, "卫生间"),
    SHOWER_ROOM(2, "淋浴房"),
    MEETING_ROOM(3, "会议室"),
    PLAY_ROOM(4, "棋牌室"),
    ACTIVITY_ROOM(5, "活动室"),
    LAUNDRY_ROOM(6, "洗衣房"),
    OTHER(99, "其他"),
    ;

    private Integer code;
    private String desc;

    private ShareResourceTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static ShareResourceTypeEnum getByCode(Integer code) {
        for (ShareResourceTypeEnum type : ShareResourceTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的资源类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
