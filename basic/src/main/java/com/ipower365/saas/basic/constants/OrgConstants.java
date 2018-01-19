package com.ipower365.saas.basic.constants;

public class OrgConstants {

    public static final String WORKSCHEDULE_TEMP_XLS = "/template/biz/workschedule";
    public static final String EXTENS_XML = ".xml";
    public static final String EXTENS_EXCEL = ".xls";

    // 企业类型
    public static String ORG_TYPE = "1126";
    public static String ORG_TYPE_APARTMENT_OPERATE = ORG_TYPE + "001";// 公寓运营商
    public static String ORG_TYPE_SERVICE = ORG_TYPE + "002";// 服务商
    public static String ORG_TYPE_PRODUCT = ORG_TYPE + "003";// 产品商
    public static String ORG_TYPE_PLATFORM = ORG_TYPE + "004";// 平台系统---待定
    public static String ORG_TYPE_ELECTRICITY_OPERATE=ORG_TYPE+"005";//电费运营商
    public static String ORG_TYPE_ESTATE_OPERATE=ORG_TYPE+"006";//资产运营商

    // 员工上下班状态
    public static String STAFF_ATTEND_WORK = "1055";
    public static String STAFF_ATTEND_WORK_ON = STAFF_ATTEND_WORK + "001";// 上班
    public static String STAFF_ATTEND_WORK_OFF = STAFF_ATTEND_WORK + "002";// 下班

    // 职责范围类型
    public static String DUTY_RANGE_TYPE_ROOM = "1028001";// 房间
    public static String DUTY_RANGE_TYPE_MANAGECENTER = "1028002";// 管理中心
    public static String DUTY_RANGE_TYPE_BUILDING = "1028003";// 楼栋
    public static String DUTY_RANGE_TYPE_FLOOR = "1028004";// 楼层
    public static String DUTY_RANGE_TYPE_CITY = "1028005";// 城市

    public static String INSTIT_ORGTYPE_ORG="ORG";//公司
    public static String INSTIT_ORGTYPE_DEPT="DEPT";//部门


    /**
     * 投诉建议处理需要的角色
     */
    public static Integer DUTY_ID_ADVICE_HANDLE = 40; // 投诉建议处理职责

    public static Integer DUTY_ID_CLEANER = 31;// 保洁员
    public static Integer DUTY_ID_REPAIRER = 32;// 维修员
    public static Integer DUTY_ID_METERREADER = 34;// 抄表员
    public static Integer DUTY_ID_DELIVER = 53;// 实施人员，[硬件安装]职责

    public static Integer DUTY_ID_HOUSE_MANAGER = 3;// 客房管家ID
    public static Integer DUTY_ID_LINK_PHONE = 58;// 客服电话（职责ID）

//    public static Integer ROLE_ID_FINACE = 22;//
//    public static String ROLE_CODE_FINANCE = "0022";// 出纳

    public static Integer DUTY_ID_FINANCIAL_MANAGER_PLATFORM = 54;// 平台财务经理，[系统管理]职责

    public static Integer DUTY_ID_FINANCIAL_MANAGER = 49;// 运营商财务经理,[审批]职责

    public static Integer FUNCTION_ID_HOME_LOCK = 201001010;// 房态门锁按钮功能
    
    public static Integer FUNCTION_ID_PUBLIC_LOCK = 201008001; // 公共钥匙按钮
    
//    public static String ROLE_NAME_HOUSE_MANAGER = "客房管家";
//    public static String ROLE_NAME_RENTER = "租客";
//    public static String ROLE_NAME_CLEANER = "保洁员";
//    public static String ROLE_NAME_REPAIRER = "维修工程师";
//    public static String ROLE_NAME_METERREAD = "抄表员";

    
//    /**
//     * 获取任务处理人角色
//     * @param flowType
//     * @return
//     */
//    public static String getHandlerRole(String flowType) {
//        if (TicketConstants.FLOW_TYPE_CLEAN.equals(flowType)) {
//            return ROLE_NAME_CLEANER;
//        }
//        if (TicketConstants.FLOW_TYPE_REPAIR.equals(flowType)) {
//            return ROLE_NAME_REPAIRER;
//        }
//        if (TicketConstants.FLOW_TYPE_METER_READ.equals(flowType)) {
//            return ROLE_NAME_METERREAD;
//        }
//        return ROLE_NAME_HOUSE_MANAGER;
//    }

    /**
     * 可访问公共区域的职责
     */
    public static Integer[] DUTY_ID_PUBAREA_VIEWER = 
            new Integer[]{DUTY_ID_CLEANER, DUTY_ID_REPAIRER, DUTY_ID_METERREADER, DUTY_ID_DELIVER, DUTY_ID_HOUSE_MANAGER, DUTY_ID_DELIVER};


}
