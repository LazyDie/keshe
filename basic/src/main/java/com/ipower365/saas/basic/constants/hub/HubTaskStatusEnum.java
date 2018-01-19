package com.ipower365.saas.basic.constants.hub;


/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.hub
 * @ClassName: HubTaskStatusEnum
 * @author: xushengpeng
 * @time: 2017年7月17日
 * @类说明: 任务状态
 */
public enum HubTaskStatusEnum {

	sync(1,"同步任务"),timing(2,"定时任务");
	
	private Integer code;
	private String name;
	
	private HubTaskStatusEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取code对应的值
	 */
	public static HubTaskStatusEnum getStatus(Integer code){
		if(null == code){
			return null;
		}
		
		for(HubTaskStatusEnum status : HubTaskStatusEnum.values()){
			if(status.code == code){
				return status;
			}
		}
		throw new IllegalArgumentException("没找到匹配的任务状态：" + code);
	}
}
