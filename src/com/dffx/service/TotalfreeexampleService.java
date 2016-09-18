package com.dffx.service;

import com.dffx.businessentry.Totalfreeexample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface TotalfreeexampleService {

	//增加实体
	public long addEntity(Totalfreeexample dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Totalfreeexample dto) throws Exception;

	//查询实体
	public Totalfreeexample findEntity(Totalfreeexample dto) throws Exception;

	//查询实体List
	public List<Totalfreeexample> findEntityList(PageModel<Totalfreeexample> dto) throws Exception;

}
