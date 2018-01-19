package com.ipower365.saas.basic.constants;

public enum AppTaskTitle {
	
	TaskOver(TicketConstants.APP_MODEL_TITLE_TASK_OVER,"已结束"), 
	TaskToday(TicketConstants.APP_MODEL_TITLE_TASK_TODAY,"今日任务"),
	TaskForSure(TicketConstants.APP_MODEL_TITLE_TASK_FORSURE,"待确认"),
	Task7Days(TicketConstants.APP_MODEL_TITLE_TASK_7DAYS,"7日内"),
	TaskHistory(TicketConstants.APP_MODEL_TITLE_TASK_HISTORY,"历史任务");
	
	
	private String code;
    private String name;
    
    private AppTaskTitle(String code,String name){
    	this.code=code;
    	this.name=name;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	 public static AppTaskTitle get(String code) {
	        for (AppTaskTitle type : AppTaskTitle.values()) {
	            if (type.code.equals(code)) {
	                return type;
	            }
	        }

	        throw new IllegalArgumentException("无效编码：" + code);
	    }
    

}
