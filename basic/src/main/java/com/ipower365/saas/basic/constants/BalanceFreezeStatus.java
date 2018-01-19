package com.ipower365.saas.basic.constants;

/**
 * 账单冻结状态
 * @author Aron
 */
public enum BalanceFreezeStatus {
    FROZEN(1, "冻结"), RELIEVED(2, "解冻"), PART_RELIEVE(3, "部分解冻");
    private Integer code;
    private String name;

    private BalanceFreezeStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static BalanceFreezeStatus get(Integer code) {
        if (code == null) {
            return null;
        }
        for (BalanceFreezeStatus type : BalanceFreezeStatus.values()) {
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
