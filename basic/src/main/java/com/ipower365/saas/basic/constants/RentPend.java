package com.ipower365.saas.basic.constants;

/**
 * @Project: basic
 * @Package: com.ipower365.saas.basic.constants
 * @ClassName: RentPend
 * @author: xushengpeng
 * @time: 2017年7月10日
 * @类说明: 待付状态
 */
public interface RentPend {
	/**
	 * 不需要待付
	 */
    public final static Integer RENT_UNPEND = 0;
    
    /**
     * 欠费需要待付
     */
    public final static Integer RENT_PEND = 1;
}
