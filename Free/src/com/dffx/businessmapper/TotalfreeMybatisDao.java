package com.dffx.businessmapper;

import com.dffx.businessentry.Totalfree;
import com.dffx.businessentry.dto.Total;

import java.util.List;
import com.dffx.pager.PageModel;

public interface TotalfreeMybatisDao extends SqlMapper{

	public long addEntity(Totalfree dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Totalfree dto);

	public Totalfree findEntity(Totalfree dto);

	public List<Total> findEntityList(PageModel<Total> dto);
	
	/**
	 * 查询个人的放生次数
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public Integer findPersonalTotal(Integer uid) throws Exception;

}
