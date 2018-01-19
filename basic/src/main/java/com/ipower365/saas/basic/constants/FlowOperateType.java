package com.ipower365.saas.basic.constants;

public enum FlowOperateType {
	
	Request("request","申请"),Claim("claim","认领"),Start("start","开始"),Finish("finish","完成"),
	Transfer("transfer","转发"),Return("return","退回"),Cancel("cancel","取消"),Close("close","关闭");
	
	 private String code;
	 private String name;
	 
	 FlowOperateType(String code,String name){
		this.code=code;
		this.name=name;
	 }
	 
	 public static FlowOperateType get(String code){
		 for (FlowOperateType type : FlowOperateType.values()) {
	            if (type.code.equals(code)) {
	                return type;
	            }
	        }

	        throw new IllegalArgumentException("无效编码：" + code);
	 }

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	 
	 

}
