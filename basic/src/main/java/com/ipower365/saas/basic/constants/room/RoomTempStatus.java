package com.ipower365.saas.basic.constants.room;

/**
 * 临时房态
 * @author anker.du
 * @date 2016年2月2日 上午9:10:22
 */
public enum RoomTempStatus {

    USE_SELF("1076001"), RETAIN("1076002");

    RoomTempStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RoomTempStatus getByCode(String code) {

        for (RoomTempStatus status : RoomTempStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
