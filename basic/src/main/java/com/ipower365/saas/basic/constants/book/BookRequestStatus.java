package com.ipower365.saas.basic.constants.book;

/**
 * 预定任务状态
 * @author anker.du
 * @date 2016年1月15日 下午7:13:19
 */
public enum BookRequestStatus {
    // 提交 已确认 锁定(租客付了定金) 关闭 取消
    CREATE("1045001"), CONFIRMED("1045002"), LOCK("1045003"),FINISH("1045013"), CLOSE("1045004"), CANCEL("1045005");

    BookRequestStatus(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
    
    // 锁定的状态
    private static String[] lockedStatus = {"1045002", "1045003"};

    public static String[] getLockedStatus() {
        return lockedStatus;
    }
    
    public static BookRequestStatus getByCode(String code) {

        for (BookRequestStatus status : BookRequestStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
    
}
