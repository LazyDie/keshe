package com.ipower365.saas.basic.constants;

public enum CheckinHistoryType {
    Create, // 创建
    Extend, // 延期(只延长时间)
    ActiveExt, // 延期后使用新合同
    Checkout// 终止
}
