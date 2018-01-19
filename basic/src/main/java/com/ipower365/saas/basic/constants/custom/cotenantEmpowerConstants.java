package com.ipower365.saas.basic.constants.custom;


/**
 * 同住人权限常量
 * 
 * @ProjectName: basic
 * @ClassName: cotenantEmpowerConstants.java
 * @Description: 
 * @author: Shuaibing.zhao
 * @date: 2017年7月17日 下午9:17:08
 */
public class cotenantEmpowerConstants {
	
	// 同住人权限类型
	public enum PowerType{
		
		RENTER_TYPE(1,"承租人权限"), BILL_TYPE(2,"账单权限");

	    private Integer code;
	    private String desc;

	    private PowerType(Integer code, String desc) {
	        this.code = code;
	        this.desc = desc;
	    }

	    /**
	     * 根据code获取类型
	     */
	    public static PowerType getByCode(Integer code) {
	        for (PowerType type : PowerType.values()) {
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
	
	// 同住人权限行状态
	public enum PowerStatus{
		
		EFFECTIVE(1,"有效"), UNEFFECTIVE(-1,"无效");

	    private Integer code;
	    private String desc;

	    private PowerStatus(Integer code, String desc) {
	        this.code = code;
	        this.desc = desc;
	    }

	    /**
	     * 根据code获取类型
	     */
	    public static PowerStatus getByCode(Integer code) {
	        for (PowerStatus type : PowerStatus.values()) {
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

}
