package com.ipower365.saas.basic.constants;

public enum FlowBusinessType {
	
	Property("PROPERTY","物业"),
	PropertyContract("PROPERTY_CONTRACT","物业合同"),
	PropertyRentalBill("PROPERTY_RENTAL_BILL","物业租金账单"),
	PropertyResourceBill("PROPERTY_RESOURCE_BILL","物业资源账单"),
	ElectricBillAccounting("ELECTRIC_BILL_ACCOUNTING","电费运营核算"),
	ElectricShareBenefit("ELECTRIC_SHARE_BENEFIT","电费运营分利"),
	Clean("CLEAN","保洁"), // 保洁
	Repair("REPAIR","维修"), //维修；
	Sugession("SUGESSION","投诉建议"), //投诉建议
	CheckRoom("CHECK_ROOM","看房"), //看房
	BookRoom("BOOK_ROOM","预定"),// 订房
	SignRoom("SIGN_ROOM","签约"),// 签约
	ReSignRoom("RESIGN_ROOM","续租"),//续租
	CheckOutRoom("CHECKOUT_ROOM","退房"), //退房
	Sublet("SUBLET","转租"),             //转租
	Refund("REFUND","退款"),             //退款
	MeterRead("METER_READ","抄表"),      //抄表
	EstateApply("ESTATE_APPLY"," 资产申请"), //estate_apply_task  资产申请
	CheckInROOM("CHECK_IN_ROOM"," 入住"), // 入住
	APPROVAL("CHECKOUT_APPROVAL","退房结算"), // 退房结算
	LOAN("CHECKOUT_APPROVAL_LOAN","退房结算放款"), // 退房结算放款
	
/*	  public static String PROCESS_NODE_KEY_BOOK_ROOM="book_room_task";        //订房；
    public static String PROCESS_NODE_KEY_SIGN_ROOM="sign_room_task";        //签约；
    public static String PROCESS_NODE_KEY_RESIGN_ROOM="resign_room_task";       //续租；
    public static String PROCESS_NODE_KEY_CHECK_OUT_ROOM="check_out_room_task";  //退房；
*/	
	/*Cancel("cancel","取消"),
	Close("close","关闭")*/
	;
	
	 private String code;
	 private String name;
	 
	 FlowBusinessType(String code,String name){
		this.code=code;
		this.name=name;
	 }
	 
	 public static FlowBusinessType get(String code){
		 for (FlowBusinessType type : FlowBusinessType.values()) {
	            if (type.code.equals(code)) {
	                return type;
	            }
	        }
		 return null;
//	        throw new IllegalArgumentException("无效编码：" + code);
	 }

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	 
	 

}
