package com.dffx.service.impl;

import com.dffx.businessentry.Cashlog;
import com.dffx.businessmapper.CashlogMybatisDao;
import com.dffx.service.CashlogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("cashlogService")
public class CashlogServiceImpl implements CashlogService {

	private Logger log = Logger.getLogger(CashlogServiceImpl.class);
	@Autowired
	private CashlogMybatisDao cashlogMybatisDao;
	@Override
	public long addEntity(Cashlog dto) throws Exception {
		try {
			log.info("addEntity");
			cashlogMybatisDao.addEntity(dto);
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
			cashlogMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Cashlog dto) throws Exception {
		try {
			log.info("updateEntity");
			cashlogMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Cashlog findEntity(Cashlog dto) throws Exception {
		try {
			log.info("findEntity");
			return cashlogMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Cashlog> findEntityList(PageModel<Cashlog> dto) throws Exception {
		try {
			log.info("findEntityList");
			return cashlogMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
