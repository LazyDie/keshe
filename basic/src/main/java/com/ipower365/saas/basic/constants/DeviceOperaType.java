package com.ipower365.saas.basic.constants;

public enum DeviceOperaType {

    // 开， 关，锁定，解锁, 设置常开，设置密码 获取密码
    OPEN("1077001"), CLOSE("1077002"), LOCK("1077003"), UNLOCK("1077004"), SET_KEEPOPEN("1077005"), SET_PWD("1077006"),GAIN_PWD("1077007"),RESET_PWD("1077008"),
    //获取临时权限，删除临时权限
    GET_TEM_AUT("1077009"),DEL_TEM_AUT("1077010"),
    //白云深获取临时密码, 白云深客人获取临时密码, 管家端获取临时密码, 实施工具获取临时密码
    GET_KEYPWD_BYS("1077011"), GET_KEYPWD_BYS_GUEST("1077012"), GET_KEYPWD_GJ("1077013"), GET_KEYPWD_SS("1077014");
    
    DeviceOperaType(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
