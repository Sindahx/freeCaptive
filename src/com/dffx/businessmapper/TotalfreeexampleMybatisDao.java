package com.dffx.businessmapper;

import com.dffx.businessentry.Totalfreeexample;
import com.dffx.businessentry.dto.Total;

import java.util.List;
import com.dffx.pager.PageModel;

public interface TotalfreeexampleMybatisDao extends SqlMapper{

	public long addEntity(Totalfreeexample dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Totalfreeexample dto);

	public Totalfreeexample findEntity(Totalfreeexample dto);

	public List<Totalfreeexample> findEntityList(PageModel<Totalfreeexample> dto);
	
	public List<Total> findEntityListOutside(PageModel<Total> dto);

}
