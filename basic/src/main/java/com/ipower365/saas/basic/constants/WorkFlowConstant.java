package com.ipower365.saas.basic.constants;

public class WorkFlowConstant {
    
    //审批分类
    public static String FLOW_CLASS="1124";
    public static String FLOW_CLASS_ESTATE=FLOW_CLASS+"001";//物业类审批
    public static String FLOW_CLASS_PAYMENT_PLATFORM=FLOW_CLASS+"002";//平台代付类账单审批-通用
    public static String FLOW_CLASS_LOAN=FLOW_CLASS+"003";//放款类审批
    public static String FLOW_CLASS_REFUND=FLOW_CLASS+"004";//退款类审批
    public static String FLOW_CLASS_PAYMENT_ORGANIZATION=FLOW_CLASS+"005";//运营商非代付类审批--通用
    public static String FLOW_CLASS_ELECTRIC_BILL_ADJUST=FLOW_CLASS+"006";//电费核算审批
    public static String FLOW_CLASS_ELECTRIC_SHARE_BENEFIT=FLOW_CLASS+"007";//电费分利审批
    
    public static String FLOW_CLASS_PROPERTY_CONTRACT=FLOW_CLASS+"008";//物业合同审批
//  public static String FLOW_CLASS_ROOM_REFUND=FLOW_CLASS+"009";//客房退款审批
//  public static String FLOW_CLASS_ROOM_OUTRENT=FLOW_CLASS+"010";//客房退租审批
//  public static String FLOW_CLASS_PROPERTY_RENTAL_BILL=FLOW_CLASS+"011";//物业租金账单审批
//  public static String FLOW_CLASS_PROPERTY_RESOURCE_BILL=FLOW_CLASS+"012";//物业资源账单审批
    
    
    
 
    public static String FLOW_CLASS_CLEAN=FLOW_CLASS+"013";     //保洁；
    public static String FLOW_CLASS_REPAIR=FLOW_CLASS+"014";    //维修；
    public static String FLOW_CLASS_CHECK_ROOM=FLOW_CLASS+"015";    //看房；
    public static String FLOW_CLASS_BOOK_ROOM=FLOW_CLASS+"016";    //订房；
    public static String FLOW_CLASS_SIGN_ROOM=FLOW_CLASS+"017";    //签约；
    public static String FLOW_CLASS_RESIGN_ROOM=FLOW_CLASS+"018";    //续租；
    public static String FLOW_CLASS_CHECK_OUT_ROOM=FLOW_CLASS+"019";    //退房；
    public static String FLOW_CLASS_SUGESSION=FLOW_CLASS+"020";    //投诉建议；
    
    
    /**
     * 业务数据字段
     */
    public static String FIELD_BUSSINESS_DATA_ID="businessId";//业务ID
    public static String FIELD_BUSSINESS_DATA_TITLE="businessTitle";//业务数据展示标题
    public static String FIELD_BUSSINESS_DATA_OBJECT="businessData";//业务数据
    public static String FIELD_BUSSINESS_TYPE="businessType";//业务类型
    
    
    //审批记录
    public static String FIELD_APPROVAL_DATA_OBJECT="approvalData"; //审批结果对象
    //处理记录ID
    public static String FIELD_TASK_HANDLE_ID="curHandleId";
    /**
     * 任务状态字段
     */
    public static String FIELD_TASK_STATUS="taskStatus";
    /**
     * 任务审批状态
     */
    public static String FIELD_TASK_CHECKRESULT="checkResult";
    /**
     * 任务拒绝原因
     */
    public static String FIELD_TASK_REASON="reason";
    
    
    //操作类型-第一个节点的操作类型
    public static String FIELD_TASK_OPTYPE="optype";
    //是否开通代付 yes / no
    public static String FIELD_TASK_OPEN_OTHER_PAY="open_other_pay";  

    //任务参数前缀
    public static String FIELD_PARAM_LOCAL_PRE="local_";
    public static String FIELD_PARAM_NEXT_TASK_PRE="nexttask_";
    
    
    
    
    
