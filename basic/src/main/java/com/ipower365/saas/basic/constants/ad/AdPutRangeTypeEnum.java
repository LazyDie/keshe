package com.ipower365.saas.basic.constants.ad;

/**
 * 广告投放范围类型
 * 
 * @ProjectName: Ad
 * @ClassName: AdResourceTypeEnum.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年3月16日 下午1:46:11
 */
public enum AdPutRangeTypeEnum {
    PUT_RANGE_TYPE_ORG(1,"管理中心"),
    PUT_RANGE_TYPE_CITY(2,"城市"),
    PUT_RANGE_TYPE_OPERATOR(3,"运营商"),
    PUT_RANGE_TYPE_ISALL(-1,"全部投放")
    ;

    private Integer code;
    private String desc;

    private AdPutRangeTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static AdPutRangeTypeEnum getByCode(Integer code) {
        for (AdPutRangeTypeEnum type : AdPutRangeTypeEnum.values()) {
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
