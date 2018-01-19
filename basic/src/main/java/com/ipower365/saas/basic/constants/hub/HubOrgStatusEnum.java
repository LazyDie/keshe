package com.ipower365.saas.basic.constants.hub;


/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.hub
 * @ClassName: OrgStatus
 * @author: xushengpeng
 * @time: 2017年7月11日
 * @类说明: 运营商的状态管理
 */
public enum HubOrgStatusEnum {

	normal(1, "正常"), freeze(0, "冻结");
	private Integer code;
	private String name;
	
	private HubOrgStatusEnum(Integer code, String name) {
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
	public static HubOrgStatusEnum getStatus(Integer code){
		if(null == code){
			return null;
		}
		
		for(HubOrgStatusEnum status : HubOrgStatusEnum.values()){
			if(status.code == code){
				return status;
			}
		}
		throw new IllegalArgumentException("没找到匹配的运营商状态：" + code);
	}
}
