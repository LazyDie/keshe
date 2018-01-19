package com.ipower365.saas.basic.bean;

import java.io.Serializable;

public class ServerToken implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4891378446134817064L;
	private String id;
	private String submitToken;

	public String getSubmitToken() {
		return submitToken;
	}

	public void setSubmitToken(String submitToken) {
		this.submitToken = submitToken;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
