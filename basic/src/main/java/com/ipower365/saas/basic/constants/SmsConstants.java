package com.ipower365.saas.basic.constants;

import java.text.MessageFormat;

/**
 * @ProjectName : 公寓系统-messageservice
 * @ClassName: SmsConstants
 * @Description: 短信模块系统常量
 * @author liwh
 * @date 2015年10月9日 下午7:14:57
 */
public class SmsConstants {


    // 短信验证码内容
    public static final String SMS_CHECKCODE_CONTENT = "sms.checkcode.content";
    public static final String SMS_CONTENT_PROFILE_CHGDEVICE = "sms.content.profile.changeDevice";
    // 租客催办提醒内容
    public static final String SMS_CONTENT_TICKET_PRESS_HANDLER = "sms.ticket.press.remind.handler";
    // 租客催办提醒内容
    public static final String SMS_CONTENT_TICKET_PRESS_MANAGER = "sms.ticket.press.remind.manager";
    // 提醒任务处理人的消息内容
    public static final String SMS_CONTENT_TICKET_REMIND_HANDLER = "sms.ticket.task.remind.handler";
    // 提醒任务处理人的管家的消息内容
    public static final String SMS_CONTENT_TICKET_REMIND_MANAGER = "sms.ticket.task.remind.manager";
    // 提供租客投诉建议已处理的消息内容
    public static final String SMS_CONTENT_TICKET_ADVISE_REMIND_HANDLED = "sms.ticket.advise.remind.handled";

    // =提醒预定交定金
    public static final String SMS_CONTENT_TICKET_REMIND_CUSTOMER_PREPAID = "sms.ticket.task.remind.custom.prepaid";
    // =房间即将到期续租提醒
    public static final String SMS_CONTENT_TICKET_REMIND_CUSTOMER_OUTDATE = "sms.ticket.task.remind.custom.outdate";
    // =签约后补交房租
    public static final String SMS_CONTENT_TICKET_REMIND_CUSTOMER_PAYREDT = "sms.ticket.task.remind.custom.payrent";
    // =提醒租客过来签约
    public static final String SMS_CONTENT_TICKET_REMIND_CUSTOMER_CONTRACT = "sms.ticket.task.remind.custom.contract";
    // 提醒管家：租客已付租金
    public static final String SMS_CONTENT_TICKET_REMIND_MANAGER_PAYRENT = "sms.ticket.task.remind.manager.payrent";
    // 提醒管家：租客已付资产租金
    public static final String SMS_CONTENT_TICKET_REMIND_MANAGER_ESTATE = "sms.ticket.task.remind.manager.estate";

    // 提醒管家：租客已签约
    public static final String SMS_CONTENT_TICKET_REMIND_MANAGER_SIGEDNCTR = "sms.ticket.task.remind.manager.signedctr";

    public static final String SMS_CONTENT_TICKET_REMIND_MANAGER_PAYEANEST = "sms.ticket.task.remind.manager.payeanest";
    //

    // 通用的任务提醒
    public static String SMS_TICKET_TASK_REMIND = "sms.ticket.task.{0}.remind.{1}";
    // 退款任务操作流程提醒
    public static String SMS_TICKET_TASK_REFUND_REMIND = "sms.ticket.refund.{0}.remind.{1}";
    public static String REMIND_USER_TYPE_CUSTOMER = "customer";
    public static String REMIND_USER_TYPE_STAFF = "staff";
    public static String REMIND_USER_TYPE_MANAGER = "manager";

    // 提醒注册短信内容
    public static String SMS_CONTENT_REMIND_REGISTER = "sms.content.remind.register";
    // 邀请下载app
    public static String SMS_CONTENT_REMIND_INVITE = "sms.content.remind.invite";

    public static final String PrepayRemindKey = "prepay.remind";
    public static final String PowoffRemindKey = "poweroff.remind";// 即将断电，断电提醒key
    public static final String PoweredoffRemindKey = "poweredoff.remind";// 断电通知key
    public static final String PoweredoffFailedReindKey = "poweredoffFailed.remind";
    public static final String PoweredonFailedReindKey = "poweredonFailed.remind";
    public static final String RedoPoweredoffSusReindKey = "redoPoweredoffSus.remind";
    public static final String RedoPoweredonSusReindKey = "redoPoweredonSus.remind";
    public static final String BalanceWarningKey = "balanceWarning.remind";
    public static final String BossWarningKey = "bossWarning.remind";


    public static final String CreateBillRemindKey = "createBill.remind";
//预存款充值提醒
    public static final String PreDepositRechargeRemindKey = "rechargePreDeposit.remind";
    public static final String PreDepositRechargeSusRemindKey = "rechargePreDepositSus.remind";

