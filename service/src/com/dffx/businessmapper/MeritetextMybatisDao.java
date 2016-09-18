package com.dffx.businessmapper;

import com.dffx.businessentry.Meritetext;
import java.util.List;
import com.dffx.pager.PageModel;

public interface MeritetextMybatisDao extends SqlMapper{

	public long addEntity(Meritetext dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Meritetext dto);

	public Meritetext findEntity(Meritetext dto);

	public List<Meritetext> findEntityList(PageModel<Meritetext> dto);
	
	/**
	 * 获取文本
	 * @return
	 * @throws Exception
	 */
	public String getTextContent() throws Exception;

}
