package com.dffx.service;

import com.dffx.businessentry.Account;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dffx.pager.PageModel;
public interface AccountService {

	//增加实体
	public long addEntity(Account dto) throws Exception;

	//删除实体
	public boolean deleteEntity(@Param("id") long id) throws Exception;

	//修改实体
	public long updateEntity(Account dto) throws Exception;

	//查询实体
	public Account findEntity(Account dto) throws Exception;

	//查询实体List
	public List<Account> findEntityList(PageModel<Account> dto) throws Exception;
	
	/**
	 * 查找用户昵称
	 * @param userUid
	 * @return
	 * @throws Exception
	 */
	public Account findNickName(Integer userUid)throws Exception;

}
