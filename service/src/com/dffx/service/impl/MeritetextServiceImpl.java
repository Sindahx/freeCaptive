package com.dffx.service.impl;

import com.dffx.businessentry.Meritetext;
import com.dffx.businessmapper.MeritetextMybatisDao;
import com.dffx.service.MeritetextService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("meritetextService")
public class MeritetextServiceImpl implements MeritetextService {

	private Logger log = Logger.getLogger(MeritetextServiceImpl.class);
	@Autowired
	private MeritetextMybatisDao meritetextMybatisDao;
	@Override
	public long addEntity(Meritetext dto) throws Exception {
		try {
			log.info("addEntity");
			meritetextMybatisDao.addEntity(dto);
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
			meritetextMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Meritetext dto) throws Exception {
		try {
			log.info("updateEntity");
			meritetextMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Meritetext findEntity(Meritetext dto) throws Exception {
		try {
			log.info("findEntity");
			return meritetextMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Meritetext> findEntityList(PageModel<Meritetext> dto) throws Exception {
		try {
			log.info("findEntityList");
			return meritetextMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public String getTextContent() throws Exception {
		// TODO Auto-generated method stub
		try {
			log.info("findEntityList");
			return meritetextMybatisDao.getTextContent();
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
