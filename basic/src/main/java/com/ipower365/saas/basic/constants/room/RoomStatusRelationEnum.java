package com.ipower365.saas.basic.constants.room;


/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants.room
 * @ClassName: RoomStatusRelationEnum
 * @author: xushengpeng
 * @time: 2017年11月1日
 * @类说明: 房态编号与功能编号之前的映射枚举
 */
public enum RoomStatusRelationEnum {
 // 配置，配置中待租,空房待租，租出，到期待租，业主停用，运营商停用
    INSTALLING("1005001","201001004"), INSTALLED("1005002","201001003"), VACANT("1005003","201001001"), 
    RENTOUT("1005004","201001002"), OCCUPY_FORRENT("1005005","201001005"), 
    HOLDER_STOP("1005006","201001006"), BUSINESS_STOP("1005007","201001007");
    
    private String code; //房态编号
    private String functionCode; //功能编号

    RoomStatusRelationEnum(String code,String functionCode){
        this.code = code;
        this.functionCode = functionCode;
    }
    
    public static RoomStatusRelationEnum getByFunctionCode(String functionCode) {
        if(null == functionCode){
            return null;
        }
        
        for(RoomStatusRelationEnum status : RoomStatusRelationEnum.values()){
            if(status.getFunctionCode().equals(functionCode)) {
                return status;
            }
        }
        throw new IllegalArgumentException("没找到与功能编号匹配的房态编号：" + functionCode);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }
    
    
}
