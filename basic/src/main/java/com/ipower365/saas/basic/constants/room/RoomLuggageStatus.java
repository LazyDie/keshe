package com.ipower365.saas.basic.constants.room;

public enum RoomLuggageStatus {
    
    EMPTY("1074001"), LIGHT("1074002"), LARGE("1074003");

    RoomLuggageStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
    
    public static RoomLuggageStatus getByCode(String code) {

        for (RoomLuggageStatus status : RoomLuggageStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
