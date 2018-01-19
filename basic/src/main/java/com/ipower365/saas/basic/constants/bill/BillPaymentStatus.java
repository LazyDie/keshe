package com.ipower365.saas.basic.constants.bill;

/**
 * @author Aron
 */
public enum BillPaymentStatus {
    Paid(0, "已支付"), NotPaid(1, "待支付"), NotFullyPaid(2, "未完全支付");

    private Integer val;    
    private String name;

    private BillPaymentStatus(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private BillPaymentStatus(Integer val) {
        this.val = val;
    }

    public Integer getValue() {
        return val;
    }

    public static BillPaymentStatus get(Integer val) {
        if (val == null) {
            return null;
        }

        for (BillPaymentStatus status : BillPaymentStatus.values()) {
            if (status.val.equals(val)) {
                return status;
            }
        }

        throw new IllegalArgumentException("无效的订单状态：" + val);
    }

}
