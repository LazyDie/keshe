package com.ipower365.saas.basic.constants.assetbusiness;

/**
 * 电费运营区域配置类型
 * @author anker
 */
public enum AssetAreaConfigType {
    // 1物业；2管理中心
    PROPERTY(1), SERVICE_CENTER(2);

    AssetAreaConfigType(Integer code) {
        this.code = code;
    }

    private final Integer code;

    public Integer getCode() {
        return code;
    }


}
