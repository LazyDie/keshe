package com.ipower365.saas.basic.constants.book;



/**
 * 预定状态
 * @author peizihui
 *
 */
public enum RentBookStatusEnum {
    // 提交 已确认 锁定(租客付了定金) 关闭 取消
    CREATE("1045001","待确认"), CONFIRMED("1045002","已确认"), LOCK("1045003","已收款"),FINISH("1045013","已完成"), CLOSE("1045004","关闭 "), CANCEL("1045005","取消");

    
private RentBookStatusEnum(String code, String name) {
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
    
    public static RentBookStatusEnum get(String code) {
        for (RentBookStatusEnum e : RentBookStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
    public static void main(String[] args) {
        System.out.println("ttt==="+RentBookStatusEnum.get(RentBookStatusEnum.FINISH.getCode()).getName());
    }
    
}
