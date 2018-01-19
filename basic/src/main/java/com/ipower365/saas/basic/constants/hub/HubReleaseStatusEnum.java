package com.ipower365.saas.basic.constants.hub;

/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.hub
 * @ClassName: PubStatusEnum
 * @author: xushengpeng
 * @time: 2017年7月13日
 * @类说明: 发布房源状态
 */
public enum HubReleaseStatusEnum {
	disabled(0, "已停用"),enabled(1, "已启用");

	private Integer code;
	private String name;
	
	private HubReleaseStatusEnum(Integer code, String name) {
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
	public static HubReleaseStatusEnum getStatus(Integer code){
		if(null == code){
			return null;
		}
		
		for(HubReleaseStatusEnum status : HubReleaseStatusEnum.values()){
			if(status.code == code){
				return status;
			}
		}
		throw new IllegalArgumentException("没找到匹配的状态：" + code);
	}
	
}
