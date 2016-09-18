package com.dffx.service.impl;

import com.dffx.businessentry.Advertisement;
import com.dffx.businessmapper.AdvertisementMybatisDao;
import com.dffx.service.AdvertisementService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("advertisementService")
public class AdvertisementServiceImpl implements AdvertisementService {

	private Logger log = Logger.getLogger(AdvertisementServiceImpl.class);
	@Autowired
	private AdvertisementMybatisDao advertisementMybatisDao;
	@Override
	public long addEntity(Advertisement dto) throws Exception {
		try {
			log.info("addEntity");
			advertisementMybatisDao.addEntity(dto);
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
			advertisementMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Advertisement dto) throws Exception {
		try {
			log.info("updateEntity");
			advertisementMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Advertisement findEntity(Advertisement dto) throws Exception {
		try {
			log.info("findEntity");
			return advertisementMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Advertisement> findEntityList(PageModel<Advertisement> dto) throws Exception {
		try {
			log.info("findEntityList");
			return advertisementMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
