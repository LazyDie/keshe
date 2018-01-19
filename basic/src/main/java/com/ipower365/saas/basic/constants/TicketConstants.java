package com.ipower365.saas.basic.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.ipower365.saas.basic.constants.bill.BillSubSubjectEnum;
import com.ipower365.saas.basic.constants.shareresource.MeasurementUnitEnum;


/**
 * 
* @ProjectName : 公寓系统-ticketservice
* @ClassName: TicketConstants 
* @Description: 服务请求部分系统常量数据
* @author liwh 
* @date 2015年10月17日 下午3:29:11 
*
 */
public class TicketConstants {
	//订单类型-流程类型映射关系
	public static Map<String, String> ORDER_FLOW_MAP=new HashMap<String, String>();
	
	//服务类型-订单类型映射关系
	public static Map<String, String> SERVICE_ORDER_MAP=new HashMap<String, String>();
		
	//服务类型-请求类型映射关系
	public static Map<String, String> SERVICE_REQUEST_MAP=new HashMap<String, String>();
		
	
	//请求类型-流程类型关联关系
	public static Map<String, String> REQUEST_FLOW_MAP=new HashMap<String, String>();
	
	//流程流向关系配置
	public static Map<String, String> NEXT_FLOW_MAP=new HashMap<String, String>();
	
	public static TreeSet<String> WAIT_DEAL_TASK_TITLE_SET=new TreeSet<String>();
	
	
	public static final String SERVICE_TYPE="1031";//服务类型
	public static final String SERVICE_TYPE_CLEAN=SERVICE_TYPE+"001";//清洁
	public static final String SERVICE_TYPE_REPAIR=SERVICE_TYPE+"002";//维修
	public static final String SERVICE_TYPE_FOOD=SERVICE_TYPE+"003";//点餐
	public static final String SERVICE_TYPE_SHOPPING=SERVICE_TYPE+"004";//购物
	public static final String SERVICE_TYPE_REBUILD=SERVICE_TYPE+"005";//装修
	public static final String SERVICE_TYPE_METER_READ=SERVICE_TYPE+"006";//抄表
	public static final String SERVICE_TYPE_OTHER=SERVICE_TYPE+"999";//其他
	
	
	
	public static final String PRICE_TYPE="1032";//价格类型
	public static final String PRICE_TYPE_FIXED=PRICE_TYPE+"001";//价格类型--固定价格
	public static final String PRICE_TYPE_FLOAT=PRICE_TYPE+"002";//价格类型--浮动价格
	
	
	public static final String TICKET_ITEM_TYPE="1033";//服务项类型
	public static final String TICKET_ITEM_TYPE_SERVICE=TICKET_ITEM_TYPE+"001";//服务
	public static final String TICKET_ITEM_TYPE_FLOW_STEP=TICKET_ITEM_TYPE+"002";//流程步骤
	
	public static final String ORDER_TYPE="1034"; //订单类型
	public static final String ORDER_TYPE_CLEAN=ORDER_TYPE+"001";//清洁
	public static final String ORDER_TYPE_REPAIR=ORDER_TYPE+"002";//维修
	public static final String ORDER_TYPE_FOOD=ORDER_TYPE+"003";//点餐
	public static final String ORDER_TYPE_SHOPPING=ORDER_TYPE+"004";//购物
	public static final String ORDER_TYPE_REBUILD=ORDER_TYPE+"005";//装修
	public static final String ORDER_TYPE_PACKAGE=ORDER_TYPE+"006";//服务包
	public static final String ORDER_TYPE_OTHER=ORDER_TYPE+"999";//其他
	
	
	public static final String FLOW_STATUS="1035"; //流程处理状态
	public static final String FLOW_STATUS_PENDING=FLOW_STATUS+"001"; //待处理
	public static final String FLOW_STATUS_HANDLING=FLOW_STATUS+"002"; //处理中-已确认
	public static final String FLOW_STATUS_START=FLOW_STATUS+"003";//已开始
	public static final String FLOW_STATUS_FINISH=FLOW_STATUS+"004"; //已完成
	public static final String FLOW_STATUS_CANCEL=FLOW_STATUS+"005"; //已取消
	public static final String FLOW_STATUS_REDIRECT=FLOW_STATUS+"006"; //已转发-即重新分配
	public static final String FLOW_STATUS_RETURN=FLOW_STATUS+"007"; //已退回
	public static final String FLOW_STATUS_CLOSE=FLOW_STATUS+"008"; //已关闭
	
