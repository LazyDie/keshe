package com.ipower365.saas.basic.constants;

public enum AreaType {
    BUILDING(1, "楼栋"), FLOOR(2, "楼层"), ROOM(3, "客房"), MGR_CENTER(4, "管理中心"), PROPERTY(5, "物业");

    private Integer code;
    private String name;

    AreaType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static AreaType getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        AreaType[] types = AreaType.values();
        for (AreaType type : types) {
            if (type.getCode().intValue() == code.intValue()) {
                return type;
            }
        }
        return null;
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
}
