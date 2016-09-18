package com.dffx.service;

import com.dffx.businessentry.Advertisement;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface AdvertisementService {

	//增加实体
	public long addEntity(Advertisement dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Advertisement dto) throws Exception;

	//查询实体
	public Advertisement findEntity(Advertisement dto) throws Exception;

	//查询实体List
	public List<Advertisement> findEntityList(PageModel<Advertisement> dto) throws Exception;

}