    //数据类型
    public static String DATA_TYPE_INTEGER="integer";
    public static String DATA_TYPE_LONG="long";
    public static String DATA_TYPE_DOUBLE="double";
    public static String DATA_TYPE_STRING="string";
    public static String DATA_TYPE_SERIALIZABLE="serializable";
    
    
    
    //根据审批结果获取回调分类
    public static String getCallBackClassByCheckResult(String checkResult){
        if(TicketConstants.CHECK_STATUS_YES.equals(checkResult)){
            return TaskCallBackClass.Pass.getCode();
        }
        if(TicketConstants.CHECK_STATUS_NO.equals(checkResult)){
            return TaskCallBackClass.Refuse.getCode();
        }
        return null;
        
    }
    
    
    //流程类型
    public static enum FlowType{
        Flow,Approval
    }
    
    //任务回调分类
    public static enum TaskCallBackClass{
        Detail("detail","查询详情"),Pass("pass","审批通过"),Refuse("refuse","审批拒绝")
        ,Flow("flow","流程处理");
        
        private String code;
        private String name;
        private TaskCallBackClass(String code,String name){
            this.code=code;
            this.name=name;
        }
        public String getCode() {
            return code;
        }
        public String getName() {
            return name;
        }
        public static TaskCallBackClass get(String code) {
            for (TaskCallBackClass type : TaskCallBackClass.values()) {
                if (type.code.equals(code)) {
                    return type;
                }
            }
            return null;
        }
        
    }
    
    //任务回调类型
    public static enum TaskCallBackType{
            SpringId("springid","SpringId"),ClassName("classname","类"),Http("http","Http")
            ,WebService("webservice","WebService");
            
            private String code;
            private String name;
            private TaskCallBackType(String code,String name){
                this.code=code;
                this.name=name;
            }
            public String getCode() {
                return code;
            }
            public String getName() {
                return name;
            }
            public static TaskCallBackType get(String code) {
                for (TaskCallBackType type : TaskCallBackType.values()) {
                    if (type.code.equals(code)) {
                        return type;
                    }
                }
                return null;
            }
            
        }
    
    
    /**
     * 流程编号定义
     * @author Administrator
     *
     */
public static class ProcessKey{
        
        public static String PROCESS_KEY_ESTATE="estate_approval_process";//物业审批流程--默认
        public static String PROCESS_KEY_PAY_PLATFORM="payment_platform_approval_process";//平台代付审批流程--默认
        public static String PROCESS_KEY_PAY_ORGANIZATION="payment_org_approval_process";//运营商非代付审批流程--默认
        
        
        public static String PROCESS_KEY_ELECTRIC_BILL_APPROVAL_UPORTAL="electric_bill_approval_process_uportal";//电费账单核算审批流程UPORTAL--默认
        public static String PROCESS_KEY_ELECTRIC_SHARE_BENEFIT_APPROVAL_UPORTAL="electric_share_benefit_approval_process_uportal";//电费分利审批流程UPORTAL--默认
        
