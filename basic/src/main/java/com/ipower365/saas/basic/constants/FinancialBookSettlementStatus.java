package com.ipower365.saas.basic.constants;

/**
 * 财务流水的结算状态:租客未确认，租客确认，生成结算单申请，后面的流程状态，通过申请状态跟踪，和账务流水就没关系了
 * @author Aron
 */
//public enum FinancialBookSettlementStatus {
//    TenantHasNotConfirmed(0, "租客尚未确认"), TenantHasConfirmed(1, "租客确认"), GenSettlementApplication(2, "生成结算单申请"), // 定时任务生成结算单
//    NoNeedSettlement(3, "无需结算");//手工入账等无需结账
//
//    private Integer code;
//    private String name;
//
//    private FinancialBookSettlementStatus(Integer code, String name) {
//        this.code = code;
//        this.name = name;
//    }
//
//    public static FinancialBookSettlementStatus get(Integer code) {
//        for (FinancialBookSettlementStatus type : FinancialBookSettlementStatus.values()) {
//            if (type.code.equals(code)) {
//                return type;
//            }
//        }
//
//        throw new IllegalArgumentException("无效的结算状态码：" + code);
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
//}
