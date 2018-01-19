package com.ipower365.saas.basic.constants.room;

/**
 * 客房类型
 * @author anker
 *
 */
public enum RoomType {

        BED_ONLY("1123001");

        RoomType(String code) {
            this.code = code;
        }

        private final String code;

        public String getCode() {
        return code;
        }
    
}
