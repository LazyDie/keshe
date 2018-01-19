package com.ipower365.saas.basic.constants;

public enum ResourceLossChargeType {
    FixCharges(0, "固定费用(元)"), FeePercentage(1, "按费用百分比");
    
    private Integer code;
    private String name;

    private ResourceLossChargeType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ResourceLossChargeType get(Integer code) {
        for (ResourceLossChargeType type : ResourceLossChargeType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的资源损耗计费方式码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
