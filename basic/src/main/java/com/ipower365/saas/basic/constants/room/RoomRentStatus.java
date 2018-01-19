package com.ipower365.saas.basic.constants.room;

public enum RoomRentStatus {

    COLLECT("1069001"), INSTALL("1069002"), VACANT("1069003"), BOOKING("1069004"), RENTOUT("1069005"), RETAIN("1069006"), REFUND("1069007"), OCCUPY_FORRENT("1069008");

    RoomRentStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RoomRentStatus getByCode(String code) {

        for (RoomRentStatus status : RoomRentStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
