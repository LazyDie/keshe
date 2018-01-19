package com.ipower365.saas.basic.constants.ad;

/**
 * 广告状态
 * 
 * @author Shuaibing.zhao
 * @date 2017年3月13日 下午1:37:09
 */
public enum AdStatusEnum {
    STATUS_PENDING_RELEASE(1,"待发布"),
    STATUS_ONLINE(2,"已上线"),
    STATUS_OFFLINE(3,"已下线"),
    STATUS_PENDING_ONLINE(4,"待上线"),
    STATUS_DELETE(-1,"已删除"),
    ;

    private Integer code;
    private String desc;

    private AdStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdStatusEnum getByCode(Integer code) {
        for (AdStatusEnum type : AdStatusEnum.values()) {
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
