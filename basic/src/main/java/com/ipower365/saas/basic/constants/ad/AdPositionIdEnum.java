package com.ipower365.saas.basic.constants.ad;
/**
 * 
 * 
 * @author hyl
 *
 */
public enum AdPositionIdEnum {
	
	    POSITION_ID_HousekeeperSTART(1,"管家启动页"),
	    POSITION_ID_HousekeeperHOMEPAGE(2,"管家首页banner"),
	    POSITION_ID_HousekeeperBANNER(3,"管家端家"),
	    POSITION_ID_HOMESTART(4,"白云生启动页"),
	    POSITION_TYPE_HOMEPAGE(5,"找房banner"),
	    POSITION_TYPE_HOMEBANNER(6,"家banner")
	    ;

	    private Integer code;
	    private String desc;

	    private AdPositionIdEnum(Integer code, String desc) {
	        this.code = code;
	        this.desc = desc;
	    }

	    /**
	     * 根据code获取类型
	     */
	    public static AdPositionIdEnum getByCode(Integer code) {
	        for (AdPositionIdEnum type : AdPositionIdEnum.values()) {
	            if (type.code.equals(code)) {
	                return type;
	            }
	        }
	        throw new IllegalArgumentException("无效的资源类型：" + code);
	    }

	    public Integer getCode() {
	        return code;
	    }

	    public String getDesc() {
	        return desc;
	    }
	

}
