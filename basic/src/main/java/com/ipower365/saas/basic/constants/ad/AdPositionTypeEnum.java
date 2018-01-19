package com.ipower365.saas.basic.constants.ad;

/**
 * 广告位类型
 * 
 * @author Shuaibing.zhao
 * @date 2017年3月13日 下午1:37:09
 */
public enum AdPositionTypeEnum {
    POSITION_TYPE_START(1,"启动页"),
    POSITION_TYPE_HOMEPAGE(2,"首页banner"),
    POSITION_TYPE_HOMEBANNER(3,"家页面banner")
    ;

    private Integer code;
    private String desc;

    private AdPositionTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdPositionTypeEnum getByCode(Integer code) {
        for (AdPositionTypeEnum type : AdPositionTypeEnum.values()) {
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
