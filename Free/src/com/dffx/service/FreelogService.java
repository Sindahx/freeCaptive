package com.dffx.service;

import com.dffx.businessentry.Freelog;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
import com.dffx.webservice.bean.response.FreeLogResponse;
public interface FreelogService {

	//增加实体
	public long addEntity(Freelog dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Freelog dto) throws Exception;

	//查询实体
	public Freelog findEntity(Freelog dto) throws Exception;

	//查询实体List
	public List<FreeLogResponse> findEntityList(PageModel<Freelog> dto) throws Exception;

}
