package com.ipower365.saas.basic.constants;

public class MessageConstants {
	
	
	 //消息提醒主题
    public static final String MESSAGE_TOPIC_REMIND_TICKET_STAFF_MANAGER="/CAPT/TICKET/REMIND/MANAGER";//提醒管家
    public static final String MESSAGE_TOPIC_REMIND_TICKET_STAFF="/CAPT/TICKET/REMIND/STAFF";//提醒服务员工
    public static final String MESSAGE_TOPIC_REMIND_NOTICE_CUSTOMER="/CAPT/NOTICE/REMIND/CUSTOMER";//提醒租客
    public static final String MESSAGE_TOPIC_REMIND_FEE="/CAPT/FEE/REMIND";//费用提醒
    public static final String MESSAGE_TOPIC_REMIND_CHANGE_DEVICE="/CAPT/NOTICE/REMIND/CHGDEVICE";//更改设备提醒
    public static final String MESSAGE_TOPIC_REMIND_IDNO_CHANGE="/CAPT/CUSTOMER/REMIND/IDNOCHANGE";//证件发生变化提醒
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_QUEUE_SOON_CAN_USE="/CAPT/MSG/SHARE_RESOURCE/QUEUE_SOON_CAN_USE"; // 共享资源--排队即将可用
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_QUEUE_CAN_USE="/CAPT/MSG/SHARE_RESOURCE/QUEUE_CAN_USE"; // 共享资源--排队可用
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_QUEUE_WAIT_TIME_OUT="/CAPT/MSG/SHARE_RESOURCE/QUEUE_WAIT_TIME_OUT"; // 共享资源--排队等待超时
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_QUEUE_WAIT_TIME_UPDATE="/CAPT/MSG/SHARE_RESOURCE/QUEUE_WAIT_TIME_UPDATE"; // 共享资源--排队预计等待时间更新
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_USE_SOON_TIME_OUT="/CAPT/MSG/SHARE_RESOURCE/USE_SOON_TIME_OUT"; // 共享资源--使用即将结束
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_USE_TIME_OUT="/CAPT/MSG/SHARE_RESOURCE/USE_TIME_OUT"; // 共享资源--使用超时
    public static final String MESSAGE_TOPIC_SHARE_RESOURCE_HEARTBEAT_DETECTION="/CAPT/MSG/SHARE_RESOURCE/USE_HEARTBEAT_DETECTION"; // 共享资源--心跳检测
    public static final String MESSAGE_TOPIC_REPAID_REMIND="/CAPT/REPAID/FEE/REMIND";//补账单提醒
    public static final String MESSAGE_TOPIC_TENANT_CORRECTION_REMIND="/CAPT/TENANT/CORRECTION/REMIND";//租客纠错提醒
    
    

    //接收人类型  
    public static final String SMS_PERSON_TYPE_EMPLOYEE="1020003"; //员工
    public static final String SMS_PERSON_TYPE_CUSTOMER="1020004"; //客户
    public static final String SMS_PERSON_TYPE_MANAGERCENTER="1020005"; //管理中心
    
    //短信类型
    public static final String SMS_TYPE_MARKET="market";//营销类的短信
    public static final String SMS_TYPE_NOTICE="notice";//通知类短信
    
    
    
    
    //消息分类
    public static  String MESSAGE_CLASSIFICATION="1096";
    public static  String MESSAGE_CLASSIFICATION_NOTICE=MESSAGE_CLASSIFICATION+"001";//通知
    public static  String MESSAGE_CLASSIFICATION_MESSAGE=MESSAGE_CLASSIFICATION+"002";//消息
    public static  String MESSAGE_CLASSIFICATION_ANNOUNCEMENT=MESSAGE_CLASSIFICATION+"003";//公告
    
    //消息类别-----消息分类的细化
    public static String MESSAGE_CATEGORY="1097";
    public static String MESSAGE_CATEGORY_SERVICE=MESSAGE_CATEGORY+"001"; //服务类
    public static String MESSAGE_CATEGORY_BILL=MESSAGE_CATEGORY+"002"; //账单类
    public static String MESSAGE_CATEGORY_CONTRACT=MESSAGE_CATEGORY+"003";//租约类
    public static String MESSAGE_CATEGORY_BALANCE=MESSAGE_CATEGORY+"004";//余额类
    public static String MESSAGE_CATEGORY_SYSTEM=MESSAGE_CATEGORY+"005";//系统消息
    public static String MESSAGE_CATEGORY_WARN=MESSAGE_CATEGORY+"006";//告警类
    
    //消息类型--消息类别的进一步细化
    public static String MESSAGE_TYPE="";
    public static String MESSAGE_TYPE_SERVICE_CLEAN="001"; //保洁
    public static String MESSAGE_TYPE_SERVICE_REPAIR="002"; //维修
    
    
    //用户验证码操作
    public static final String CHECKOUT_OPTYPE_REGISTER="00"; //注册
    public static final String CHECKOUT_OPTYPE_RESETPASSWORD="01";//重置密码
    public static final String CHECKOUT_OPTYPE_CHANGEMOBILE="02";//更换手机号
    public static final String CHECKOUT_OPTYPE_PAYPASSWORD="03";//重置支付密码
    public static final String CHECKOUT_OPTYPE_CHANGEDEVICE="04";//更换终端设备
    public static final String CHECKOUT_OPTYPE_SUBLET="05";//转租
//    public static final String CHECKOUT_OPTYPE_
    
    //消息状态
    public static final String SMS_MESSAGE_STATUS_CREATED="1018001";// created-创建
    public static final String SMS_MESSAGE_STATUS_RECEIVED="1018002";// received-已收到
    public static final String SMS_MESSAGE_STATUS_READ="1018003";// read-已读
    public static final String SMS_MESSAGE_STATUS_TRASH="1018004";// trash-无效
    public static String[] MESSAGE_INVIDE_STATUSES=new String[]{
    	SMS_MESSAGE_STATUS_CREATED,SMS_MESSAGE_STATUS_RECEIVED,SMS_MESSAGE_STATUS_READ};
    
    
    /**
     * 校验验证码类型
     * @param type
     * @return
     */
    public static boolean checkVerfityCodeType(String type){
    	if(CHECKOUT_OPTYPE_REGISTER.equals(type)
    			|| CHECKOUT_OPTYPE_RESETPASSWORD.equals(type)
    			|| CHECKOUT_OPTYPE_CHANGEMOBILE.equals(type)
    			|| CHECKOUT_OPTYPE_CHANGEDEVICE.equals(type)
    			|| CHECKOUT_OPTYPE_SUBLET.equals(type)
    			){
    		return true;
    	}return false;
    }
    
    
    
    

}
