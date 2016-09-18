package com.dffx.service;

import com.dffx.businessentry.Meritetext;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface MeritetextService {

	//增加实体
	public long addEntity(Meritetext dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Meritetext dto) throws Exception;

	//查询实体
	public Meritetext findEntity(Meritetext dto) throws Exception;

	//查询实体List
	public List<Meritetext> findEntityList(PageModel<Meritetext> dto) throws Exception;
	
	/**
	 * 获取文本
	 * @return
	 * @throws Exception
	 */
	public String getTextContent() throws Exception;

}
