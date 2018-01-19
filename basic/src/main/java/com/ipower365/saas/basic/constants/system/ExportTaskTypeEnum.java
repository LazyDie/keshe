package com.ipower365.saas.basic.constants.system;

/**
 * Created by Yan on 2017/8/3.
 */
public enum  ExportTaskTypeEnum {

    BILL_MANAGEMENT(1, "账单管理"),ORG_BOOK(2, "运营商账本"),SETTLEMENT(3,"平台结算"),PREDEPOSITBALANCE(4,"预付费"),PREDEPOSITBALANCEWATER(5,"预付费流水"),BookWater(6,"账本流水"),BillManager(7,"账单管理"),ORG_SETTLEMENT(8,"运营商结算");

    private Integer code;
    private String name;

    private ExportTaskTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(Integer code){
        for (ExportTaskTypeEnum exportTaskTypeEnum : ExportTaskTypeEnum.values()){
            if(exportTaskTypeEnum.getCode() == code){
                return exportTaskTypeEnum.getName();
            }
        }
        return "未知";
    }
}
