package com.ipower365.saas.basic.constants;


/**
 * 资源用量单位
 * @author Aron
 */
//public enum ResourceUseUnit {
//    Ton(0, "吨"), CubicMeter(1, "立方米"), Degree(2, "度"), Time(3, "时间");

//    private static Map<String, ResourceUseUnit> map = new HashMap<String, ResourceUseUnit>();
//    static {
//        map.put(BillSubjectEnum.RESOURCE_WATER_RATE.getCode(), Ton);
//        map.put(BillSubjectEnum.resource.HotWaterFee, Ton);
//        map.put(BillSubjectEnum.RESOURCE_GAS_BILL.getCode(), CubicMeter);
//        map.put(BillSubjectEnum.RESOURCE_POWER_RATE.getCode(), Degree);
//        map.put(BillSubjectEnum.RESOURCE_SHARED.getCode().ExclusiveResource, Time);
//        map.put(AccountBillID.CenterAC, Degree);
//    }
//
//    private Integer code;
//    private String name;
//
//    private ResourceUseUnit(Integer code, String name) {
//        this.code = code;
//        this.name = name;
//    }
//
//    public static ResourceUseUnit get(Integer code) {
//        for (ResourceUseUnit type : ResourceUseUnit.values()) {
//            if (type.code.equals(code)) {
//                return type;
//            }
//        }
//
//        throw new IllegalArgumentException("无效资源度量码：" + code);
//    }
//
//    public Integer getCode() {
//        return code;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * 根据资源收费科目获取单位
//     * @param subjectId
//     * @return
//     */
//    public static ResourceUseUnit get(String subjectId) {
//        return ResourceUseUnit.map.get(subjectId);
//    }
//}
