package com.ipower365.saas.basic.constants.room;

public enum RoomLockStatus {
    // 无锁,锁定
    NORMAL("1075001"), LOCK("1075002");

    RoomLockStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
    
    public static RoomLockStatus getByCode(String code) {

        for (RoomLockStatus status : RoomLockStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