        public static String PROCESS_KEY_ESTATE_CONTRACT="property_contract_approval_process";//物业合同审批流程--默认
//      public static String PROCESS_KEY_PROPERTY_RENTAL_BILL="property_rental_bill_approval_process";//物业租金账单审批流程--默认
//      public static String PROCESS_KEY_PROPERTY_RESOURCE_BILL="property_resource_bill_approval_process";//物业资源账单审批流程--默认
        public static String PROCESS_KEY_ROOM_REFUND="room_refund_approval_process";//客房退款审批流程--默认
        public static String PROCESS_KEY_ROOM_OUTRENT="room_outrent_approval_process";//客房退租审批流程--默认
        
        
        
        
        /*  
        17     保洁服务流程  1124013 保洁服务流程  1   1           1
        18    维修服务流程  1124014 维修服务流程  1   1           1
        19    看房服务流程  1124015 看房服务流程  1   1           1
        20     预定客房服务流程    1124016 预定客房服务流程    1   1           1
        21     签约客房服务流程    1124017 签约客房服务流程    1   1           1
        22   续签服务流程  1124018 续签服务流程  1   1           1
        23    退房服务流程  1124019 退房服务流程  1   1           1
        24         建议服务流程  1124020 建议服务流程  1   1           1

        */
        
        
        public static String PROCESS_KEY_CLEAN="service_clean_process";                //保洁；
        public static String PROCESS_KEY_REPAIR="service_repair_process";              //维修；
        public static String PROCESS_KEY_CHECK_ROOM="service_check_room_process";      //看房；
        public static String PROCESS_KEY_BOOK_ROOM="service_book_room_process";        //订房；
        public static String PROCESS_KEY_SIGN_ROOM="service_sign_room_process";        //签约；
        public static String PROCESS_KEY_RESIGN_ROOM="service_resign_room_process";    //续租；
        public static String PROCESS_KEY_CHECK_OUT_ROOM="service_check_out_room_process"; //退房；
        public static String PROCESS_KEY_SUGESSION="service_sugession_process";        //投诉建议；
        
        
        public static String PROCESS_KEY_SUB_LET="service_sublet_process";              //转租；
        public static String PROCESS_KEY_REFUND="service_refund_process";               //退款；
        public static String PROCESS_KEY_METER_READ="service_meter_read_process";       //抄表；
        public static String PROCESS_KEY_ESTATE_APPLY="service_estate_apply_process";   //租户资产申请；
        public static String PROCESS_KEY_CHECK_IN_ROOM="service_check_in_room_process";   //入住；
        public static String PROCESS_KEY_CHECKOUT_APPROVAL="service_check_out_approval_process";   //退房结算；
        public static String PROCESS_KEY_CHECKOUT_APPROVAL_LOAN="service_check_out_approval_loan_process";   //退房结算放款；
        
       
      /*  
        25      //    租转；                   service_sublet_process    1124021
        26      //     退款；                  service_refund_process 1124022   
        27         //      抄表                    service_meter_read_process   1124023
        28            //      资产申请                  service_estate_apply_process        1124024
*/
    }
    
    
    /**
     * 流程任务节点编号定义
     */
    public static class ProcessNodeKey{
        
        
        public static final String PROCESS_NODE_KEY_BILL_APPROVAL_UPMS="bill_approval_upms";//upms账单审批
        public static final String PROCESS_NODE_KEY_BILL_MODIFY_UPMS="bill_modify_upms";//修改账单-upms
        public static final String PROCESS_NODE_KEY_PAY_SURE_UPMS="pay_sure_upms";//付款确认-upms
        public static final String PROCESS_NODE_KEY_BILL_APPROVAL_UPORTAL="bill_approval_uportal";//账单审批-UPORTAL
        public static final String PROCESS_NODE_KEY_PAY_SUREL_UPORTAL="pay_sure_uportal";//付款确认-uportal
        
        public static final String PROCESS_NODE_KEY_ELECTRIC_BILL_APPROVAL_UPORTAL="electric_bill_approval_uportal";//电费核算审批-uportal
        public static final String PROCESS_NODE_KEY_ELECTRIC_BILL_MODIFY_UPORTAL="electric_bill_modify_uportal";//电费核算账单修改-uportal
        
        public static final String PROCESS_NODE_KEY_ELECTRIC_SHARE_BENEFIT_APPROVAL_UPORTAL="electric_share_benefit_approval_uportal"; //电费分利审批-uportal
        
