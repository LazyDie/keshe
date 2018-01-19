package com.ipower365.saas.basic.constants.room;

public enum RoomlockOperaType {
    // 解锁,锁
    Unlock(1), LOCK(2);

    RoomlockOperaType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private final int value;

   


}
