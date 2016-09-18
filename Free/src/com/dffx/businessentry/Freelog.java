package com.dffx.businessentry;

import java.util.Date;

public class Freelog{
	private Integer id;	//
	private Integer logUid;	//用户id
	private Integer logPid;	//产品id
	private Integer logTotal;	//放生数量
	private Date logFreeTime;	//放生时间


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLogUid() {
		return logUid;
	}

	public void setLogUid(Integer logUid) {
		this.logUid = logUid;
	}

	public Integer getLogPid() {
		return logPid;
	}

	public void setLogPid(Integer logPid) {
		this.logPid = logPid;
	}

	public Integer getLogTotal() {
		return logTotal;
	}

	public void setLogTotal(Integer logTotal) {
		this.logTotal = logTotal;
	}

	public Date getLogFreeTime() {
		return logFreeTime;
	}

	public void setLogFreeTime(Date logFreeTime) {
		this.logFreeTime = logFreeTime;
	}

}