	public static final String FLOW_STATUS_INVALID=FLOW_STATUS+"099"; //无效
	
	
	public static final String ORDER_TICKET_TYPE="1036";//订单服务类型
	public static final String ORDER_TICKET_TYPE_TICKET=ORDER_TICKET_TYPE+"001";  //服务
	public static final String ORDER_TICKET_TYPE_TICKET_PACKAGE=ORDER_TICKET_TYPE+"002";//服务包
	
	public static final String OPERATE_TYPE="1038";
	public static final String OPERATE_TYPE_REQUEST=OPERATE_TYPE+"001";//请求
	public static final String OPERATE_TYPE_SURE=OPERATE_TYPE+"002";//认领
	public static final String OPERATE_TYPE_START=OPERATE_TYPE+"003";//开始
	public static final String OPERATE_TYPE_RETURN=OPERATE_TYPE+"004";//退回
	public static final String OPERATE_TYPE_CANCEL=OPERATE_TYPE+"005";//取消
	public static final String OPERATE_TYPE_FINISH=OPERATE_TYPE+"006";//完成
	public static final String OPERATE_TYPE_CLOSE=OPERATE_TYPE+"007";//关闭
	public static final String OPERATE_TYPE_REDIRECT=OPERATE_TYPE+"008";//转发-重新分配
	public static final String OPERATE_TYPE_PRESS=OPERATE_TYPE+"201";//催办
	public static final String OPERATE_TYPE_COMMENT=OPERATE_TYPE+"202";//评价
	
	
	public static final String REQUEST_TYPE="1040";//请求类型
	public static final String REQUEST_TYPE_CLEAN=REQUEST_TYPE+"001";//清洁
	public static final String REQUEST_TYPE_REPAIR=REQUEST_TYPE+"002";//维修
	public static final String REQUEST_TYPE_SEEROOM=REQUEST_TYPE+"003";//看房
	public static final String REQUEST_TYPE_BOOKING=REQUEST_TYPE+"012";//预订
	public static final String REQUEST_TYPE_EXTEND=REQUEST_TYPE+"013";//续租
	public static final String REQUEST_TYPE_CHECKOUT=REQUEST_TYPE+"014";//退房
	public static final String REQUEST_TYPE_CONTRACT=REQUEST_TYPE+"004";//签约
	public static final String REQUEST_TYPE_COMPLAIN=REQUEST_TYPE+"005";//投诉
	public static final String REQUEST_TYPE_ADVICE=REQUEST_TYPE+"006";//建议
	public static final String REQUEST_TYPE_FOOD=REQUEST_TYPE+"007";//点餐
	public static final String REQUEST_TYPE_SHOPPING=REQUEST_TYPE+"008";//购物
	public static final String REQUEST_TYPE_REBUILD=REQUEST_TYPE+"009";//装修
	public static final String REQUEST_TYPE_PACKAGE=REQUEST_TYPE+"010";//服务包
	public static final String REQUEST_TYPE_METER_READ=REQUEST_TYPE+"011";//抄表
	
	   public static final String REQUEST_TYPE_SUBLET=REQUEST_TYPE+"012";// 转让；
	
	
	public static final String REQUEST_TYPE_REFUND=REQUEST_TYPE+"015";//退款
	public static final String REQUEST_TYPE_REFUND_LOAN=REQUEST_TYPE+"016";//退款放款
	
	public static final String REQUEST_TYPE_ROOM_RUBLET=REQUEST_TYPE+"017";//转租
	public static final String REQUEST_TYPE_CHECKOUT_APPROVAL=REQUEST_TYPE+"018";//退房结算
	public static final String REQUEST_TYPE_CHECKOUT_APPROVAL_LOAN=REQUEST_TYPE+"019";//退房结算放款
	public static final String REQUEST_TYPE_EASTATE_APPLY=REQUEST_TYPE+"020";//租客申请资产

