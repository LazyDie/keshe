package com.ipower365.saas.basic.constants.bill;

/**
 * 账单冻结状态
 * @author Aron
 */
public enum BillFrozenStatus {
    Normal(0, "正常"), Frozen(1, "被冻结");

    private Integer code;
    private String name;

    private BillFrozenStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillFrozenStatus get(Integer code) {
        for (BillFrozenStatus type : BillFrozenStatus.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效冻结状态码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
