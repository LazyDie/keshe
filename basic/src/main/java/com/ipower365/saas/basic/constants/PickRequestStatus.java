package com.ipower365.saas.basic.constants;
/**
 * 看房任务状态
 * @author anker.du
 * @date 2016年1月15日 下午7:12:20
 */
public enum PickRequestStatus {
    // 待确认 已确认 看房中 已完成 关闭 取消
    CREATE("1095001"), CONFIRM("1095002"), START("1095003"),FINISH("1095004"), CLOSE("1095005"), CANCEL("1095006");

    PickRequestStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
