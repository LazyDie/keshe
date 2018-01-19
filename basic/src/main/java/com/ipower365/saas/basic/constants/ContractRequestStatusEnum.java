package com.ipower365.saas.basic.constants;

/**
 * 签约任务状态
 * @author anker.du
 * @date 2016年1月15日 下午7:12:20
 */
public enum ContractRequestStatusEnum {
    // 创建 已确认 合同生效 关闭 取消 审核通过(可以入住) 审核不通过 已付款
    CREATE("1046001","待确认"), CONFIRM("1046002","已确认"), EFFECTIVE("1046003","已生效"), CLOSE("1046004","关闭"), CANCEL("1046005","取消"), APPROVE("1046006","已通过"), REJECT("1046007","审核不通过"), PAIDRENT("1046008","已付款");

    

    private ContractRequestStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }


    private  String code;
    private String  name;
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getCode() {
        return code;
    }
    
    public static ContractRequestStatusEnum get(String code) {
        for (ContractRequestStatusEnum e : ContractRequestStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
}
