package com.ipower365.saas.basic.constants;

/**
 * 平台对外转账申请状态：运营商结账申请、租客取现申请
 * @author Aron
 */
public enum UnovoTranferOutApplicationStatus {
    Pending(0, "待审批"), Approved(1, "待放款"), NotApproved(2, "审批未通过"), NotFullyTransferOut(3, "未完全放款"), TransferOutDone(4, "放款完成"), TransferOutFailed(5, "放款失败"), TransferOutCanceled(
            6, "放款取消"), TransferOuting(7, "放款中"), TenantHasConfirmed(9, "待生成结算单"), // 等待生成结算单
    GenSettlementApplication(10, "生成结算单，待审批"), // 定时任务生成结算单
    NoNeedSettlement(11, "无需结算"), NotPaid(12, "尚未支付，无法结算"), NotFullySettlement(13, "部分结算"), // 用于账单未完全支付时的结算状态
    UncertainData(100, "其它");// 不确定的数据，待处理

    private Integer code;
    private String name;

    private UnovoTranferOutApplicationStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static UnovoTranferOutApplicationStatus get(Integer code) {
        for (UnovoTranferOutApplicationStatus type : UnovoTranferOutApplicationStatus.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }

        throw new IllegalArgumentException("无效的对外转账状态码：" + code);
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
