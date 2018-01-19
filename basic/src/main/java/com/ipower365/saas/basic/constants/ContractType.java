package com.ipower365.saas.basic.constants;
/**
 * 合同类型
 * @author anker.du
 * @date 2016年1月15日 下午7:56:57
 */
public enum ContractType {
    // 签约 续租 换房 转租
    RENT_GENERAL("1047001"), RENT_EXTEND("1047002"), RENT_EXCHANGE("1047003"), RENT_TRANSFER("1047004");

    ContractType(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
