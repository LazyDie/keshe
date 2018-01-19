package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetContractStatus {
    // 创建，生效，解约
    CREATE("1130001"), EFFECTIVE("1130002"), FREEZE("1130003"),CLOSE("1130004");

    AssetContractStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
