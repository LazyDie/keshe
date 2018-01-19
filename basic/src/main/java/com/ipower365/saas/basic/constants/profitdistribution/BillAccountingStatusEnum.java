package com.ipower365.saas.basic.constants.profitdistribution;

/**
 * 账单核算状态枚举
 * @author zhoujiagen
 */
public enum BillAccountingStatusEnum {
    NOT_YET(0, "未核算"), DONE(1, "已核算");

    private Integer code;
    private String name;

    private BillAccountingStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillAccountingStatusEnum get(Integer code) {
        for (BillAccountingStatusEnum type : BillAccountingStatusEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        return null;
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
