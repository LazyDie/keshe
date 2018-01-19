package com.ipower365.saas.basic.constants.room;

public enum RoomOccupyStatus {

    UNKNOW("1073001"), SOMEBODY("1073002"), NOBODY("1073003");

    RoomOccupyStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RoomOccupyStatus getByCode(String code) {

        for (RoomOccupyStatus status : RoomOccupyStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
