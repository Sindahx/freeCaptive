package com.dffx.service;

import com.dffx.businessentry.Totalfree;
import com.dffx.businessentry.dto.Total;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface TotalfreeService {

	//增加实体
	public long addEntity(Totalfree dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Totalfree dto) throws Exception;

	//查询实体
	public Totalfree findEntity(Totalfree dto) throws Exception;

	//查询实体List
	public List<Total> findEntityList(PageModel<Total> dto) throws Exception;
	
	/**
	 * 查询个人的放生次数
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public Integer findPersonalTotal(Integer uid) throws Exception;

}
