package com.ipower365.saas.basic.constants;

/**
 * 异常用电恢复类型
 * @author Aron
 */
public enum ElectricityAbnormalResumeType {
    ElectricityResumedAuto(0, "用电异常自动恢复"), ElectricityResumedByHouseKeeper(1, "用电异常管家恢复");

    private int code;
    private String name;

    private ElectricityAbnormalResumeType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ElectricityAbnormalResumeType getPaymentType(Integer code) {
        if (null == code) return null;
        for (ElectricityAbnormalResumeType c : ElectricityAbnormalResumeType.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的用电异常类型：" + code);
    }

    public static String getString() {
        StringBuffer res = new StringBuffer("ElectricityAbnormalType:");
        for (ElectricityAbnormalResumeType c : ElectricityAbnormalResumeType.values()) {
            res.append(c.getCode()).append(c.getName()).append("|");
        }

        return res.toString();
    }
}
