package com.ipower365.saas.basic.constants.bill;

/**
 * 账单创建类型,用于区分每日自动扣款的临时资源账单还是最终账单日的资源账单
 * @author Aron
 */
public enum BillCreationType {
    Auto(2, "自动生成的账单"), Manual(3, "手工创建的账单");

    private Integer code;
    private String name;

    private BillCreationType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillCreationType get(Integer code) {
        for (BillCreationType type : BillCreationType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效账单创建方式类型码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
