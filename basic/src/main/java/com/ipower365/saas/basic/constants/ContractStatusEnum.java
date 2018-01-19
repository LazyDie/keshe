package com.ipower365.saas.basic.constants;


public enum ContractStatusEnum {
    // 创建，生效，解约
    CREATE("1039001","待签合同"), EFFECTIVE("1039002","生效"), RELIEVE("1039003","解约"),CLOSE("1039004","关闭"),CANCEL("1039005","取消");

   

    private ContractStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private  String code;
    private  String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public static ContractStatusEnum get(String code) {
        for (ContractStatusEnum e : ContractStatusEnum.values()) {
            if (e.getCode().equals(code))
                return e;
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
    
    
}