	public static final String REQUEST_TYPE_PROPERTY=REQUEST_TYPE+"030";   // 物业审核
	public static final String REQUEST_TYPE_BILL=REQUEST_TYPE+"031";       // 账单审核
	public static final String REQUEST_TYPE_PAYING=REQUEST_TYPE+"032";     // 付款审核
	
	public static final String REQUEST_TYPE_OTHER=REQUEST_TYPE+"999";//其他
	
	public static final String FLOW_TYPE="1041";//流程类型
	public static final String FLOW_TYPE_CLEAN=FLOW_TYPE+"001";//清洁
	public static final String FLOW_TYPE_REPAIR=FLOW_TYPE+"002";//维修
	public static final String FLOW_TYPE_SEEROOM=FLOW_TYPE+"003";//看房
	
	public static final String FLOW_TYPE_CONTRACT=FLOW_TYPE+"004";//签约
	public static final String FLOW_TYPE_COMPLAIN=FLOW_TYPE+"005";//投诉
	public static final String FLOW_TYPE_ADVICE=FLOW_TYPE+"006";//建议
	public static final String FLOW_TYPE_FOOD=FLOW_TYPE+"007";//点餐
	public static final String FLOW_TYPE_SHOPPING=FLOW_TYPE+"008";//购物
	public static final String FLOW_TYPE_REBUILD=FLOW_TYPE+"009";//装修
	public static final String FLOW_TYPE_PACKAGE=FLOW_TYPE+"010";//服务包
	public static final String FLOW_TYPE_METER_READ=FLOW_TYPE+"011";//抄表
	public static final String FLOW_TYPE_BOOKING=FLOW_TYPE+"012";//预订
	public static final String FLOW_TYPE_EXTEND=FLOW_TYPE+"013";//续租
    public static final String FLOW_TYPE_CHECKOUT=FLOW_TYPE+"014";//退房
	//只定义不走流程
	public static final String FLOW_TYPE_WAIT_CHECKIN=FLOW_TYPE+"015";//待入住
	public static final String FLOW_TYPE_EXTEND_NOTICE=FLOW_TYPE+"016";//续租通知
	public static final String FLOW_TYPE_CONTRACT_OUTDATE=FLOW_TYPE+"017";//合同到期
	public static final String FLOW_TYPE_FEE_REMIND=FLOW_TYPE+"018";//费用提醒
	public static final String FLOW_TYPE_FEE_DUE=FLOW_TYPE+"019";//欠费
	public static final String FLOW_TYPE_LOCK=FLOW_TYPE+"020";//锁定
	public static final String FLOW_TYPE_FREE_DAY=FLOW_TYPE+"021";//空置天数
	
	public static final String FLOW_TYPE_REFUND=FLOW_TYPE+"022";//退款
	public static final String FLOW_TYPE_REFUND_LOAN=FLOW_TYPE+"023";//退款放款
	
	public static final String FLOW_TYPE_ROOM_SUBLET=FLOW_TYPE+"024";//转租
	public static final String FLOW_TYPE_CHECKOUT_APPROVAL=FLOW_TYPE+"025";//退房结算
	public static final String FLOW_TYPE_CHECKOUT_APPROVAL_LOAN=FLOW_TYPE+"026";//退房结算放款
	public static final String FLOW_TYPE_EASTATE_APPLY=FLOW_TYPE+"027";//租客申请资产
	public static final String FLOW_TYPE_FEE_PEND=FLOW_TYPE+"028";//待付
	
	
	public static final String FLOW_TYPE_CLEAN_CHECK=FLOW_TYPE+"601";//清洁检查
	public static final String FLOW_TYPE_REPAIR_CHECK=FLOW_TYPE+"602";//维修检查
	
