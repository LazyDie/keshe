package com.ipower365.saas.basic.constants.house;

import java.util.ArrayList;
import java.util.List;

/**
 * 物业常量定义-->对应着字典表里数据
 */
public final class PropertyConstants {

    /**
     * 朝向
     */
    public enum Towards {
        Towards_1("1042001", "东"), //
        Towards_2("1042002", "南"), //
        Towards_3("1042003", "西"), //
        Towards_4("1042004", "北"), //
        Towards_5("1042005", "南北"), //
        Towards_6("1042006", "东西"), //
        Towards_7("1042007", "东南"), //
        Towards_8("1042008", "西南"), //
        Towards_9("1042009", "东北"), //
        Towards_10("1042010", "西北"),;
        public static String PRE_CODE = "1042";
        private String code;
        private String desc;

        Towards(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static Towards codeOf(String code) {
            for (Towards value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static Towards descOf(String desc) {
            for (Towards value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public static boolean isValidDesc(String desc) {
            try {
                descOf(desc);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
    /**
     * 复式类型
     */
    public enum Fushi {
        Fushi_1("1121001", "不是复式"), //
        Fushi_2("1121002", "复式"),//
        ;
        public static String PRE_CODE = "1121";
        private String code;
        private String desc;

        Fushi(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static Fushi codeOf(String code) {
            for (Fushi value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
    /**
     * 房屋性质
     */
    public enum HouseNature {
        HouseNature_1("1105001", "民用"), //
        HouseNature_2("1105002", "商品房"), //
        HouseNature_3("1105003", "回迁房"), //
        HouseNature_4("1105004", "毛坯"), //
        HouseNature_5("1043005", "商住两用"),//
        ;
        public static String PRE_CODE = "1105";
        private String code;
        private String desc;

        HouseNature(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static HouseNature codeOf(String code) {
            for (HouseNature value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static HouseNature descOf(String desc) {
            for (HouseNature value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public static boolean isValidDesc(String desc) {
            try {
                descOf(desc);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
    /**
     * 装修类型
     */
    public enum DecoratoeType {
        DECORATOE_TYPE_1("1043001", "中等装修"), //
        DECORATOE_TYPE_2("1043002", "精装修"), //
        DECORATOE_TYPE_3("1043003", "豪华装修"), //
        DECORATOE_TYPE_4("1043004", "毛坯"), //
        DECORATOE_TYPE_5("1043005", "简单装修"),//
        ;
        public static String PRE_CODE = "1043";
        private String code;
        private String desc;

        DecoratoeType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static DecoratoeType codeOf(String code) {
            for (DecoratoeType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static DecoratoeType descOf(String desc) {
            for (DecoratoeType value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public static boolean isValidDesc(String desc) {
            try {
                descOf(desc);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
    /**
     * 物业类型
     */
    public enum PropertyType {
        PropertyType_1("1051001", "集中"), //
        PropertyType_2("1051002", "分散"),//
        ;
        public static String PRE_CODE = "1051";
        private String code;
        private String desc;

        PropertyType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static PropertyType codeOf(String code) {
            for (PropertyType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 楼幢类型
     */
    public enum BuildingNoType {
        BUILDING_TYPE_1("1119001", "号楼"), //
        BUILDING_TYPE_2("1119002", "幢"), //
        BUILDING_TYPE_3("1119003", "栋"), //
        BUILDING_TYPE_4("1119004", "座"),//
        ;
        public static String PRE_CODE = "1119";
        private String code;
        private String desc;

        BuildingNoType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static BuildingNoType codeOf(String code) {
            for (BuildingNoType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
        public static boolean isValidDesc(String desc) {
            try {
                descOf(desc);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        public static BuildingNoType descOf(String desc) {
            for (BuildingNoType value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }


        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
    /**
     * 小区状态
     */
    public enum CommunityStatus {
        COMMUNITY_STATUS1("1089001", "待提交"), //
        COMMUNITY_STATUS2("1089002", "待审核"), //
        COMMUNITY_STATUS3("1089003", "审核通过"), //
        COMMUNITY_STATUS4("1089004", "驳回"), //
        COMMUNITY_STATUS5("1089005", "停用")//
        ;
        public static String PRE_CODE = "1089";
        private String code;
        private String desc;

        CommunityStatus(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static CommunityStatus codeOf(String code) {
            for (CommunityStatus value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 生活付费公司
     */
    public enum LifePayCompanyType {
        //        WATER_FEE("1114001", "水费付费公司"), //
        //        ELECTRIC_FEE("1114002", "电费付费公司"), //
        //        GAS_FEE("1114003", "燃气费付费公司"), //
        //        PROPERTY_MGMT_FEE("1114004", "物业费付费公司"),//
        //        ;
        WATER_FEE(PayingConfigConstants.PayingItem.WATER_FEE.code(), "水费付费公司"), //
        ELECTRIC_FEE(PayingConfigConstants.PayingItem.ELECTRIC_FEE.code(), "电费付费公司"), //
        GAS_FEE(PayingConfigConstants.PayingItem.GAS_FEE.code(), "燃气费付费公司"), //
        PROPERTY_MGMT_FEE(PayingConfigConstants.PayingItem.PROPERTY_MGMT_FEE.code(), "物业费付费公司"),//
        ;
        public static String PRE_CODE = "1114";
        private String code;
        private String desc;

        LifePayCompanyType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static LifePayCompanyType codeOf(String code) {
            for (LifePayCompanyType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 银行类型
     */
    public enum BankType {
        BankType_1117001("1117001", "中国工商银行"), //
        BankType_1117002("1117002", "中国建设银行"), //
        BankType_1117003("1117003", "中国银行"), //
        BankType_1117004("1117004", "交通银行"), //
        BankType_1117005("1117005", "中国农业银行"), //
        BankType_1117006("1117006", "招商银行"), //
        BankType_1117007("1117007", "中国邮政储蓄银行"), //
        BankType_1117008("1117008", "中国光大银行"), //
        BankType_1117009("1117009", "中国民生银行"), //
        BankType_1117010("1117010", "平安银行"), //
        BankType_1117011("1117011", "浦发银行"), //
        BankType_1117012("1117012", "中信银行"), //
        BankType_1117013("1117013", "兴业银行"), //
        BankType_1117014("1117014", "华夏银行"), //
        BankType_1117015("1117015", "广发银行"); //

        public static String PRE_CODE = "1117";
        private String code;
        private String desc;

        BankType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static BankType codeOf(String code) {
            for (BankType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static BankType descOf(String desc) {
            for (BankType value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 证件类型
     */
    public enum PapersType {
        PapersType1134001("1024001", "身份证"), //
        PapersType1134002("1024002", "护照"), //
        PapersType1134003("1024003", "港澳通行证"), //
        PapersType1134004("1024004", "军官证"), //
        PapersType1134005("1024005", "学生证"), //
        PapersType1134006("1024006", "台湾通行证"); //

        public static String PRE_CODE = "1024";
        private String code;
        private String desc;

        PapersType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static PapersType codeOf(String code) {
            for (PapersType value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static PapersType descOf(String desc) {
            for (PapersType value : values()) {
                if (value.desc.equals(desc)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid desc = " + desc);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 物业审批原因
     */
    public enum PropertyReason {
        PROPERTY_ERROR("1134001", "物业错误"), //
        PROPRIETOR_ERROR("1134002", "业主错误"), //
        ACCOUNT_ERROR("1134005", "账户错误"), //
        CONTRACT_DATE_ERROR("1134006", "合约日期错误"), //
        CONTRACT_MONEY_ERROR("1134007", "合约金额错误"), //
        CONTRACT_PAYPLAN_ERROR("1134008", "收付款计划错误"), //
        OTHER("1134099", "其他");

        public static String PRE_CODE = "1134";
        private String code;
        private String desc;

        PropertyReason(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static PropertyReason codeOf(String code) {
            for (PropertyReason value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getDesc() {
            return desc;
        }

        public String getCode() {
            return code;
        }
    }

    /**
     * 性别
     */
    public enum Sex {
        MALE("1048001", "先生"), FEMALE("1048002", "女士");

        public static String PRECODE_SEX = "1048";

        private String code;
        private String desc;

        Sex(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static Sex codeOf(String code) {
            for (Sex value : values()) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("invalid code = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public String getDesc() {
            return desc;
        }

        public String getCode() {
            return code;
        }
    }

    /**
     * 物业状态
     */
    public enum PropertyStatus {
        TYPEIN_PROPRIETOR("1120001", "待录入业主", "录入业主", true), //
        NEED_SIGN("1120002", "待签约", "录入合同", true), //
        NEED_DELIVERTY("1120003", "待交割", "录入交割", true), //
        COMMUNITY_EXAM("1120004", "小区审核中", "编辑物业", true), //
        COMMUNITY_REJECT("1120005", "小区审核驳回", "编辑小区", true), //
        EXAM("1120006", "财务审核中", "撤回审核", false), //
        EXAM_BACK("1120007", "审核撤回", "编辑物业", true), //
        EXAM_REJECT("1120008", "财务审核驳回", "编辑物业", true), //
        EXAM_YES("1120009", "履约中", null, false), //
        CONTRACT_FREEZE("1120010", "合约冻结", null, false), //
        CONTRACT_CANCEL("1120011", "合约废止", "编辑合同", true), //
        CONTRACT_EXPIRE("1120012", "合约到期", "录入新合同", true);//

        public static String PRECODE_PROPERTY_STATUS = "1120";

        private String code;
        private String desc;
        private String operation;
        private boolean edit;

        PropertyStatus(String code, String desc, String operation, boolean edit) {
            this.code = code;
            this.desc = desc;
            this.operation = operation;
            this.edit = edit;
        }

        public static String[] operationList() {
            List<String> operList = new ArrayList<>();
            for (PropertyStatus status : values()) {
                String operation = status.getOperation();
                if (operation != null) operList.add(operation);
            }
            return operList.toArray(new String[operList.size()]);
        }

        public static PropertyStatus codeOf(String code) {
            for (PropertyStatus status : values()) {
                if (status.code.equals(code)) {
                    return status;
                }
            }
            throw new IllegalArgumentException("无效的CODE = " + code);
        }

        public static boolean isValid(String code) {
            try {
                codeOf(code);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        /**
         * 获取编码对应的描述
         * @param code
         * @return
         */
        public static String desc(String code) {
            if (code == null || "".equals(code)) return "";
            for (PropertyStatus ps : PropertyStatus.values()) {
                if (ps.getCode().equals(code)) {
                    return ps.getDesc();
                }
            }
            return "";
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        public String getOperation() {
            return operation;
        }

        public boolean isEdit() {
            return edit;
        }
    }

}

