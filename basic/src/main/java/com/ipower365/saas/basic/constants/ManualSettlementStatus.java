package com.ipower365.saas.basic.constants;

/**
 * 手工入账结账状态
 * @author Aron
 */
public enum ManualSettlementStatus {
    SettlementOff(0, "已结账"), NotSettlementOff(1, "待结账"), PaymentOver(2, "支付完成");

    private Integer val;
    private String name;

    private ManualSettlementStatus(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ManualSettlementStatus(Integer val) {
        this.val = val;
    }

    public Integer getValue() {
        return val;
    }

    public static ManualSettlementStatus get(Integer val) {
        if (val == null) {
            return null;
        }

        for (ManualSettlementStatus status : ManualSettlementStatus.values()) {
            if (status.val.equals(val)) {
                return status;
            }
        }

        throw new IllegalArgumentException("无效的结账状态：" + val);
    }

}
