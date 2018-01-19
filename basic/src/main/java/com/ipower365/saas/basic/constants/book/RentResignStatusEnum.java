package com.ipower365.saas.basic.constants.book;



/**
 * 预定状态
 * @author peizihui
 *
 */
public enum RentResignStatusEnum {
    // 提交 已确认 锁定(租客付了定金) 关闭 取消
    CREATE("1065001","待审核"), APPROVED("1065002","审核通过"), DENIED("1065003","拒绝"),FINISH("1065013","已完成"), CLOSE("1065004","关闭 "), CANCEL("1065005","取消");

    
private RentResignStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
//    EXAMINING(0, "待审核"), APPROVED(1, "审核通过"), DENIED(2, "拒绝");
    private String code;
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
    
    public static RentResignStatusEnum get(String code) {
        for (RentResignStatusEnum e : RentResignStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
    public static void main(String[] args) {
        System.out.println("ttt==="+RentResignStatusEnum.get(RentResignStatusEnum.FINISH.getCode()).getName());
    }
    
}
