package com.dffx.service;

import com.dffx.businessentry.Cashlog;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface CashlogService {

	//增加实体
	public long addEntity(Cashlog dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Cashlog dto) throws Exception;

	//查询实体
	public Cashlog findEntity(Cashlog dto) throws Exception;

	//查询实体List
	public List<Cashlog> findEntityList(PageModel<Cashlog> dto) throws Exception;

}
