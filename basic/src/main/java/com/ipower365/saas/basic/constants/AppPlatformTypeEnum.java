package com.ipower365.saas.basic.constants;

/**
 * app平台类型
 * 
 * @author Shuaibing.zhao
 * @date 2017年3月13日 下午1:37:09
 */
public enum AppPlatformTypeEnum {
    APP_PLATFORM_IOS("ios","IOS平台"),
    APP_PLATFORM_ANDROID("android","ANDROID平台")
    ;

    private String code;
    private String desc;

    private AppPlatformTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AppPlatformTypeEnum getByCode(Integer code) {
        for (AppPlatformTypeEnum type : AppPlatformTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的资源类型：" + code);
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
