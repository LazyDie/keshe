package com.ipower365.saas.basic.constants;

public enum DoorPrivilegeEvent {

    TENANT("1078001"), VISITOR("1078002");

    DoorPrivilegeEvent(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

}
