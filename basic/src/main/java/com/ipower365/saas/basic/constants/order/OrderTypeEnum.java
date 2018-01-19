package com.ipower365.saas.basic.constants.order;


/**
 * 订单类型
 * 
 * @ProjectName: basic
 * @ClassName: OrderType.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年7月17日 下午9:05:01
 */
public enum OrderTypeEnum {
	
	ROOM_RESOURCE(1,"房间资源订单"),
    SHARE_RESOURCE(2,"共享资源订单")
    ;

    private Integer code;
    private String desc;

    private OrderTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取类型
     */
    public static OrderTypeEnum getByCode(Integer code) {
        for (OrderTypeEnum type : OrderTypeEnum.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("根据code获取类型异常：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