    public static final String RechargeSusRemindKey = "rechargeSus.remind";
    public static final String RechargeFailedRemindKey = "rechargeFailed.remind";
    public static final String PreDepositRechargeFailedRemindKey = "prdepositRechargeFailed.remind";

    public static final String EnchashmentApplicationRemindKey = "enchashmentApplication.remind";
    public static final String EnchashmentApprovedRemindKey = "enchashmentApproved.remind";


    public static final String EnchashmentSusRemindKey = "enchashmentSus.remind";
    public static final String EnchashmentRefusedRemindKey = "enchashmentRefused.remind";

    public static final String DeductionRemindKey = "deduction.remind";

    public static final String SettlementApplicationRemindKey = "settlementApplication.remind";
    public static final String SettlementDoneRemindKey = "settlementDone.remind";


    /**
     * 临时使用
     */
    public static final String TmpPreDepositNotEnoughRemindKey = "tmpPreDepositRecharge.remind";

    // 门锁
    public static final String SMS_CONTENT_STAFF_UNLOCK = "sms.doorlock.staff.open.remind";
    public static final String SMS_CONTENT_NOTIFY_CLEARPWD = "sms.doorlock.notify.clearpwd";
    

    /** 出房 **/
    public static final String SMS_CONTENT_RENT_CHECKIN = "sms.content.rent.checkin.download.aptapp";
    public static final String SMS_CONTENT_RENT_CHECKIN_NEWUSER = "sms.content.rent.checkin.download.aptapp.newuser";
    public static final String SMS_CONTENT_RENT_BOOKING_PAY = "rent.booking.pay";
    public static final String RENT_REMIND1 = "rent.remind.1";
    public static final String RENT_REMIND2 = "rent.remind.2";
    public static final String RENT_REMIND3 = "rent.remind.3";
    public static final String RENT_REMIND4 = "rent.remind.4";
    public static final String RENT_REMIND5 = "rent.remind.5";
    public static final String RENT_REMIND6 = "rent.remind.6";
    public static final String RENT_REMIND7 = "rent.remind.7";
    public static final String RENT_REMIND8 = "rent.remind.8";
    public static final String RENT_REMIND9 = "rent.remind.9";
    public static final String RENT_REMIND10 = "rent.remind.10";
    public static final String RENT_REMIND11 = "rent.remind.11";
    public static final String RENT_REMIND12 = "rent.remind.12";
    public static final String RENT_REMIND13 = "rent.remind.13";
    public static final String RENT_REMIND14 = "rent.remind.14";
    public static final String RENT_REMIND15 = "rent.remind.15";
    public static final String RENT_REMIND16 = "rent.remind.16";
    public static final String RENT_REMIND17 = "rent.remind.17";
    public static final String RENT_REMIND18 = "rent.remind.18";
    public static final String RENT_REMIND19 = "rent.remind.19";
    public static final String RENT_REMIND20 = "rent.remind.20";
    public static final String RENT_REMIND21 = "rent.remind.21";
    public static final String RENT_LOCKROOM = "rent.remind.lockroom";
    public static final String RENT_UNLOCKROOM = "rent.remind.unlockroom";
    public static final String DFC_LOCK_KEYPWD = "sms.doorlock.keypwd";
    public static final String DFC_LOCK_SHORT_RENT_KEYPWD = "sms.doorlock.short.rent.keypwd";

    // 身份认证操作提醒
    // 审核中
    public static final String CUSTOMER_REMIND_IDNO_SUBMIT = "customer.remind.idno.submit";
    // 认证通过
    public static final String CUSTOMER_REMIND_IDNO_PASS = "customer.remind.idno.pass";
    // 认证失败
    public static final String CUSTOMER_REMIND_IDNO_FAIL = "customer.remind.idno.fail";
    // 通知管理员实名认证
    public static final String CUSTOMER_REMIND_IDNO_AUDIT = "customer.remind.idno.audit";

    // 系统自动注册以后提醒
    public static final String CUSTOMER_REGISTER_AUTO_REMIND = "sms.content.remind.register.auto";


    // 转租申请成功以后短信提示转租人
    public static final String CUSTOMER_SUBLET_REMIND_REQUEST = "sms.content.remind.sublet.request";

    // 退款申请时 通知租客
    public static final String REFUND_REMIND_RENTER = "sms.content.refund.remind.renter";
    // 退款申请审核通过时 通知租客
    public static final String REFUND_REMIND_CHECK_RENTER = "sms.content.refund.check.remind.renter";
    
    // 物业电表电量剩余电量，发短信提醒
    public static final String SMS_CONTENT_RECHARGE_NOTICE = "sms.content.recharge.notice";
    // 短信验证码超时时间 默认5分支
    public static final int SMS_CHECKCODE_OUTTIME = 5;

