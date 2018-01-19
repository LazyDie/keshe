package com.ipower365.saas.basic.constants.custom;

public enum CustomAuthenChannelEnum {
	
	AuthenChannelManualInput(0, "手动填写"),
	AuthenChannelReadCard(1, "读卡器获取")
	;
	
	private Integer code;
	private String name;
	
	private CustomAuthenChannelEnum(Integer code,String name){
		this.code=code;
		this.name=name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static CustomAuthenChannelEnum getAuthenChannel(Integer code) {
        if (null == code) return null;
        for (CustomAuthenChannelEnum c : CustomAuthenChannelEnum.values()) {
            if (c.code.intValue() == code.intValue()) return c;
        }
        throw new IllegalArgumentException("没找到匹配的类型：" + code);
    }
}
