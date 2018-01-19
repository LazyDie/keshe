package com.ipower365.saas.basic.constants.room;

public enum RoomlockReason {
    OVERDUE_POWEROFF("1115001"), // 欠费自动断电
    PAID_POWERON("1115002"), // 缴费来电解锁
    MANUAL_LOCK("1115003"), // 手动上锁
    MANUAL_UNLOCK("1115004"), // 手动解锁
    HARDWARE_REQUIRED_UNLOCK("1115005"), // 硬件需要解锁
    CHECKOUT_UNLOCK("1115006"), // 退房解锁
    ;

    RoomlockReason(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    /**
     * 是否可以强制解锁
     * @param code
     * @return
     */
    public static boolean canUnlockForce(String code) {
        if (MANUAL_UNLOCK.getCode().equals(code) || HARDWARE_REQUIRED_UNLOCK.getCode().equals(code) || CHECKOUT_UNLOCK.getCode().equals(code)) {
            return true;
        }
        return false;
    }

}
