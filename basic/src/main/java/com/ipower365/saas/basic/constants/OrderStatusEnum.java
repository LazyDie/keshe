package com.ipower365.saas.basic.constants;

public enum OrderStatusEnum {
    EXAMINING(0, "待审核"), APPROVED(1, "审核通过"), DENIED(2, "拒绝"), INVALIDATED(4, "无效"), FROZEN(5, "冻结");
    private Integer code;
    private String name;

    private OrderStatusEnum(Integer code, String name) {
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

    public static OrderStatusEnum get(Integer code) {
        for (OrderStatusEnum e : OrderStatusEnum.values()) {
            if (e.getCode().equals(code)) return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
}
