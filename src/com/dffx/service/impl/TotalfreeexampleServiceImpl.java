package com.dffx.service.impl;

import com.dffx.businessentry.Totalfreeexample;
import com.dffx.businessmapper.TotalfreeexampleMybatisDao;
import com.dffx.service.TotalfreeexampleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("totalfreeexampleService")
public class TotalfreeexampleServiceImpl implements TotalfreeexampleService {

	private Logger log = Logger.getLogger(TotalfreeexampleServiceImpl.class);
	@Autowired
	private TotalfreeexampleMybatisDao totalfreeexampleMybatisDao;
	@Override
	public long addEntity(Totalfreeexample dto) throws Exception {
		try {
			log.info("addEntity");
			totalfreeexampleMybatisDao.addEntity(dto);
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
			totalfreeexampleMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Totalfreeexample dto) throws Exception {
		try {
			log.info("updateEntity");
			totalfreeexampleMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Totalfreeexample findEntity(Totalfreeexample dto) throws Exception {
		try {
			log.info("findEntity");
			return totalfreeexampleMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Totalfreeexample> findEntityList(PageModel<Totalfreeexample> dto) throws Exception {
		try {
			log.info("findEntityList");
			return totalfreeexampleMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
