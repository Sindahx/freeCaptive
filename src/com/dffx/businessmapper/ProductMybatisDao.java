package com.dffx.businessmapper;

import com.dffx.businessentry.Product;
import java.util.List;
import com.dffx.pager.PageModel;

public interface ProductMybatisDao extends SqlMapper{

	public long addEntity(Product dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Product dto);

	public Product findEntity(Product dto);

	public List<Product> findEntityList(PageModel<Product> dto);

}