	public static final String FLOW_TYPE_OTHER=FLOW_TYPE+"999";//其他
	//服务类相关流程
	public static final String[] FLOW_SERVICE_TYPES={FLOW_TYPE_CLEAN,FLOW_TYPE_REPAIR};
	//服务类相关请求
	public static final String[] REQUEST_SERVICE_TYPES={REQUEST_TYPE_CLEAN,REQUEST_TYPE_REPAIR};
	//非流程类的 任务类型
	public static final String[] NOT_FLOW_TASK_TYPES={FLOW_TYPE_WAIT_CHECKIN,
		FLOW_TYPE_EXTEND_NOTICE,FLOW_TYPE_CONTRACT_OUTDATE,FLOW_TYPE_FEE_REMIND};
	
	// 出房相关请求
    public static final String[] RENT_REQUEST_TYPES = {REQUEST_TYPE_SEEROOM, REQUEST_TYPE_BOOKING, REQUEST_TYPE_CONTRACT, REQUEST_TYPE_CHECKOUT, REQUEST_TYPE_EXTEND};
    
 // 出房相关请求  20170719
    public static final String[] RENT_ROOM_REQUEST_TYPES = {WorkFlowConstant.ProcessKey.PROCESS_KEY_CHECK_ROOM, 
                                                            WorkFlowConstant.ProcessKey.PROCESS_KEY_BOOK_ROOM, 
                                                            WorkFlowConstant.ProcessKey.PROCESS_KEY_SIGN_ROOM, 
                                                            WorkFlowConstant.ProcessKey.PROCESS_KEY_CHECK_OUT_ROOM,
                                                            WorkFlowConstant.ProcessKey.PROCESS_KEY_RESIGN_ROOM
                                                            };
    // 正在进行的任务
    public static final String[] FLOW_STATS_UNFINISHED = {FLOW_STATUS_PENDING, FLOW_STATUS_HANDLING, FLOW_STATUS_START, FLOW_STATUS_RETURN};
    // 历史任务
    public static final String[] FLOW_STATS_HISTORY = {FLOW_STATUS_FINISH, FLOW_STATUS_CANCEL, FLOW_STATUS_CLOSE, FLOW_STATUS_INVALID};
        
    public static Map<String, String> OPERATE_TYPE_MAP=new HashMap<String, String>();
    
  //流程结束状态
  	public static final String[] FLOW_STATUS_OVER=new String[]{
  		FLOW_STATUS_FINISH,FLOW_STATUS_CANCEL,FLOW_STATUS_REDIRECT,
//  		FLOW_STATUS_RETURN,
  		FLOW_STATUS_CLOSE
  		
  	};
	
	//初始化 订单类型-流程类型 映射关系
	public static void initTypeMap(){
		ORDER_FLOW_MAP.clear();
		ORDER_FLOW_MAP.put(ORDER_TYPE, FLOW_TYPE);
		ORDER_FLOW_MAP.put(ORDER_TYPE_CLEAN, FLOW_TYPE_CLEAN);
		ORDER_FLOW_MAP.put(ORDER_TYPE_REPAIR, FLOW_TYPE_REPAIR);
		ORDER_FLOW_MAP.put(ORDER_TYPE_FOOD, FLOW_TYPE_FOOD);
		ORDER_FLOW_MAP.put(ORDER_TYPE_SHOPPING, FLOW_TYPE_SHOPPING);
		ORDER_FLOW_MAP.put(ORDER_TYPE_REBUILD, FLOW_TYPE_REBUILD);
		ORDER_FLOW_MAP.put(ORDER_TYPE_PACKAGE, FLOW_TYPE_PACKAGE);
		ORDER_FLOW_MAP.put(ORDER_TYPE_OTHER, FLOW_TYPE_OTHER);
		
		
		SERVICE_ORDER_MAP.clear();
		SERVICE_ORDER_MAP.put(SERVICE_TYPE, ORDER_TYPE);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_CLEAN, ORDER_TYPE_CLEAN);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_REPAIR, ORDER_TYPE_REPAIR);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_FOOD, ORDER_TYPE_FOOD);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_SHOPPING, ORDER_TYPE_SHOPPING);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_REBUILD, ORDER_TYPE_REBUILD);
