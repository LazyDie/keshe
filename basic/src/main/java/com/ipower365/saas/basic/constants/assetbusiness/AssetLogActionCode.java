package com.ipower365.saas.basic.constants.assetbusiness;

public enum AssetLogActionCode {
	
	Link("LINK","关联"),
	Cancellink("CANCEL_LINK","取消关联"),
	Delivery("DELIVERY","交割"),
	CancelDelivery("CANCEL_DELIVERY","取消交割"),
	
	Freeze("FREEZE","冻结"),
	UnFreeze("UNFREEZE","解冻"),
	Abolish("ABOLISH","废止"),
	Correct("CORRECT","修正");
	
	
	private String code;
    private String desc;
    
	private AssetLogActionCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
    
    public static AssetLogActionCode get(String code){
    	AssetLogActionCode cd=null;
    	if(code==null || "".equals(code))return cd;
    	for(AssetLogActionCode c:AssetLogActionCode.values()){
    		if(c.code.toString().equals(code)){
    			cd=c;break;
    		}
    	}
    	return cd;
    }
    
    public static String getDesc(String code){
    	AssetLogActionCode cd=get(code);
    	return cd==null?"":cd.desc;
    }
    
    

}
