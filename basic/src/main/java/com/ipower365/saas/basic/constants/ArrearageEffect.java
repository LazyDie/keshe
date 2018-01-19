package com.ipower365.saas.basic.constants;

public enum ArrearageEffect {
    NO_EFFECT("0", "无影响"), LOCK_DEVICE("1", "锁设备"), LOCK_DOOR("2", "锁房"), LOCK_DD("3", "锁房锁设备");

    private String code;
    private String name;

    private ArrearageEffect(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
