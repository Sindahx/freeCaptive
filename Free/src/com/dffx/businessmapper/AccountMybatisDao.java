package com.dffx.businessmapper;

import com.dffx.businessentry.Account;
import java.util.List;
import com.dffx.pager.PageModel;

public interface AccountMybatisDao extends SqlMapper{

	public long addEntity(Account dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Account dto);

	public Account findEntity(Account dto);

	public List<Account> findEntityList(PageModel<Account> dto);
	
	/**
	 * 查找用户昵称
	 * @param userUid
	 * @return
	 * @throws Exception
	 */
	public Account findNickName(Integer userUid)throws Exception;

}
