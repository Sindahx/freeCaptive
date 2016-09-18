package com.dffx.webservice.bean.response;

import java.util.Date;


public class FreeLogResponse {

	private String nickName;
	private String productName;
	private Date freeTime;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getFreeTime() {
		return freeTime;
	}
	public void setFreeTime(Date freeTime) {
		this.freeTime = freeTime;
	}
	
	
}
