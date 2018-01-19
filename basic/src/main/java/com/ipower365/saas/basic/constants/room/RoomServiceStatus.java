package com.ipower365.saas.basic.constants.room;

public enum RoomServiceStatus {

    SOS("1071001"), CLEAN("1071002"), NO_TROUBLE("1071003"), WAIT("1071004");

    RoomServiceStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RoomServiceStatus getByCode(String code) {

        for (RoomServiceStatus status : RoomServiceStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
