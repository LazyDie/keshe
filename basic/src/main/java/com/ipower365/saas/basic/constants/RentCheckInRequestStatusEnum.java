package com.ipower365.saas.basic.constants;

/**
 * 入住状态任务状态
 * @author peizihui
 *
 */
public enum RentCheckInRequestStatusEnum {
    // 待确认 已确认 看房中 已完成 关闭 取消
    CREATE("1085001","待确认"), CHECK_OK("1085002","已确认"), CHECk_NO("1085003","拒绝入住"),FINISH("1085004","已完成"), CLOSE("1085005","关闭"), CANCEL("1085006","取消");

    RentCheckInRequestStatusEnum(String code,String name) {
        this.code = code;
        this.name = name;
    }

    private final String code;
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public static RentCheckInRequestStatusEnum get(String code) {
        for (RentCheckInRequestStatusEnum e : RentCheckInRequestStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
    
}
