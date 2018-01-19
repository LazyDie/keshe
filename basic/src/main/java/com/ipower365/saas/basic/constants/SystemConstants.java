package com.ipower365.saas.basic.constants;

import java.util.ArrayList;
import java.util.List;

public class SystemConstants {

	//上传文件路径编号
	public static final String SYS_PARAM_FILE_UPLOAD_PATH="100001";
	
	//短信接口链接编号
    public static final String SYS_PARAM_SMS_URL="100002";
	//验证码超时时间  --分钟
	public static final String SYS_PARAM_MESSAGE_OUTTIME="100003";
	
	//房间续租到期提醒天数配置
	public static final String SYS_PARAM_ROOM_EXTEND="100005";
	
	public static final String SYS_PARAM_APP_UPLOAD="100006";
	public static final String SYS_PARAM_APP_SOFTWARE_UPLOAD="100007";
	public static final String SYS_PARAM_APP_SOFTWARE_DOWNLOAD="100008";
	
	//app下载地址
	public static final String SYS_PARAM_APP_DOWNLOAD_URL="100010";
	
	// 服务器地址
	public static final String SYS_PARAM_SERVER_URL="SERVER_URL";
	//mqtt地址
	public static final String SYS_PARAM_MQTT_URL="MQTT_URL";
	
	//默认续租提醒天数 30天
	public static final Integer SYS_PARAM_ROOM_EXTEND_DAY=30;
	
	//抄表调度参数配置
	public static final String SYS_PARAM_METER_READ_CONFIG="METER_READ_CONFIG";
	
	public static final String DEPLOY_TYPE="deploy_type";
	public static String ID_NO_REPLACE_CHARS="*************";
	public final static String DEFAULT_UPLOAD_FILE_PATH = "/mnt/ipower365/files";// 默认上传文件路径
	//图片清晰度
	public static String PIC_DEFINITION_ORIGINAL="_ORI";//原图
	//压缩尺寸
	public static String PIC_COMPRESS_SIZE_50_50="_50_50";
	public static String PIC_COMPRESS_SIZE_72="_72";
	public static String PIC_COMPRESS_SIZE_72_72="_72_72";
	public static String PIC_COMPRESS_SIZE_200_200="_200_200";
	public static String PIC_COMPRESS_SIZE_180_180="_180_180";
	public static String PIC_COMPRESS_SIZE_480="_480";
	public static String PIC_COMPRESS_SIZE_480_320="_480_320";
	public static String PIC_COMPRESS_SIZE_640_350="_640_350";
	public static String PIC_COMPRESS_SIZE_720="_720";
	public static String PIC_COMPRESS_SIZE_720_480="_720_480";
	public static String PIC_COMPRESS_SIZE_1024="_1024";
	public static String PIC_COMPRESS_SIZE_750_374="_750_374";
	public static String PIC_COMPRESS_SIZE_750_340="_750_340";
	public static String PIC_COMPRESS_SIZE_750_1334="_750_1334";
	public static String PIC_COMPRESS_SIZE_1500_2656="_1500_2656";
	public static String PIC_COMPRESS_SIZE_751_481="_751_481";
	public static String PIC_COMPRESS_SIZE_1492_892="_1492_892";
	public static String PIC_COMPRESS_SIZE_1920_1080="_1920_1080";
	public static String PIC_COMPRESS_SIZE_640_960="_640_960";
	public static String PIC_COMPRESS_SIZE_750_454="_750_454";
	public static String PIC_COMPRESS_SIZE_1242_752="_1242_752";
	
	public static Integer HELP_CONTENT_TYPE_TXT=0;//文本
	public static Integer HELP_CONTENT_TYPE_FILE=1;//文件

	
	//压缩尺寸集
	private static List<String> PIC_DEFINITION_LIST=null;
	
	//app版本状态
	public static String APP_VERSION_STATUS="1101";
	public static String APP_VERSION_STATUS_CREATED=APP_VERSION_STATUS+"001";//已创建
	public static String APP_VERSION_STATUS_PUBLISH=APP_VERSION_STATUS+"002";//已发布
	public static String APP_VERSION_STATUS_INVALID=APP_VERSION_STATUS+"099";//无效
	
	
	
	/**
	 * 获取压缩集合
	 * @return
	 */
	public static List<String> getPictureCompressSize(){
		if(PIC_DEFINITION_LIST==null || PIC_DEFINITION_LIST.isEmpty()){
			PIC_DEFINITION_LIST=new ArrayList<String>();
			PIC_DEFINITION_LIST.add("_72");
			PIC_DEFINITION_LIST.add("_480");
//			PIC_DEFINITION_LIST.add("_720");
		}
		return PIC_DEFINITION_LIST;
	}
	
}
