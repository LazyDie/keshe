package com.ipower365.saas.basic.constants.custom;

public class CustomConstants {
	
	 //用户验证码操作
    public static final String CHECKOUT_OPTYPE_REGISTER="00"; //注册
    public static final String CHECKOUT_OPTYPE_RESETPASSWORD="01";//重置密码
    public static final String CHECKOUT_OPTYPE_CHANGEMOBILE="02";//更换手机号
	
	//个人账户类型
	public static final String ACCOUNT_TYPE_PERSON="1026001";
	//企业账户类型 
	public static final String ACCOUNT_TYPE_COMPANY="1026002";
	//平台账户类型
	public static final String ACCOUNT_TYPE_PLATFORM="1026003";
	// 租客预存款账户
	public static final String ACCOUNT_TYPE_TENANT_PREDEPOSIT="1026004";
	// 运营商预存款账户
	public static final String ACCOUNT_TYPE_ORG_PREDEPOSIT="1026006";
	// 运营账户
	public static final String ACCOUNT_TYPE_ASSETBUSINESS="1026005";
	// 平台代收代付
    public static final String ACCOUNT_TYPE_PLATFORM_DELEGATE = "1026007";
    // 运营商预收账户
    public static final String ACCOUNT_TYPE_ORG_PREINCOME = "1026008";
    // 运营商预付账户
    public static final String ACCOUNT_TYPE_ORG_PREOUT = "1026009";
    // 平台预付账户
    public static final String ACCOUNT_TYPE_PLATFORM_PREOUT = "1026010";
    // 平台代充值账户
    public static final String ACCOUNT_TYPE_PLATFORM_DELEGATE_RECHARGE = "1026011";

	public enum ExportTaskTypeEnum {

		ACCOUNT_TYPE_PERSON("1026001", "个人账户类型"),ACCOUNT_TYPE_COMPANY("1026002", "企业账户类型"),ACCOUNT_TYPE_PLATFORM("1026003","平台账户类型"),
		ACCOUNT_TYPE_TENANT_PREDEPOSIT("1026004","租客预存款账户"),ACCOUNT_TYPE_ORG_PREDEPOSIT("1026006","运营商预存款账户"),ACCOUNT_TYPE_ASSETBUSINESS("1026005","运营账户"),ACCOUNT_TYPE_PLATFORM_DELEGATE("1026007","平台代收代付"),
		ACCOUNT_TYPE_ORG_PREINCOME("1026008","运营商预收账户"),ACCOUNT_TYPE_ORG_PREOUT("1026009","运营商预付账户"),ACCOUNT_TYPE_PLATFORM_PREOUT("1026010","平台预付账户"),ACCOUNT_TYPE_PLATFORM_DELEGATE_RECHARGE("1026011","平台代充值账户");

		private String code;
		private String name;

		private ExportTaskTypeEnum(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getName(String code){
			for (ExportTaskTypeEnum exportTaskTypeEnum : ExportTaskTypeEnum.values()){
				if(exportTaskTypeEnum.getCode().equals(code)){
					return exportTaskTypeEnum.getName();
				}
			}
			return "未知";
		}
	}

	// 虚拟账户，如：电力公司
    public static final String ACCOUNT_TYPE_VIRTUAL = "1026901";
    
	
	//账号类型
	public static final String ACCOUNT_NUMBER_TYPE="1066";
	public static final String ACCOUNT_NUMBER_TYPE_ALIPAY=ACCOUNT_NUMBER_TYPE+"001";//支付宝
	public static final String ACCOUNT_NUMBER_TYPE_WEIXIN=ACCOUNT_NUMBER_TYPE+"002";//微信
	public static final String ACCOUNT_NUMBER_TYPE_BANKCARD=ACCOUNT_NUMBER_TYPE+"003";//银行卡
	public static final String ACCOUNT_NUMBER_TYPE_OTHERS=ACCOUNT_NUMBER_TYPE+"099";//其他
	
	//账号状态
	public static final String ACCOUNT_STATUS_NORMAL="1067001"; //启用
	public static final String ACCOUNT_STATUS_FREEZE="1067002"; //停用
	public static final String ACCOUNT_STATUS_INVALID="1067009"; //无效
	
	//数据来源
	public static final String DATA_ORIG_CURSYS="1068001"; //系统录入
	public static final String DATA_ORIG_BANK="1068002"; //银行接口
	public static final String DATA_ORIG_OTHER="1068099"; //其他
	
	//客户状态
	public static final String CUSTOMER_REGISTER_STATUS_NORMAL="1023001"; //正常
	public static final String CUSTOMER_REGISTER_STATUS_FREEZE="1023009"; //冻结
	
	
	//客户类型
	public static final String CUSTOMER_TYPE_PERSON="1001001";//个人
	public static final String CUSTOMER_TYPE_COMPANY="1001002";//企业
	public static final String CUSTOMER_TYPE_VIRTUAL="1001003";//虚拟实体
    public static final String CUSTOMER_TYPE_ASSETCONTRACT="1001004";//运营合同
    // 公司相关的客户类型，销账相关
    public static final String[] CUSTOM_COMPANY_TYPES = {CUSTOMER_TYPE_COMPANY,CUSTOMER_TYPE_ASSETCONTRACT};
	
	
	//用户类型
	public static final String USER_TYPE_DEFAULT="1002001"; //默认用户
	public static final String USER_TYPE_TENANT="1002002"; //租户
	public static final String USER_TYPE_STAFF="1002003"; //员工
    public static final String USER_TYPE_VISITOR = "1002004"; //访客
	
	
	//个人证件类型
	public static final String PERSON_ID_TYPE="1024";//
	public static final String PERSON_ID_TYPE_IDCARD=PERSON_ID_TYPE+"001";//身份证
	public static final String PERSON_ID_TYPE_PASSPORT=PERSON_ID_TYPE+"002";//护照
	public static final String PERSON_ID_TYPE_HKPASSER=PERSON_ID_TYPE+"003";//港澳通行证
	public static final String PERSON_ID_TYPE_OFFICERCARD=PERSON_ID_TYPE+"004";//军官证
	public static final String PERSON_ID_TYPE_STUDENTCARD=PERSON_ID_TYPE+"005";//学生证
	
