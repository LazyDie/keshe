package com.ipower365.saas.basic.constants.hub;

/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.hub
 * @ClassName: ChunMianRoomStatusEnum
 * @author: xushengpeng
 * @time: 2017年8月21日
 * @类说明:春眠房源查询返回的状态枚举
 */
public enum ChunMianRoomStatusEnum {

	pending_review(1, "待审核"),review_pass(2, "审核通过"),review_fail(3, "审核失败"),
	pending_rent(10, "待出租"),full_rent(11, "已整租"),section_rent(12, "部分出租"),
	delete(-1, "删除"),pending_perfect(-2, "待完善");
	private int code;
	private String name;
	
	private ChunMianRoomStatusEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
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
	public static ChunMianRoomStatusEnum getStatus(Integer code){
		if(null == code){
			return null;
		}
		
		for(ChunMianRoomStatusEnum status : ChunMianRoomStatusEnum.values()){
			if(status.code == code){
				return status;
			}
		}
		throw new IllegalArgumentException("没找到匹配的状态：" + code);
	}
}
