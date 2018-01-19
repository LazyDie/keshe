package com.ipower365.saas.basic.constants;



/**
 * 服务时间段枚举；
 * @author peizihui
 *
 */
public enum TimePeriodStatusEnum {
    // 待确认 已确认 看房中 已完成 关闭 取消
	Morning("1044001","上午"), Noon("1044002","中午"), AfterNoon("1044003","下午"),Evening ("1044004","晚上"), AllDay("1044005","全天"),DefaultAllDay("","全天");

    
    private TimePeriodStatusEnum(String code, String name) {
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

    
    
    public static TimePeriodStatusEnum get(String code) {
        for (TimePeriodStatusEnum e : TimePeriodStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
    
    public static void main(String[] args) {
		// TimePeriodStatusEnum.get(this.timeTypeDesc).getName();
    	System.out.println("TimePeriodStatusEnum =="+TimePeriodStatusEnum.get("1044005").getName());
    	// TimePeriodStatusEnum.get(this.timeTypeDesc).getName();
    	System.out.println("TimePeriodStatusEnum =="+TimePeriodStatusEnum.get("").getName());
	}
  
}
