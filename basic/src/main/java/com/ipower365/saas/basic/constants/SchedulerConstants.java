package com.ipower365.saas.basic.constants;

/**
 * 
 * @ProjectName: 
 * @ClassName: TaskConstants.java
 * @Description: 
 * @author: liuguijun
 * @date: 2016年4月7日 上午10:42:26
 */
public class SchedulerConstants {
    
    //定时任务执行状态
    public static final String SCHEDULER_EXECUTE_STATUS = "1087";
    
    public static final String SCHEDULER_EXECUTE_STATUS_NOT_START = SCHEDULER_EXECUTE_STATUS + "001";//为执行
    
    public static final String SCHEDULER_EXECUTE_STATUS_PROCESSING = SCHEDULER_EXECUTE_STATUS + "002";//执行中
    
    public static final String SCHEDULER_EXECUTE_STATUS_SUCCESS = SCHEDULER_EXECUTE_STATUS + "003";//执行成功
    
    public static final String SCHEDULER_EXECUTE_STATUS_FAILURE = SCHEDULER_EXECUTE_STATUS + "004";//执行失败
    
    //定时任务修复状态
    public static final String SCHEDULER_REPAIR_STATUS = "1088";
    
    public static final String SCHEDULER_REPAIR_STATUS_NOT_START = SCHEDULER_REPAIR_STATUS + "001";//未修复
    
    public static final String SCHEDULER_REPAIR_STATUS_PROCESSING = SCHEDULER_REPAIR_STATUS + "002";//修复中
    
    public static final String SCHEDULER_REPAIR_STATUS_SUCCESS = SCHEDULER_REPAIR_STATUS + "003";//修复成功
    
    public static final String SCHEDULER_REPAIR_STATUS_FAILURE = SCHEDULER_REPAIR_STATUS + "004";//修复失败
    
    //定时任务业务执行状态
    public static final String SCHEDULER_BUSINESS_STATUS = "1102";
    
    /**
     * 业务执行成功
     */
    public static final String SCHEDULER_BUSINESS_STATUS_SUCCESS = SCHEDULER_BUSINESS_STATUS + "001";
    
    /**
     * 业务执行失败
     */
    public static final String SCHEDULER_BUSINESS_STATUS_FAILURE = SCHEDULER_BUSINESS_STATUS + "002";

}
