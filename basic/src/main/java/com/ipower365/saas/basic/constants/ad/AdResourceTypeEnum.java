package com.ipower365.saas.basic.constants.ad;

/**
 * 广告资源类型
 * 
 * @ProjectName: Ad
 * @ClassName: AdResourceTypeEnum.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年3月16日 下午1:46:11
 */
public enum AdResourceTypeEnum {
    RESOURCE_TYPE_PIC(1,"图片资源"),
    RESOURCE_TYPE_VIDEO(2,"视频资源")
    ;

    private Integer code;
    private String desc;

    private AdResourceTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdResourceTypeEnum getByCode(Integer code) {
        for (AdResourceTypeEnum type : AdResourceTypeEnum.values()) {
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
