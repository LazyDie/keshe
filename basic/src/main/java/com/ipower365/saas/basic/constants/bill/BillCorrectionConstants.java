package com.ipower365.saas.basic.constants.bill;

import java.util.HashMap;
import java.util.Map;

public class BillCorrectionConstants {
	
	public static final Map<Integer, String> ERROR_TYPE_MAP=new HashMap<Integer, String>();
	public static final Map<Integer, String> REVISED_TYPE_MAP=new HashMap<Integer, String>();
	static {
		ERROR_TYPE_MAP.put(0, "收款错误");
		ERROR_TYPE_MAP.put(1, "计算错误");
		ERROR_TYPE_MAP.put(2, "其他");
		
		REVISED_TYPE_MAP.put(0, "生成账单");
		REVISED_TYPE_MAP.put(1, "退款");
		REVISED_TYPE_MAP.put(2, "责任人承担");
		REVISED_TYPE_MAP.put(3, "其他");
	}
	

}
