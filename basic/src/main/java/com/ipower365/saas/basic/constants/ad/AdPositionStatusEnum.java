package com.ipower365.saas.basic.constants.ad;

/**
 * 广告位状态
 * 
 * @author Shuaibing.zhao
 * @date 2017年3月13日 下午1:37:09
 */
public enum AdPositionStatusEnum {
    STATUS_EFFECTIVE(1,"有效"),
    STATUS_UNEFFECTIVE(-1,"无效")
    ;

    private Integer code;
    private String desc;

    private AdPositionStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdPositionStatusEnum getByCode(Integer code) {
        for (AdPositionStatusEnum type : AdPositionStatusEnum.values()) {
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
