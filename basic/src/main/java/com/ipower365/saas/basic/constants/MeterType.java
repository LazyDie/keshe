package com.ipower365.saas.basic.constants;

public enum MeterType {
    Unovo_Auto(0, "联永自动计量"), Tradition_Manual(1, "传统手工计量");

    private int val;
    private String name;

    private MeterType(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public static MeterType get(int val) {
        for (MeterType type : MeterType.values()) {
            if (type.val == val) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的仪表类别码：" + val);
    }

    public int getValue() {
        return val;
    }

    public String getName() {
        return name;
    }
}