        public static final String PROCESS_NODE_KEY_PROPERTY_APPROVAL="estate_approval";
        public static final String PROCESS_NODE_KEY_PROPERTY_APPROVAL_MODIFY="estate_modify";
        public static final String PROCESS_NODE_KEY_PROPERTY_CONTRACT_APPROVAL="property_contract_approval";//物业合同审批
        public static final String PROCESS_NODE_KEY_PROPERTY_CONTRACT_MODIFY="property_contract_modify";//物业合同修改
        
//      public static final String PROCESS_NODE_KEY_PROPERTY_RENTAL_BILL_APPROVAL="property_rental_bill_approval";//物业租金账单审批
//      public static final String PROCESS_NODE_KEY_PROPERTY_RENTAL_BILL_MODIFY="property_rental_bill_modify";//物业租金账单修改
//      
//      public static final String PROCESS_NODE_KEY_PROPERTY_RESOURCE_BILL_APPROVAL="property_resource_bill_approval";//物业资源账单审批
//      public static final String PROCESS_NODE_KEY_PROPERTY_RESOURCE_BILL_MODIFY="property_resource_bill_modify";//物业资源账单修改
        
        
        
        
        
     /*   13  clean_task  保洁      1124013 1   1   1           Flow
        14  repair_task 维修      1124014 1   1   1           Flow
        15  check_room_task 看房      1124015 1   1   1           Flow
        16  book_room_task  预定客房        1124016 1   1   1           Flow
        17  sign_room_task  签约客房        1124017 1   1   1           Flow
        18  resign_room_task    续租      1124018 1   1   1           Approval
        19  resign_room_modify  续租修改        1124019 1   1   1           Approval
        20  check_out_room_task 退房      1124019 1   1   1           Flow
        21  sugession_task  建议      1124020 1   1   1           Flow*/

        
        
        
        public static String PROCESS_NODE_KEY_CLEAN="clean_task";                  //保洁；
        public static String PROCESS_NODE_KEY_REPAIR="repair_task";                //维修；
        public static String PROCESS_NODE_KEY_CHECK_ROOM="check_room_task";        //看房；
        public static String PROCESS_NODE_KEY_BOOK_ROOM="book_room_task";          //订房；
        public static String PROCESS_NODE_KEY_SIGN_ROOM="sign_room_task";          //签约；
        public static String PROCESS_NODE_KEY_RESIGN_ROOM="resign_room_task";       //续租；
        public static String PROCESS_NODE_KEY_RESIGN_ROOM_MODIFY="resign_room_task_modify";//续租审批
        public static String PROCESS_NODE_KEY_CHECK_OUT_ROOM="check_out_room_task";  //退房；
        public static String PROCESS_NODE_KEY_SUGESSION="sugession_task";            //投诉建议；
        
        /*
        1       //    转租；                   sublet_task     1124021
        22      //     退款；                  refund_task       1124022   
                 refund_task_modify
        23            //      抄表                    meter_read_task     1124023
        24            //      资产申请                  estate_apply_task    1124024
*/        
        public static String PROCESS_NODE_KEY_SUBLET="sublet_task";                 //转租；
        public static String PROCESS_NODE_KEY_REFUND="refund_task";                 //退款；
        public static String PROCESS_NODE_KEY_REFUND_MODIFY="refund_task_modify";   //退款；
        public static String PROCESS_NODE_KEY_METER_READ="meter_read_task";         //抄表；
        public static String PROCESS_NODE_KEY_ESTATE_APPLY="estate_apply_task";            //资产申请审批  ；
        public static String PROCESS_NODE_KEY_ESTATE_APPLY_MODIFY="estate_apply_task_modify";            //资产申请 修改 ；
        
        
        public static String PROCESS_NODE_KEY_CHECK_IN_ROOM="check_in_room_task";               //入住审批审批  ；
        public static String PROCESS_NODE_KEY_CHECK_IN_ROOM_MODIFY="check_in_room_task_modify"; //入住审批修改；
        
        public static String PROCESS_NODE_KEY_CHECKOUT_APPROVAL="check_out_room_approval_task"; //退房结算；
        public static String PROCESS_NODE_KEY_CHECKOUT_APPROVAL_MODIFY="check_out_room_approval_task_modify"; //退房结算修改；
        public static String PROCESS_NODE_KEY_CHECKOUT_APPROVAL_LOAN="check_out_room_loan_task"; //退房结算放款；
        public static String PROCESS_NODE_KEY_CHECKOUT_APPROVAL_LOAN_MODIFY="check_out_room_loan_task_modify"; //退房结算放款修改；
        
    }

 
}
