package com.ipower365.saas.basic.constants;



/**
 * 看房状态枚举；
 * @author peizihui
 *
 */
public enum PickRequestStatusEnum {
    // 待确认 已确认 看房中 已完成 关闭 取消
    CREATE("1095001","待确认"), CONFIRM("1095002","已确认"), START("1095003","看房中"),FINISH("1095004","已完成"), CLOSE("1095005","关闭"), CANCEL("1095006"," 取消");

    
    private PickRequestStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private  String code;
    private String name;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
    public static PickRequestStatusEnum get(String code) {
        for (PickRequestStatusEnum e : PickRequestStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
  
}
