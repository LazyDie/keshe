package com.ipower365.saas.basic.constants.hub;

/**
 * 发布房间目标渠道
 * 
 * @author Qiang
 */
public enum PublishTargetChannel {
	wuba(1, "58同城"), chunmian(2,"春眠");

	private int code;
	private String name;

	private PublishTargetChannel(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static PublishTargetChannel getChannel(Integer code) {
		if (null == code)
			return null;
		for (PublishTargetChannel c : PublishTargetChannel.values()) {
			if (c.code == code)
				return c;
		}
		throw new IllegalArgumentException("没找到匹配的发布渠道：" + code);
	}

}
