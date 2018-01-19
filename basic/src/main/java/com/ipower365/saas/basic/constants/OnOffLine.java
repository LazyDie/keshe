package com.ipower365.saas.basic.constants;

public enum OnOffLine {
	
	OnLine("ONLINE","线上"),OffLine("OFFLINE","线下");
	
	
	
	private String code;
    private String name;

    private OnOffLine(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static OnOffLine get(String code) {
        for (OnOffLine type : OnOffLine.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("无效编码：" + code);
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
    
}
