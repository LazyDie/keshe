package com.ipower365.saas.basic.constants;

import com.ipower365.saas.basic.constants.bill.BillSubSubjectEnum;


public enum ResourceLossSubject {
    WaterLoss(BillSubSubjectEnum.RESOURCE_WATER_RATE.getCode(), "水损"), ElectricityLoss(BillSubSubjectEnum.RESOURCE_POWER_RATE.getCode(), "电损"), GasLoss(
            BillSubSubjectEnum.RESOURCE_GAS_BILL.getCode(), "气损");

    private String code;
    private String name;

    private ResourceLossSubject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ResourceLossSubject get(String code) {
        for (ResourceLossSubject type : ResourceLossSubject.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的资源损耗科目码：" + code);
    }

    public String getCode() {
        return code;
    }



    public String getName() {
        return name;
    }



}
