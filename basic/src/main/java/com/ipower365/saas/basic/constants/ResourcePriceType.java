package com.ipower365.saas.basic.constants;

/**
 * 资源定价方式：单一定价、阶梯价格等，目前只支持单一定价
 * @author Aron
 */
public enum ResourcePriceType {

    UnifiedPrice(0, "单一定价");

    private Integer code;
    private String name;

    private ResourcePriceType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ResourcePriceType get(Integer code) {
        for (ResourcePriceType type : ResourcePriceType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的定价方式码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }


}
