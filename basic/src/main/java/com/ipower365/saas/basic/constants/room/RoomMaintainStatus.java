package com.ipower365.saas.basic.constants.room;

public enum RoomMaintainStatus {

    NORMAL("1070001"),HOLDER_MAINTAIN("1070002"), BUSINESS_MAINTAIN("1070003");
    
    RoomMaintainStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
    
    public static RoomMaintainStatus getByCode(String code) {

        for (RoomMaintainStatus status : RoomMaintainStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
