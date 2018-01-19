package com.ipower365.saas.basic.constants.room;

public enum RoomStatusType {
    APT_SUMMARY("","roomStatus"),HOSTEL_SUMMARY("","hostelStatus"),
    RELEASE("1090001", "releaseStatus"), TEMPORARY("1090002", "tempStatus"), 
    RENT("1090003", "rentStatus"), MAINTANCE("1090004", "maintainStatus"), 
    CLEAN("1090005", "cleanStatus"), SERVICE(
            "1090006", "serviceStatus"), OCCUPY("1090007", "occupyStatus"), 
            LUGGAGE("1090008", "luggageStatus"), LOCK("1090009", "lockStatus");

    RoomStatusType(String code, String key) {
        this.code = code;
        this.key = key;
    }

    private final String code;

    private final String key;

    public String getCode() {
        return code;
    }

    public String getKey() {
        return key;
    }

}
