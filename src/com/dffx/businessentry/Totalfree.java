package com.dffx.businessentry;

import java.util.Date;

public class Totalfree{
	private Integer id;	//
	private Integer totalUid;	//用户id
	private Integer totalFree;	//一共放生数量
	private String totalDes;	//显示"功德无量"等字样,
	private Date totalUpdateTime;	//


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalUid() {
		return totalUid;
	}

	public void setTotalUid(Integer totalUid) {
		this.totalUid = totalUid;
	}

	public Integer getTotalFree() {
		return totalFree;
	}

	public void setTotalFree(Integer totalFree) {
		this.totalFree = totalFree;
	}

	public String getTotalDes() {
		return totalDes;
	}

	public void setTotalDes(String totalDes) {
		this.totalDes = totalDes;
	}

	public Date getTotalUpdateTime() {
		return totalUpdateTime;
	}

	public void setTotalUpdateTime(Date totalUpdateTime) {
		this.totalUpdateTime = totalUpdateTime;
	}

}