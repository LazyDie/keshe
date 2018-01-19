package com.ipower365.saas.basic.constants.bill;

/**
 * 账单类型
 * @author Aron
 */
public enum BillType {
    NormalBill(0, "正常账单"), InvalidBill(1, "无效账单"), BadDebtsBill(2, "坏账账单"), ErrorDebtsBill(3, "错帐账单"), RevisedDebtsBill(4, "修正账单");

    private Integer code;
    private String name;

    private BillType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillType get(Integer code) {
        for (BillType type : BillType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效账单类型码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
