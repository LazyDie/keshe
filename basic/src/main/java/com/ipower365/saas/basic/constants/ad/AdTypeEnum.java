package com.ipower365.saas.basic.constants.ad;

/**
 * 广告类型
 * 
 * @author Shuaibing.zhao
 * @date 2017年3月13日 下午1:37:09
 */
public enum AdTypeEnum {
    AD_TYPE_START(1,"运营广告"),
    AD_TYPE_BANNER(2,"banner"),
    AD_TYPE_DEFAULT(3,"占位广告")
    ;

    private Integer code;
    private String desc;

    private AdTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdTypeEnum getByCode(Integer code) {
        for (AdTypeEnum type : AdTypeEnum.values()) {
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
