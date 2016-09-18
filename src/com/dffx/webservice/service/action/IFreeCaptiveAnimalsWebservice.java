package com.dffx.webservice.service.action;

import javax.jws.WebService;

@WebService
public interface IFreeCaptiveAnimalsWebservice {

	/**
	 * 获取所有放生产品
	 * @param requestCode
	 * @return
	 */
	public String getAllProduct(String requestCode);
	
	/**
	 * 放生
	 * @param requestCode
	 * @return
	 */
	public String freeCaptiave(String requestCode);
	
	/**
	 * 获取所有人的放生记录
	 * @param requestCOde
	 * @return
	 */
	public String totalFree(String requestCOde);
	
	/**
	 * 获取本人的放生次数和详情
	 * @param requestCode
	 * @return
	 */
	public String freeDes(String requestCode);
	
	/**
	 * 获取功德文本
	 * @param requestCode
	 * @return
	 */
	public String getMeritetext(String requestCode);
	
}
