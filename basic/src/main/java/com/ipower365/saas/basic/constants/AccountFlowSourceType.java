package com.ipower365.saas.basic.constants;

/**
 * 账务流水来源类型：终端APP、web手工充值或扣费
 * @author Aron
 */
public enum AccountFlowSourceType {
    /**
     * app充值、web充值、app取现、web扣款、账单余额缴费、第三方支付转账缴费、积分缴费、折扣券、抵用券、有价证券
     */
    APPRecharge, WebRecharge, APPEnchashment, WebDeduction, PrepaymentPayment, BankTransferPayment, BonusPointPayment, DiscountPayment, TokenPayment, ValuablePayment;
}
