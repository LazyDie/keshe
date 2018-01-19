package com.ipower365.saas.basic.constants;

/**
 * 账单子科目ID
 * @author Aron
 */
public class SubAccountBillID {
    public static final String RoomRent = "10100";

    public static final String RoomEarnestAgainstRent = "10101";// 退还定金抵房租，挂在房租账单下面

//    Against rent deposit
    public static final String RoomDeposit = "10200";

    public static final String WaterFee = "10400";
    public static final String PrivateWaterFee = "10401";
    public static final String PublicWaterFee = "10402";

    public static final String HotWaterFee = "10700";
    public static final String ElectricityFee = "10500";
    public static final String PrivateElectricityFee = "10501";// 私有
    public static final String PublicElectricityFee = "10502";// 公摊
    public static final String ShareElectricityFee = "10503";// 公共插座等
    public static final String GasFee = "10600";

    public static final String ExclusiveLaundryRoom = "10900"; // 洗衣房
    public static final String ExclusiveMeetingRoom = "10901"; // 会议室
    public static final String ExclusiveHall = "10902"; // 大厅
    public static final String ExclusiveLivingRoom = "10903"; // 客厅
    public static final String ExclusiveKitchen = "10904"; // 1级厨房
    public static final String ExclusiveRestRoom = "10905"; // 卫生间
    public static final String ExclusiveKitchen_2Level = "10906"; // 2级厨房
    public static final String ExclusiveKitchen_3Level = "10907"; // 3级厨房
    public static final String ExclusiveKitchen_4Level = "10908"; // 4级厨房
    public static final String Shower = "10909"; // 淋浴
    public static final String Lounge = "10910"; // 活动室

    public static final String PropertyFee = "11500";
    public static final String WifiFee = "11501";

    public static final String RoomEarnest = "11600";

    public static final String RoomServiceFee = "10300";

    public static final String RoomExchange = "11900";
    public static final String RoomRentBreak = "11902";
    public static final String RoomTransfer = "11901";
    // 房间设施损坏赔偿
    public static final String ROOM_ARTICLES_BREAK = "12000";
    public static final String CenterAC = "12100";
    public static final String ErrorCorrection = "12200";
    public static final String Heating = "12300"; // 取暖
    public static final String PreDeposit = "12400"; // 预存款

    /**
     * 根据计量子科目获取对应的公摊子科目
     * @param subject
     * @return
     */
    public static String getPublicSubject(String subBillSubject) {
        if (subBillSubject.equals(SubAccountBillID.ElectricityFee)) {
            return SubAccountBillID.PublicElectricityFee;
        }

        if (subBillSubject.equals(SubAccountBillID.WaterFee)) {
            return SubAccountBillID.PublicWaterFee;
        }

        return subBillSubject;
    }

    /**
     * 根据计量子科目获取对应的私有子科目
     * @param subject
     * @return
     */
    public static String getPrivateSubject(String subBillSubject) {
        if (subBillSubject.equals(SubAccountBillID.ElectricityFee)) {
            return SubAccountBillID.PrivateElectricityFee;
        }

        if (subBillSubject.equals(SubAccountBillID.WaterFee)) {
            return SubAccountBillID.PrivateWaterFee;
        }

        return subBillSubject;
    }

    /**
     * 根据科目获取计量子科目
     * @param billSubject
     * @return
     */
    public static String getMeasurementSubSubject(String billSubject) {
        if (billSubject.equals(AccountBillID.ElectricityFee)) {
            return SubAccountBillID.ElectricityFee;
        }

        if (billSubject.equals(AccountBillID.WaterFee)) {
            return SubAccountBillID.WaterFee;
        }

        if (billSubject.equals(AccountBillID.GasFee)) {
            return SubAccountBillID.WaterFee;
        }

        return billSubject + "00";
    }
}
