package com.dffx.service.impl;

import com.dffx.businessentry.Account;
import com.dffx.businessmapper.AccountMybatisDao;
import com.dffx.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dffx.pager.PageModel;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	private Logger log = Logger.getLogger(AccountServiceImpl.class);
	@Autowired
	private AccountMybatisDao accountMybatisDao;
	@Override
	public long addEntity(Account dto) throws Exception {
		try {
			log.info("addEntity");
			accountMybatisDao.addEntity(dto);
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
			accountMybatisDao.deleteEntity(id);
			return false;
		} catch(Exception e) {
			log.info("deleteEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public long updateEntity(Account dto) throws Exception {
		try {
			log.info("updateEntity");
			accountMybatisDao.updateEntity(dto);
			return 0;
		} catch(Exception e) {
			log.info("updateEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Account findEntity(Account dto) throws Exception {
		try {
			log.info("findEntity");
			return accountMybatisDao.findEntity(dto);
		} catch(Exception e) {
			log.info("findEntity异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public List<Account> findEntityList(PageModel<Account> dto) throws Exception {
		try {
			log.info("findEntityList");
			return accountMybatisDao.findEntityList(dto);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public Account findNickName(Integer userUid) throws Exception {
		// TODO Auto-generated method stub
		try {
			log.info("findEntityList");
			return accountMybatisDao.findNickName(userUid);
		} catch(Exception e) {
			log.info("findEntityList异常");
			e.printStackTrace();
			throw e;
		}
	}
}
