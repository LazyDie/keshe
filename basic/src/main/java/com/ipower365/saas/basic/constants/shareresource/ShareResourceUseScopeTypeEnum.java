package com.ipower365.saas.basic.constants.shareresource;

/**
 * 共享资源使用范围类型的枚举
 * @author Chris Yin
 * @date Nov 29, 2016
 */
public enum ShareResourceUseScopeTypeEnum {
    All(0, "全部客户"), 
    Organization(1, "运营商"),
    ManagerCenter(2, "管理中心"),
    Building(3, "楼栋"),
    Floor(4, "楼层"),
    Room(5, "客房"),
    Community(6, "小区")
    ;

    private Integer code;
    private String desc;

    private ShareResourceUseScopeTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取使用类型
     */
    public static ShareResourceUseScopeTypeEnum getByCode(Integer code) {
        for (ShareResourceUseScopeTypeEnum type : ShareResourceUseScopeTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效的资源使用范围类型：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
