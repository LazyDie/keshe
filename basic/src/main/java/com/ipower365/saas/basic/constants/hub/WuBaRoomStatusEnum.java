package com.ipower365.saas.basic.constants.hub;

/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.hub
 * @ClassName: ChunMianRoomStatusEnum
 * @author: Qiang
 * @time: 2017年8月21日
 * @类说明:五八房源查询返回的状态枚举
 */
public enum WuBaRoomStatusEnum {

	/**
	 * houseStatus对应关系：
		1000 => "添加中",表示信息不完整，1、图片数量必须在5-24张范围内；2、请查看图片是否是JPG或PNG的格式
		2000 => "待审核",重新编辑修改过的房源，正在等待客服进行审核的状态
		2150 => "审核拒绝可修改",因轻度违规被审核驳回，可以进行编辑修改并重新发布的状态2200 => "审核失败",因重度违规被审核驳回，不可以进行修改的状态
		3000 => "已发布",房源已展示在58品牌公寓前台的状态
		4000 => "已下架",除已出租外的其他原因，房屋被操作下架的状态
		5000 => "已出租",房屋已出租的状态
		6000 => "已过期",前台展示超过45天未被租出，被自动设置为已过期，需要公寓方定期搜索，重新编辑上传或直接删除

	 */
	
	pending_review(2000,"待审核"),review_pass(3000,"已发布"),review_fail(2150,"审核拒绝可修改"),
	add_ing(1000,"添加中"),already_laid(4000,"已下架"),rented_already(5000,"已出租"),run_out(6000,"已过期");
	private int code;
	private String name;
	
	private WuBaRoomStatusEnum(Integer code, String name) {
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
	public static WuBaRoomStatusEnum getStatus(Integer code){
		if(null == code){
			return null;
		}
		
		for(WuBaRoomStatusEnum status : WuBaRoomStatusEnum.values()){
			if(status.code == code){
				return status;
			}
		}
		throw new IllegalArgumentException("没找到匹配的状态：" + code);
	}
}
