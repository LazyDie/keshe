package com.ipower365.saas.basic.constants;

/**
 * 房间用电异常类型
 * @author Aron
 */
public enum ElectricityAbnormalType {
    CheckinElectricityAbnormal(0, "入住用电异常"), EmptyRoomElectricityAbnormal(1, "空房用电异常");

    private int code;
    private String name;

    private ElectricityAbnormalType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ElectricityAbnormalType getPaymentType(Integer code) {
        if (null == code) return null;
        for (ElectricityAbnormalType c : ElectricityAbnormalType.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的用电异常类型：" + code);
    }

    public static String getString() {
        StringBuffer res = new StringBuffer("ElectricityAbnormalType:");
        for (ElectricityAbnormalType c : ElectricityAbnormalType.values()) {
            res.append(c.getCode()).append(c.getName()).append("|");
        }

        return res.toString();
    }
}
