package com.ipower365.saas.basic.constants;

/**
 * 分利核算状态：过程中核算和分利审批的状态，不在这里跟踪
 * @author Aron
 */
public enum ProfitAccountingStatus {
    ProfitNotAccountingYet(0, "未核算"), ProfitAccountedDoc(1, "已生成核算单"), ProfitAccountingApproved(2, "核算审批通过"), ProfitAccountingRejected(3, "核算审批未通过"), ProfitDistributedDoc(4,
            "已生成分利结算单"), ProfitDistributedDocApproved(5, "分利结算审批通过"), ProfitDistributedDocRejected(6, "分利结算审批未通过"), ProfitDistributedSus(7, "已分利放款"), ProfitDistributedFailed(8,
            "分利放款失败"), ProfitDistributedNotFullyTransferedOut(9, "未完全放款"), ProfitDistributionTransferOuting(10, "放款中");

    private Integer val;
    private String name;

    private ProfitAccountingStatus(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ProfitAccountingStatus(Integer val) {
        this.val = val;
    }

    public Integer getValue() {
        return val;
    }

    public static ProfitAccountingStatus get(Integer val) {
        if (val == null) {
            return null;
        }

        for (ProfitAccountingStatus status : ProfitAccountingStatus.values()) {
            if (status.val.equals(val)) {
                return status;
            }
        }

        throw new IllegalArgumentException("无效的核算状态：" + val);
    }
}
