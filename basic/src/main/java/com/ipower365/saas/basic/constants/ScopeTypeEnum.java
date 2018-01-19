package com.ipower365.saas.basic.constants;

public enum ScopeTypeEnum { 
    ROOM(0, "房间"), //
    FLOOR(1, "楼层"), //
    BUILDING(2, "楼栋"), //
    PROPERTY(3, "物业"), //
    MANAGE_CENTER(4, "管理中心"), //
    ORG(5, "运营商"), //
    PLATFORM(6, "平台"), //
    ESTATE(7, "资产"), //
    CONTRACT_OPERATING(8, "运营合同"), //
    GUEST_ROOM(9,"客房"),  
    OTHERS(99, "其他");
    
    private Integer code;
    private String name;

    private ScopeTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ScopeTypeEnum get(Integer code) {
        for (ScopeTypeEnum e : ScopeTypeEnum.values()) {
            if (e.getCode().equals(code)) return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
}