//		SERVICE_ORDER_MAP.put(ORDER_SERVICE_TYPE_TICKET_PACKAGE, ORDER_TYPE_PACKAGE);
		SERVICE_ORDER_MAP.put(SERVICE_TYPE_OTHER, ORDER_TYPE_OTHER);
		
		REQUEST_FLOW_MAP.clear();
		REQUEST_FLOW_MAP.put(REQUEST_TYPE, FLOW_TYPE);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_CLEAN, FLOW_TYPE_CLEAN);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_REPAIR, FLOW_TYPE_REPAIR);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_SEEROOM, FLOW_TYPE_SEEROOM);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_BOOKING, FLOW_TYPE_BOOKING);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_CONTRACT, FLOW_TYPE_CONTRACT);
        REQUEST_FLOW_MAP.put(REQUEST_TYPE_EXTEND, FLOW_TYPE_EXTEND);
        REQUEST_FLOW_MAP.put(REQUEST_TYPE_CHECKOUT, FLOW_TYPE_CHECKOUT);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_COMPLAIN, FLOW_TYPE_COMPLAIN);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_ADVICE, FLOW_TYPE_ADVICE);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_FOOD, FLOW_TYPE_FOOD);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_SHOPPING, FLOW_TYPE_SHOPPING);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_REBUILD, FLOW_TYPE_REBUILD);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_METER_READ, FLOW_TYPE_METER_READ);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_REFUND, FLOW_TYPE_REFUND);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_REFUND_LOAN, FLOW_TYPE_REFUND_LOAN);
		
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_OTHER, FLOW_TYPE_OTHER);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_ROOM_RUBLET, FLOW_TYPE_ROOM_SUBLET);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_CHECKOUT_APPROVAL, FLOW_TYPE_CHECKOUT_APPROVAL);
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_CHECKOUT_APPROVAL_LOAN, FLOW_TYPE_CHECKOUT_APPROVAL_LOAN);
		
		REQUEST_FLOW_MAP.put(REQUEST_TYPE_EASTATE_APPLY, FLOW_TYPE_EASTATE_APPLY);
		//设置流程的下步的流程
//		NEXT_FLOW_MAP.put(FLOW_TYPE_CLEAN, FLOW_TYPE_CLEAN_CHECK);
//		NEXT_FLOW_MAP.put(FLOW_TYPE_REPAIR, FLOW_TYPE_REPAIR_CHECK);
		
		//放款审核完成以后直接放款不在进行下一步放款审核 20160507
//		NEXT_FLOW_MAP.put(FLOW_TYPE_REFUND, FLOW_TYPE_REFUND_LOAN);
		
		//设置服务-请求映射关系
		SERVICE_REQUEST_MAP.clear();
		SERVICE_REQUEST_MAP.put(SERVICE_TYPE_CLEAN, REQUEST_TYPE_CLEAN);
		SERVICE_REQUEST_MAP.put(SERVICE_TYPE_REPAIR, REQUEST_TYPE_REPAIR);
