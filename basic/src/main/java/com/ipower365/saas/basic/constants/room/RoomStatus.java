package com.ipower365.saas.basic.constants.room;

import java.util.ArrayList;
import java.util.List;

public enum RoomStatus {
    // 配置，配置中待租,空房待租，租出，到期待租，业主停用，运营商停用
    INSTALLING("1005001"), INSTALLED("1005002"), VACANT("1005003"), RENTOUT("1005004"), OCCUPY_FORRENT("1005005"), HOLDER_STOP(
            "1005006"), BUSINESS_STOP("1005007");

    RoomStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static RoomStatus getByCode(String code) {

        for (RoomStatus status : RoomStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }

    public static boolean isRentOut(String code) {
        if (RENTOUT.getCode().equals(code) || OCCUPY_FORRENT.getCode().equals(code)) {
            return true;
        }
        return false;
    }

    public static List<String> getAllStatus() {
        List<String> res = new ArrayList<String>();
        for (RoomStatus s : RoomStatus.values()) {
            res.add(s.getCode());
        }

        return res;
    }

}
