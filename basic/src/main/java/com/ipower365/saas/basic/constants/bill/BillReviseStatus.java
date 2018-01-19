package com.ipower365.saas.basic.constants.bill;

/**
 * 账单修正类型
 * @author Aron
 */
public enum BillReviseStatus {
    Normal(0, "正常"), Revised(1, "修正");

    private Integer code;
    private String name;

    private BillReviseStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillReviseStatus get(Integer code) {
        for (BillReviseStatus type : BillReviseStatus.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效账单类型码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
