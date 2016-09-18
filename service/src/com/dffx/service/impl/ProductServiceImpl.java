package com.dffx.service.impl;

import com.dffx.businessentry.Product;
import com.dffx.businessmapper.ProductMybatisDao;
import com.dffx.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private Logger log = Logger.getLogger(ProductServiceImpl.class);
	@Autowired
	private ProductMybatisDao productMybatisDao;
	@Override
	public long addEntity(Product dto) throws Exception {
		try {
			log.info("addEntity");
			productMybatisDao.addEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("addEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public boolean deleteEntity(long id) throws Exception {
		try {
			log.info("deleteEntity");
			productMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Product dto) throws Exception {
		try {
			log.info("updateEntity");
			productMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Product findEntity(Product dto) throws Exception {
		try {
			log.info("findEntity");
			return productMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Product> findEntityList(PageModel<Product> dto) throws Exception {
		try {
			log.info("findEntityList");
			return productMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