//		SERVICE_REQUEST_MAP.put(SERVICE_TYPE_CLEAN, REQUEST_TYPE_CLEAN);
		
		OPERATE_TYPE_MAP.clear();
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_REQUEST, "request");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_SURE, "sure");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_START, "start");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_FINISH, "finish");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_CANCEL, "cancel");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_CLOSE, "close");
		OPERATE_TYPE_MAP.put(OPERATE_TYPE_RETURN, "return");
		
		
		
		
		
		
	}
	
	
	public static String getOperateAction(String operateType){
		if(OPERATE_TYPE_MAP==null || OPERATE_TYPE_MAP.isEmpty()){
			initTypeMap();
		}
		return OPERATE_TYPE_MAP.get(operateType);
	}
	
	/**
	 * 根据订单类型获取流程类型
	 * @param orderType
	 * @return
	 */
	public static  String getFlowType(String orderType){
		if(ORDER_FLOW_MAP==null || ORDER_FLOW_MAP.isEmpty()){
			initTypeMap();
		}
		return ORDER_FLOW_MAP.get(orderType);
	}
	
	/**
	 * 根据服务类型获取订单类型
	 * @param serviceType
	 * @return
	 */
	public static  String getOrderTypeFromService(String serviceType){
		if(SERVICE_ORDER_MAP==null || SERVICE_ORDER_MAP.isEmpty()){
			initTypeMap();
		}
		return SERVICE_ORDER_MAP.get(serviceType);
	}
	
	/**
	 * 根据请求类型获取流程类型
	 * @param requestType
	 * @return
	 */
	public static String getFlowTypeFromRequestType(String requestType){
		if(REQUEST_FLOW_MAP==null || REQUEST_FLOW_MAP.isEmpty()){
			initTypeMap();
		}
		return REQUEST_FLOW_MAP.get(requestType);
	}
	
	/**
	 * 获取请求类型
	 * @param flowType
	 * @return
	 */
	public static String getRequestType(String serviceType){
		if(SERVICE_REQUEST_MAP.isEmpty()){
			initTypeMap();
		}
		return SERVICE_REQUEST_MAP.get(serviceType);
	}
	
	/**
	 * 获取流程的下一步流程
	 * @param flowType
	 * @return
	 */
	public static String getNextFlowType(String flowType){
		if(NEXT_FLOW_MAP.isEmpty()){
			initTypeMap();
		}
		return NEXT_FLOW_MAP.get(flowType);
	}
	
	/**
	 * XX请求类型是否为租房类的
	 * @param type
	 * @return
	 */
	public static boolean isRentReqType(String type){
	    for(String t : RENT_REQUEST_TYPES){
	        if(t.equals(type)){
	            return true;
	        }
	    }
	    return false;
	}
	
	   /**
	    * 请求是否是租房类的，根据flowKey 验证；
	 * @param type
	 * @return
	 */
	public static boolean isRentRoomReqType(String type){
	        for(String t : RENT_ROOM_REQUEST_TYPES){
	            if(t.equals(type)){
	                return true;
	            }
	        }
	        return false;
	    }
	
	/**
	 * 是否为服务的流程
	 * @param type
	 * @return
	 */
	public static boolean isServiceFlowType(String type){
		if(type==null || "".equals(type))return false;
		for(String t : FLOW_SERVICE_TYPES){
	        if(t.equals(type)){
	            return true;
	        }
	    }
	    return false;
	}
	
	/**
	 * 是否为非流程类任务
	 * @param type
	 * @return
	 */
	public static boolean isNotFlowTask(String type){
		for(String t : NOT_FLOW_TASK_TYPES){
	        if(t.equals(type)){
	            return true;
	        }
	    }
	    return false;
	}
	
	/**
	 * 是否为服务的请求
	 * @param type
	 * @return
	 */
	public static boolean isServiceRequestType(String type){
		for(String t : REQUEST_SERVICE_TYPES){
	        if(t.equals(type)){
	            return true;
	        }
	    }
	    return false;
	}
	
	/**
	 * 流程是否结束
	 * @param type
	 * @return
	 */
	public static boolean flowIsOver(String status){
		if(status==null || "".equals(status))return false;
		for(String t : FLOW_STATS_UNFINISHED){
	        if(t.equals(status)){
	            return false;
	        }
	    }
	    return true;
	}
	
	/**
	 * 是否显示查询任务
	 * @param flowType
	 * @return
	 */
	public static boolean isShowTask(String flowType){
		List<String> titles= getWaitDealTaskTitle();
		boolean isShow=false;
		for(String t:titles){
			if(t.equals(flowType)){
				isShow=true;break;
			}
		}
		return isShow;
		/*if(FLOW_TYPE_REFUND.equals(flowType)
				|| FLOW_TYPE_REFUND_LOAN.equals(flowType)
				|| FLOW_TYPE_CHECKOUT_APPROVAL.equals(flowType)){
			return true;
		}return false;*/
	}
	
	public static List<String> getWaitDealTaskTitle(){
		
		if(WAIT_DEAL_TASK_TITLE_SET.isEmpty()){
//			initTypeMap();
			WAIT_DEAL_TASK_TITLE_SET.clear();
			
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_SEEROOM);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_BOOKING);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_CONTRACT);
//			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_WAIT_CHECKIN);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_EXTEND_NOTICE);
//			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_FEE_REMIND);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_CONTRACT_OUTDATE);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_CLEAN);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_REPAIR);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_METER_READ);
//			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_EXTEND);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_CHECKOUT);
//			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_ROOM_SUBLET);
			WAIT_DEAL_TASK_TITLE_SET.add(FLOW_TYPE_EASTATE_APPLY);
		}
		return new ArrayList<String>(WAIT_DEAL_TASK_TITLE_SET);
	}
	
	private static List<String> list=new ArrayList<String>();
	public static List<String> getMeterTypes(){
		if(list.isEmpty()){
			list.add(METER_READ_DATA_TYPE_ELECTRIC);
			list.add(METER_READ_DATA_TYPE_WATER);
			list.add(METER_READ_DATA_TYPE_WAS);
			list.add(METER_READ_DATA_TYPE_HOTWATER);
		}
		return list;
	}
	
	//抄表数据类型
	public static String METER_READ_DATA_TYPE="1064";
	public static final String METER_READ_DATA_TYPE_ELECTRIC=METER_READ_DATA_TYPE+"001";//电费
	public static String METER_READ_DATA_TYPE_WATER=METER_READ_DATA_TYPE+"002";//水费
	public static String METER_READ_DATA_TYPE_WAS=METER_READ_DATA_TYPE+"003";//煤气
	public static String METER_READ_DATA_TYPE_HOTWATER=METER_READ_DATA_TYPE+"004";//热水
	
	/**
	 * 根据抄表类型转换成科目
	 * @param meterType
	 * @return
	 */
	public static String getSubjectFromMeterType(String meterType){
		if (TicketConstants.METER_READ_DATA_TYPE_ELECTRIC.equals(meterType)) {// 电费
        	return BillSubSubjectEnum.RESOURCE_POWER_RATE.getCode();
        } else if (TicketConstants.METER_READ_DATA_TYPE_WATER.equals(meterType)) { // 水费
            return  BillSubSubjectEnum.RESOURCE_WATER_RATE.getCode();
        } else if (TicketConstants.METER_READ_DATA_TYPE_WAS.equals(meterType)) { // 燃气费
            return BillSubSubjectEnum.RESOURCE_GAS_BILL.getCode();
        } else if(TicketConstants.METER_READ_DATA_TYPE_HOTWATER.equals(meterType)){//热水
        	return BillSubSubjectEnum.RESOURCE_HOT_WATER_RATE.getCode();
        }
		return null;
	}
	public static Integer getUnitFromMeterType(String meterType){
		if (TicketConstants.METER_READ_DATA_TYPE_ELECTRIC.equals(meterType)) {// 电费
        	return MeasurementUnitEnum.MILLI_KWH.getCode();
        } else if (TicketConstants.METER_READ_DATA_TYPE_WATER.equals(meterType)) { // 水费
            return  MeasurementUnitEnum.MILLI_T.getCode();
        } else if (TicketConstants.METER_READ_DATA_TYPE_WAS.equals(meterType)) { // 燃气
            return MeasurementUnitEnum.MILLI_CM.getCode();
        } else if(TicketConstants.METER_READ_DATA_TYPE_HOTWATER.equals(meterType)){//热水
        	return MeasurementUnitEnum.MILLI_T.getCode();
        }
		return null;
	}
	
	
	
	public static String getQueryTypeFromRequestType(String requestType){
		if(TicketConstants.REQUEST_TYPE_CHECKOUT_APPROVAL.equals(requestType)
				|| TicketConstants.REQUEST_TYPE_CHECKOUT_APPROVAL_LOAN.equals(requestType)){
			return "checkout";
		}
		return null;
	}

	
	//待办事项统计
	public static String WAIT_TASK_TOTAL_TODAY="today";
	public static String WAIT_TASK_TOTAL_WEEK="week";
	public static String WAIT_TASK_TOTAL_MONTH="month";
	
	//管家提醒租客
	public static String REMIND_CUSTOMER="1057";
	public static String REMIND_CUSTOMER_PREPAID=REMIND_CUSTOMER+"001";//提醒预定交定金
	public static String REMIND_CUSTOMER_OUTDATENOTICE=REMIND_CUSTOMER+"002";//房间即将到期续租提醒
	public static String REMIND_CUSTOMER_PAYRENT=REMIND_CUSTOMER+"003";//签约后补交房租
	public static String REMIND_CUSTOMER_CONTRACT=REMIND_CUSTOMER+"004";//提醒租客过来签约
	public static String REMIND_CUSTOMER_PRESS_STAFF=REMIND_CUSTOMER+"005"; //租客提醒催办责任人
	public static String REMIND_MANAGER_STAFF=REMIND_CUSTOMER+"006"; //管家提醒责任人
	
	public static String CHECK_STATUS="1063";
	public static String CHECK_STATUS_FORDEAL=CHECK_STATUS+"001";//待审批
	public static String CHECK_STATUS_YES=CHECK_STATUS+"002";//同意/通过
	public static String CHECK_STATUS_NO=CHECK_STATUS+"003";//拒绝/不通过
	public static String CHECK_STATUS_LOAN=CHECK_STATUS+"004";//已放款
	public static String CHECK_STATUS_LOAN_REFUSE=CHECK_STATUS+"005";//拒绝放款
	public static String CHECK_STATUS_LOAN_FORDEAL=CHECK_STATUS+"006";//待放款
	public static String CHECK_STATUS_CANCEL=CHECK_STATUS+"009";//取消/关闭
	public static String CHECK_STATUS_APPROVALING=CHECK_STATUS+"010";//审批中
	
	//－1:结算单生成；0：结算单已放款 1-结算单拒绝 2-已关闭 3-审批通过 4-待放款
	/*public static Integer BUSSINESS_FLOW_STATUS_CREATE=-1;
	public static Integer BUSSINESS_FLOW_STATUS_LOANED=0;
	public static Integer BUSSINESS_FLOW_STATUS_CHECK_REFUSED=1;
	public static Integer BUSSINESS_FLOW_STATUS_CLOSED=2;
	public static Integer BUSSINESS_FLOW_STATUS_CHECK_PASS=3;
	public static Integer BUSSINESS_FLOW_STATUS_LOAN_WAIT=4;*/

	
	
	
	//投诉建议处理状态
	public static String ADVICE_HANDLE_STATUS="1081";
	public static String ADVICE_HANDLE_STATUS_WAITDEAL=ADVICE_HANDLE_STATUS+"001";//待处理
	public static String ADVICE_HANDLE_STATUS_HANDLED=ADVICE_HANDLE_STATUS+"002";//已处理
	public static String ADVICE_HANDLE_STATUS_CLOSED=ADVICE_HANDLE_STATUS+"003";//关闭
	
	
	public static String FLOW_APPROVAL_ONLINE="ONLINE"; //线上
	public static String FLOW_APPROVAL_OFFLINE="OFFLINE";//线下

			
	
	//服务员APP 任务模块标题
	public static String APP_MODEL_TITLE_TASK_OVER="over";//已结束
	public static String APP_MODEL_TITLE_TASK_TODAY="today";//今日任务
	public static String APP_MODEL_TITLE_TASK_FORSURE="forsure";//待确认
	public static String APP_MODEL_TITLE_TASK_7DAYS="7days";//7日内
	public static String APP_MODEL_TITLE_TASK_HISTORY="history";//历史任务
	
	//催办间隔数据  默认10分钟
	public static Integer TICKET_FLOW_PRESS_TIME_INTERVAL=10;
	public static String TICKET_REQUEST_PARAM_PRE="_";//参数前缀
	
	public static final Integer FLOW_HANDLE_PROCESS_HANDLESS=0;//未处理
	public static final Integer FLOW_HANDLE_PROCESS_HANDLING=1;//处理中
	public static final Integer FLOW_HANDLE_PROCESS_OVER=2;//已结束
	
	
	//服务类相关流程
	public static final String[] FLOW_SERVICE_FLOW_NODE_KEY={WorkFlowConstant.ProcessNodeKey.PROCESS_NODE_KEY_CLEAN,WorkFlowConstant.ProcessNodeKey.PROCESS_NODE_KEY_REPAIR};

	public static boolean isServiceFlowKey(String flowKey) {
		if(flowKey==null || "".equals(flowKey))return false;
		for(String t : FLOW_SERVICE_FLOW_NODE_KEY){
	        if(t.equals(flowKey)){
	            return true;
	        }
	    }
	    return false;
	}

	
	
	
}
