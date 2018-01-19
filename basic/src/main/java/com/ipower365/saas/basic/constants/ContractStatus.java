package com.ipower365.saas.basic.constants;

public enum ContractStatus {
    // 创建，生效，解约
    CREATE("1039001"), EFFECTIVE("1039002"), RELIEVE("1039003"),CLOSE("1039004"),CANCEL("1039005");

    ContractStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
