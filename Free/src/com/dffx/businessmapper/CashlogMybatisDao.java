package com.dffx.businessmapper;

import com.dffx.businessentry.Cashlog;
import java.util.List;
import com.dffx.pager.PageModel;

public interface CashlogMybatisDao extends SqlMapper{

	public long addEntity(Cashlog dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Cashlog dto);

	public Cashlog findEntity(Cashlog dto);

	public List<Cashlog> findEntityList(PageModel<Cashlog> dto);

}
