package com.ipower365.saas.basic.constants.system;

/**
 * Created by Yan on 2017/8/3.
 */
public enum ExportTaskStatusEnum {
    IN_EXPORT(1, "导出中"), COMPLETE_EXPORT(2, "导出完成"), FAIL_EXPORT(3, "导出失败");
    private Integer code;
    private String name;

    private ExportTaskStatusEnum(Integer code, String name) {
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
        for (ExportTaskStatusEnum exportTaskStatusEnum : ExportTaskStatusEnum.values()){
            if(exportTaskStatusEnum.getCode() == code){
                return exportTaskStatusEnum.getName();
            }
        }
        throw new IllegalArgumentException("没有匹配的枚举项:" + code);
    }
}