    // 消息类型
    public static final String SMS_MESSAGE_TYPE_REMIND_SYSTEM = "1019001";// 系统消息 一般的提醒
    public static final String SMS_MESSAGE_TYPE_REMIND_ANNOUNCEMENT = "1019002";// 公告
    public static final String SMS_MESSAGE_TYPE_NOTICE = "1019003";// 通知
    public static final String SMS_MESSAGE_TYPE_REGISTER = "1019004";// 注册验证码
    public static final String SMS_MESSAGE_TYPE_RESETPASSWORD = "1019005";// 重置密码验证码
    public static final String SMS_MESSAGE_TYPE_CHGMOBILE = "1019006";// 更换手机验证码
    public static final String SMS_MESSAGE_TYPE_SUBLET = "1096018";// 转租

    public static final String SMS_MESSAGE_TYPE_REMIND_TICKET = "1019007";// 流程类提醒
    public static final String SMS_MESSAGE_TYPE_REMIND_BILL = "1019008"; // 账单类提醒
    public static final String SMS_MESSAGE_TYPE_REMIND_CONTRACT = "1019009"; // 租约信息
    public static final String SMS_MESSAGE_TYPE_REMIND_RECHARGE = "1019010";// 余额不足提醒
    public static final String SMS_MESSAGE_TYPE_REMIND_POWEROFF = "1019011";// 断电提醒短信
    public static final String SMS_MESSAGE_TYPE_RESETPAYPWD = "1019012";// 重置支付密码
    public static final String SMS_MESSAGE_TYPE_REMIND_POWEREDOFF = "1019013";// 断电短信
    public static final String SMS_MESSAGE_TYPE_REMIND_POWEREDOFFFailed = "1019014";// 断电失败短信
    public static final String SMS_MESSAGE_TYPE_REMIND_POWEREDONFailed = "1019015";// 上电失败短信
    public static final String SMS_MESSAGE_TYPE_REMIND_RedoPOWEREDONSus = "1019016";// 上电重试成功短信
    public static final String SMS_MESSAGE_TYPE_REMIND_RedoPOWEREDOFFSus = "1019017";// 断电重试成功短信

    // 信息发送渠道 101-挚慧平台短信，102-联永平台短信 201-邮件 301-apns 401-微信 999-手机推送
    public static final String MESSAGE_SEND_CHANEL_SMS_ZH = "101";
    public static final String MESSAGE_SEND_CHANEL_SMS_LY = "102";
    public static final String MESSAGE_SEND_CHANEL_SMS_EMAIL = "201";
    public static final String MESSAGE_SEND_CHANEL_SMS_APNS = "301";
    public static final String MESSAGE_SEND_CHANEL_SMS_MOBILE = "999";
    
    public static final String SMS_MESSAGE_TENANT_APPLY_ESTATE="sms.tenant.apply.estate";
    public static final String SMS_MESSAGE_STEWARD_CONFIRM="sms.steward.confirm";
    
    public static final String RepaidBillRemindKey = "repaid.bill.remind";// 补账单key
    public static final String TENANT_CORRECTION_REMIND_KEY= "tenant.correction.remind";// 租客纠错key

    // 消息类的短消息
//    public static String[] MESSAGE_TYPE_MESSAGE=new String[]{
//    	SMS_MESSAGE_TYPE_REMIND_SYSTEM,SMS_MESSAGE_TYPE_REMIND_TICKET,
//    	SMS_MESSAGE_TYPE_REMIND_BILL,SMS_MESSAGE_TYPE_REMIND_CONTRACT,
//    	SMS_MESSAGE_TYPE_REMIND_RECHARGE,SMS_MESSAGE_TYPE_REMIND_POWEROFF,
//    	SMS_MESSAGE_TYPE_REMIND_POWEREDOFF,SMS_MESSAGE_TYPE_REMIND_POWEREDOFFFailed,
//    	SMS_MESSAGE_TYPE_REMIND_POWEREDONFailed,SMS_MESSAGE_TYPE_REMIND_RedoPOWEREDONSus,
//    	SMS_MESSAGE_TYPE_REMIND_RedoPOWEREDOFFSus
//    };


    /**
     * 获取短信模版key
     * @param action
     * @param userType
     * @return
     */
    public static String getSmsContentKey(String action, String userType) {
        String key = getSmsContentKey(action, userType, SMS_TICKET_TASK_REMIND);
        return key;
    }

    /**
     * @param action
     * @param userType
     * @param title
     * @return
     */
    public static String getSmsContentKey(String action, String userType, String title) {
        String key = "";
        try {
            key = MessageFormat.format(title, action, userType);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return key;
    }


}
