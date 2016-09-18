package com.dffx.service.impl;

import com.dffx.businessentry.Freelog;
import com.dffx.businessmapper.FreelogMybatisDao;
import com.dffx.service.FreelogService;
import com.dffx.webservice.bean.response.FreeLogResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("freelogService")
public class FreelogServiceImpl implements FreelogService {

	private Logger log = Logger.getLogger(FreelogServiceImpl.class);
	@Autowired
	private FreelogMybatisDao freelogMybatisDao;
	@Override
	public long addEntity(Freelog dto) throws Exception {
		try {
			log.info("addEntity");
			freelogMybatisDao.addEntity(dto);
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
			freelogMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Freelog dto) throws Exception {
		try {
			log.info("updateEntity");
			freelogMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Freelog findEntity(Freelog dto) throws Exception {
		try {
			log.info("findEntity");
			return freelogMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<FreeLogResponse> findEntityList(PageModel<Freelog> dto) throws Exception {
		try {
			log.info("findEntityList");
			return freelogMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
