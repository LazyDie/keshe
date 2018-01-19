package com.ipower365.saas.basic.constants;

/**
 * 对外转账支付结果
 * @author Aron
 */
public enum TransferOutType {
    EnterpriseSettlement(0, "运营商结算"), CahsWithdrawal(1, "租客取现");

    private Integer code;
    private String name;

    private TransferOutType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static TransferOutType get(Integer code) {
        for (TransferOutType type : TransferOutType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的对外转账类型码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
