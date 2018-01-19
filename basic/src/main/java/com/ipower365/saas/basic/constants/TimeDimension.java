package com.ipower365.saas.basic.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * 账单类型,用于区分每日自动扣款的临时资源账单还是最终账单日的资源账单
 * @author Aron
 */
public enum TimeDimension {
    Day(0, "天"), Month(2, "月"), Year(3, "年");

    private Integer code;
    private String name;

    private TimeDimension(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static TimeDimension get(Integer code) {
        for (TimeDimension type : TimeDimension.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效时间维度类型码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }

    public static Map<TimeDimension, String> dateFormatMap = new HashMap<TimeDimension, String>();
    static {
        dateFormatMap.put(TimeDimension.Day, "%Y-%m-%d");
        dateFormatMap.put(TimeDimension.Month, "%Y-%m");
        dateFormatMap.put(TimeDimension.Year, "%Y");
    }
}
