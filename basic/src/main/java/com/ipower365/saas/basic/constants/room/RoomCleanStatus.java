package com.ipower365.saas.basic.constants.room;

public enum RoomCleanStatus {

    DIRTY("1071001"), CLEANING("1071002"), CLEAN_OVER("1071003"), CHECKING("1071004"), CLEAN("1071005");

    RoomCleanStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
    
    public static RoomCleanStatus getByCode(String code) {

        for (RoomCleanStatus status : RoomCleanStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
