package com.ipower365.saas.basic.constants;

/**
 * 管理中心参数编码
 * @author anker
 */
public interface CentralizedParamCode {

    // 门锁长效密码是否允许使用(内门)
    public final static String LOCK_KEYBOARD_ABLE_INNER = "1128002";
    // 门锁长效密码是否允许使用(入户门)
    public final static String LOCK_KEYBOARD_ABLE_OUTER = "1128003";
    //  门锁长效密码是否允许使用(公共区域：大楼、楼层)
    public final static String LOCK_KEYBOARD_ABLE_PUBLIC = "1128004";
    
    //  物业电表电量剩余电量通知发送短信阀值
    public final static String RECHARGE_SMS_NOTICE = "1128005";
}
