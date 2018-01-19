package com.ipower365.saas.basic.constants;

/**
 * 用电异常解除
 * @author Aron
 */
public enum HouseKeeperAbnormalElectricityAction {
    ResumedByHouseKeeper(0, "管家解除异常");

    private int code;
    private String name;

    private HouseKeeperAbnormalElectricityAction(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static HouseKeeperAbnormalElectricityAction getPaymentType(Integer code) {
        if (null == code) return null;
        for (HouseKeeperAbnormalElectricityAction c : HouseKeeperAbnormalElectricityAction.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的操作类型：" + code);
    }


}