	//企业证件类型
	public static final String ENTERPRISE_ID_TYPE="1025";//
	public static final String ENTERPRISE_ID_TYPE_BUSINESS=ENTERPRISE_ID_TYPE+"001";//营业执照
	public static final String ENTERPRISE_ID_TYPE_ORGANIZATIONCODE=ENTERPRISE_ID_TYPE+"002";//组织机构代码
	
	public static Integer IDNO_CHECK_STATUS_UNAUTHEN=0;//未认证
	public static Integer IDNO_CHECK_STATUS_AUTHENED=1;//已认证
	public static Integer IDNO_CHECK_STATUS_AUTHENING=2;//审核中
	public static Integer IDNO_CHECK_STATUS_AUTHENREUFSE=3;//审核拒绝
	
	/**
	 * 认证渠道 0 手工输入 1 身份证读卡器
	 */
	public static Integer AUTHEN_CHANNEL_MANUAL_INPUT = 0;
	public static Integer AUTHEN_CHANNEL_READ_CARD = 1;
	
	/**
	 * 性别
	 */
	public static final String PERSON_SEX_TYPE="1048";
	public static final String PERSON_SEX_TYPE_MAN=PERSON_SEX_TYPE+"001"; //男
	public static final String PERSON_SEX_TYPE_FEMALE=PERSON_SEX_TYPE+"002";//女
	
	
	public static final String CUSTOM_FROM_TYPE="1050"; //客户来源
	public static final String CUSTOM_FROM_TYPE_AJK=CUSTOM_FROM_TYPE+"001"; //安居客
	public static final String CUSTOM_FROM_TYPE_SF=CUSTOM_FROM_TYPE+"002"; //搜房网
	public static final String CUSTOM_FROM_TYPE_58TC=CUSTOM_FROM_TYPE+"003"; //58同城
	public static final String CUSTOM_FROM_TYPE_GJW=CUSTOM_FROM_TYPE+"004"; //赶集网
	public static final String CUSTOM_FROM_TYPE_AWJW=CUSTOM_FROM_TYPE+"005"; //爱屋吉屋
	public static final String CUSTOM_FROM_TYPE_OTHER=CUSTOM_FROM_TYPE+"999"; //其他
	
	//上传GPS类型
	public static final String GPS_TYPE="1054";
	public static final String GPS_TYPE_ONWORK=GPS_TYPE+"001";//员工上班
	public static final String GPS_TYPE_OFFWORK=GPS_TYPE+"002";//员工下班
	public static final String GPS_TYPE_SCHEDULE=GPS_TYPE+"003";//定时推送
	public static final String GPS_TYPE_CLEAN="";
	public static final String GPS_TYPE_REPAIR="";
//	public static final String GPS_TYPE_="";
	
	
	//联系方式管理中的 联系人类别
    public static String ENT_LINK_CATEGORY="1079";
    public static String ENT_LINK_CATEGORY_CUSTOMER=ENT_LINK_CATEGORY+"001";//客户
    public static String ENT_LINK_CATEGORY_HOUSE=ENT_LINK_CATEGORY+"002";//房源
    public static String ENT_LINK_CATEGORY_HOUSE_CLUE=ENT_LINK_CATEGORY+"003";//房源线索
    
    
    //运营商与客户关联关系类型
    public static String CUSTOM_ORG_LINK_TYPE="1080";
    public static String CUSTOM_ORG_LINK_TYPE_CUSTOM=CUSTOM_ORG_LINK_TYPE+"001";//客户关系
    public static String CUSTOM_ORG_LINK_TYPE_MANAGER=CUSTOM_ORG_LINK_TYPE+"002";//员工关系-管理员
//    public static String CUSTOM_ORG_LINK_TYPE_="";
	
	//默认系统客户名称
	public static String SYSTEM_CUSTOMER_NAME="系统";
	public static Integer PLATFORM_SYSTEM_ORG_ID=1;//平台系统机构ID
	//系统默认客户名称前缀
	public static String SYSTEM_DEFAULT_CUSTOM_NAME_PRE="白云深";
	public static String SYSTEM_DEFAULT_STAFF_NAME_PRE="联寓";
	// 账户最大信息额度，系统账户使用
    public static final long MAX_ACCOUNT_CREDITS = -99999999999999L;
	
	public static String getSexCode(String sexType){
		if("M".equals(sexType)){
			return PERSON_SEX_TYPE_MAN;
		}else if("F".equals(sexType)){
			return PERSON_SEX_TYPE_FEMALE;
		}else{
			return "";
		}
	}
	
	
}
