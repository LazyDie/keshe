package com.ipower365.saas.basic.constants.bill;

public enum BillCycle {
//    ByReadingMeter(0, "按抄表周期"), ByBillDay(1, "租客按帐期");
    By1Min(0, "一分钟"), By5Min(1, "五分钟"), ByHour(2, "一小时"), ByDay(3, "一天"), By1Mon(4, "一个月"), By2Mon(5, "两个月"), ByQuarter(
            6, "一个季度"), By2Quarter(7, "两个季度"), By3Quarter(8, "三个季度"), ByYear(9, "一年"), By2Year(10, "两年"), ByCheckout(
            11, "退房时结算");

    private Integer code;
    private String name;

    private BillCycle(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BillCycle get(Integer code) {
        for (BillCycle type : BillCycle.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效结算周期码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
