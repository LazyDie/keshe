package com.ipower365.saas.basic.constants.custom;

public enum CustomAccountTypeTag {
    // 余额账户,预存款账户
    BALANCE("1026001", "1026002", "1026003", "1026005"), PREDEPOSIT("1026004", "1026006");
    private String[] types;

    private CustomAccountTypeTag(String... types) {
        this.types = types;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }
}
