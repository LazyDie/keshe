package com.ipower365.saas.basic.constants;

/**
 * 管家断电供电操作类型
 * @author Aron
 */
public enum HouseKeeperPowerOffPowerOnAction {
    PowerOffWhenArrears(0, "欠费断电"), PowerOnWhenRecharge(1, "充值供电");

    private int code;
    private String name;

    private HouseKeeperPowerOffPowerOnAction(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static HouseKeeperPowerOffPowerOnAction getPaymentType(Integer code) {
        if (null == code) return null;
        for (HouseKeeperPowerOffPowerOnAction c : HouseKeeperPowerOffPowerOnAction.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的操作类型：" + code);
    }


}
