package com.ipower365.saas.basic.constants;

public enum ApprovelFlowStatus {
	
//	old:－1:结算单生成；0：结算单已放款 1-结算单拒绝 99-已关闭 3-审批通过 4-待放款 5-放款拒绝
	Create(-1,"已保存"),Submit(0,"待审批"),CheckPass(1,"审批通过"),CheckRefused(2,"审批拒绝"),
	WaitLoan(3,"待放款"),Loaned(4,"已放款"),LoanRefused(5,"放款拒绝"),
	
	Closed(99,"已关闭")
	;
	
	
	private Integer code;
	private String name;
	
	private ApprovelFlowStatus(Integer code,String name){
		this.code=code;
		this.name=name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ApprovelFlowStatus getApprovalStatus(Integer code) {
        if (null == code) return null;
        for (ApprovelFlowStatus c : ApprovelFlowStatus.values()) {
            if (c.code.intValue() == code.intValue()) return c;
        }
//        return null;
        throw new IllegalArgumentException("没找到匹配的状态：" + code);
    }

}
