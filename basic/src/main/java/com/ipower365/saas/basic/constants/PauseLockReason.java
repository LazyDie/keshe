package com.ipower365.saas.basic.constants;

/**
 * 暂停门锁权限原因
 * @author anker
 */
public enum PauseLockReason {
    OVERDUE_LOCK("1122001"), // 欠房租锁房
    PAID_UNLOCK("1122002"), // 缴费解锁
    CUSTOM_LOCK("1122003"), // 租客上锁
    CUSTOM_UNLOCK("1122004"),// 租客解锁
    BUSINESS_LOCK("1122005"), // 运营商上锁
    BUSINESS_UNLOCK("1122006"),//运营商解锁
    OVERDUE_RESOURCE_LOCK("1122007"),// 资源欠费锁房
    PAID_RESOURCE_UNLOCK("1122008");// 资源缴费解锁

    PauseLockReason(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

}
