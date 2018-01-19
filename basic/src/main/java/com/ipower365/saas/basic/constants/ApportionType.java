package com.ipower365.saas.basic.constants;

/**
 * 分摊方式
 * @author Aron
 */
public enum ApportionType {


    NoApportion(0, "不分摊"), Capita(1, "按住客"), Resident(2, "按住户");

    private Integer code;
    private String name;

    private ApportionType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }


    public static ApportionType get(Integer code) {
        for (ApportionType type : ApportionType.values()) {
            if (type.code == code) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的分摊类型ID:" + code);
    }


    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
