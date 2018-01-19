package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetLogCategory {
	
	Property("PROPERTY","物业"),
	Bill("BILL","账单");
	

	private String code;
	private String desc;
	
	AssetLogCategory(String code,String desc){
		this.code=code;
		this.desc=desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	public static AssetLogCategory get(String code){
		AssetLogCategory cd=null;
    	if(code==null || "".equals(code))return cd;
    	for(AssetLogCategory c:AssetLogCategory.values()){
    		if(c.code.toString().equals(code)){
    			cd=c;break;
    		}
    	}
    	return cd;
    }
    
    public static String getDesc(String code){
    	AssetLogCategory cd=get(code);
    	return cd==null?"":cd.desc;
    }
	
}
