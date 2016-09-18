package com.dffx.businessentry.dto;

import java.util.Date;

public class Total {

	private String totalDes;	
	private Integer totalFree;
	private Date totalUpdateTime;
	private String userNickname;
	
	public String getTotalDes() {
		return totalDes;
	}
	public void setTotalDes(String totalDes) {
		this.totalDes = totalDes;
	}
	public Integer getTotalFree() {
		return totalFree;
	}
	public void setTotalFree(Integer totalFree) {
		this.totalFree = totalFree;
	}
	public Date getTotalUpdateTime() {
		return totalUpdateTime;
	}
	public void setTotalUpdateTime(Date totalUpdateTime) {
		this.totalUpdateTime = totalUpdateTime;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	
	
}
