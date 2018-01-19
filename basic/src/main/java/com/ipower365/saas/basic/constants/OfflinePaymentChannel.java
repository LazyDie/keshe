package com.ipower365.saas.basic.constants;

public enum OfflinePaymentChannel {
    // 现金，银行卡
    Cash("1118001", 0), BankCard("1118002", 1), Alipay("1118003", 5), Weixin("1118004", 6), Yuefu58("1118005", 4), Hfq("1118006", 2), Baletu("1118007",3);

    OfflinePaymentChannel(String code, Integer value) {
        this.code = code;
        this.value = value;
    }

    private final String code;
    private final Integer value; // ManualPaymentChannel映射

    public String getCode() {
        return code;
    }

    public Integer getValue() {
        return value;
    }

    public static OfflinePaymentChannel getByCode(String code) {
        for (OfflinePaymentChannel status : OfflinePaymentChannel.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }

}
