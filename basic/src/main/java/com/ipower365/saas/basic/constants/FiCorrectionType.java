package com.ipower365.saas.basic.constants;

/**
 * 纠错类型定义
 * @author Aron
 */
public enum FiCorrectionType {
    CalculationError(0, "计算错误"), PaymentError(1, "收款错误"), Others(2, "其他");

    private Integer code;
    private String name;

    private FiCorrectionType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static FiCorrectionType get(Integer code) {
        for (FiCorrectionType type : FiCorrectionType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的对错误类型状态码：" + code);
    }

    public Integer getCode() {
        return code;
    }



    public String getName() {
        return name;
    }
}
