package com.dffx.service.impl;

import com.dffx.businessentry.Totalfree;
import com.dffx.businessentry.dto.Total;
import com.dffx.businessmapper.TotalfreeMybatisDao;
import com.dffx.businessmapper.TotalfreeexampleMybatisDao;
import com.dffx.service.TotalfreeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("totalfreeService")
public class TotalfreeServiceImpl implements TotalfreeService {

	private Logger log = Logger.getLogger(TotalfreeServiceImpl.class);
	@Autowired
	private TotalfreeMybatisDao totalfreeMybatisDao;
	@Autowired
	private TotalfreeexampleMybatisDao totalfreeexampleMybatisDao;
	
	@Override
	public long addEntity(Totalfree dto) throws Exception {
		try {
			log.info("addEntity");
			totalfreeMybatisDao.addEntity(dto);
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
			totalfreeMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Totalfree dto) throws Exception {
		try {
			log.info("updateEntity");
			totalfreeMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Totalfree findEntity(Totalfree dto) throws Exception {
		try {
			log.info("findEntity");
			return totalfreeMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Total> findEntityList(PageModel<Total> dto) throws Exception {
		try {
			log.info("findEntityList");
			List<Total> list1 = totalfreeMybatisDao.findEntityList(dto);
			List<Total> list2 = totalfreeexampleMybatisDao.findEntityListOutside(dto);
			list1.addAll(list2);
			
			 Collections.sort(list1, new Comparator<Total>() {
		            public int compare(Total arg0, Total arg1) {
		                return arg1.getTotalFree().compareTo(arg0.getTotalFree());
		            }
		        });
		    
			
			return list1;
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Integer findPersonalTotal(Integer uid) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			log.info("findEntityList");
			return totalfreeMybatisDao.findPersonalTotal(uid);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
		
	}
}
