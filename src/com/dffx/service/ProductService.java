package com.dffx.service;

import com.dffx.businessentry.Product;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface ProductService {

	//增加实体
	public long addEntity(Product dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Product dto) throws Exception;

	//查询实体
	public Product findEntity(Product dto) throws Exception;

	//查询实体List
	public List<Product> findEntityList(PageModel<Product> dto) throws Exception;

}
