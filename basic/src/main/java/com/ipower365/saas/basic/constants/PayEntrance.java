package com.ipower365.saas.basic.constants;

/**
 * 支付入口，App或者web
 * @author Aron
 */
public enum PayEntrance {
    APP(0, "APP"), Web(1, "Web"), AutoPay(2, "自动扣款"), OffLine(3, "Off Line"), Update(4, "自动由余额转入预存款"), ResourceOperating(5, "电费运营");

    private int code;
    private String name;

    private PayEntrance(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PayEntrance get(Integer code) {
        if (null == code) return null;
        for (PayEntrance c : PayEntrance.values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("没找到匹配的支付入口：" + code);
    }

}
