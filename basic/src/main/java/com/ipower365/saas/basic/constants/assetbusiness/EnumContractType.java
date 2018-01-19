package com.ipower365.saas.basic.constants.assetbusiness;


public enum EnumContractType {
    ONE("电费运营", 1137001), TWO("资产运营", 1137002);
    private String name;
    private Integer index;

    private EnumContractType(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(Integer index) {
        if (index == null) return "";
        switch (index) {
            case 1:
                return ONE.name;
            case 2:
                return TWO.name;
            default:
                return ONE.name;
        }
    }

    /** 是否是有效的编码 */
    public static boolean VALID(String code) {
        if(code == null) return false;
        
        for(EnumContractType e : EnumContractType.values()) {
            if(e.getIndex().toString().equals(code)) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
