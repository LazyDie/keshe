package com.ipower365.saas.basic.constants;

/**
 * 签约任务状态
 * @author anker.du
 * @date 2016年1月15日 下午7:12:20
 */
public enum ContractRequestStatus {
    // 创建 已确认 合同生效 关闭 取消 审核通过(可以入住) 审核不通过 已付款
    CREATE("1046001"), CONFIRM("1046002"), EFFECTIVE("1046003"), CLOSE("1046004"), CANCEL("1046005"), APPROVE("1046006"), REJECT("1046007"), PAIDRENT("1046008");

    ContractRequestStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
