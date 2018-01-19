package com.ipower365.saas.basic.exception;

/**
 * 异常号码的划分如下： 20000-24999 财务 25000-25999 计量 26000-26999 计费 27000-27999 空间
 * 30000-39999 持久层 31000-31999 系统 32000-32999 基础数据 33000-33999 会员 34000-34999 出房
 * 35000-35999 合同 36000-36999 客房 37000-37999 房源 38000-38999 收房 39000-39999 服务
 * 40000-40999 机构 41000-41999 营销 42000-42999 消息 43000-43999 sso 44000-44999 产品
 * 45000-45999 设备对接 46000-46999 支付调度 47000-47999 客户关系管理 48000-48999 支付平台
 * 49000-49999 能耗报表 50000-50999 统计分析 51000-51999 jpush 52000-52999 工作流
 * 53000-53999 openapi 54000-54999 共享资源 55000-55999 电费运营 56000-56999 和boss交互
 * 57000-57999 订单 58000-58999 账务 59000-59999 支付 60000-69999 余额 70000-79999 账本
 * 71000-71999 充值 72000-72999 提现 73000-73999 广告 
 * 80000-84999 资产运营 85000-85999 账单 86000-86999 第三方
 * 87000-87999 新组织机构 88000-88999 房态
 * @author anker.du
 * @date 2015年9月25日 上午11:04:23
 */
public class BasicException extends RuntimeException {
    private int reason = 0;
    private String[] params = null;

    /**
	 * 
	 */
    private static final long serialVersionUID = -3643557830604406276L;

    public BasicException() {
        super();
    }

    public BasicException(int reason, Throwable cause) {
        super(cause);
        this.reason = reason;
    }

    public BasicException(int reason) {
        this.reason = reason;
    }

    public BasicException(int reason, String[] params, Throwable cause) {
        super(cause);
        this.reason = reason;
        this.params = params;
    }

    public BasicException(int reason, String[] params) {
        this.reason = reason;
        this.params = params;
    }

    public BasicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasicException(String message) {
        super(message);
    }

    public BasicException(Throwable cause) {
        super(cause);
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    public String[] getParams() {
        return params;
    }

    public String getMessage() {
        return String.valueOf(reason);
    }

}
