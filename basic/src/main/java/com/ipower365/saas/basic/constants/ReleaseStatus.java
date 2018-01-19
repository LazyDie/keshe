package com.ipower365.saas.basic.constants;

public enum ReleaseStatus {
    // 未发布，已发布
    UN_RELEASE("1007001"), RELEASED("1007002");

    ReleaseStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static ReleaseStatus getByCode(String code) {

        for (ReleaseStatus status : ReleaseStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }

}
