package com.dffx.businessmapper;

import com.dffx.businessentry.Freelog;
import java.util.List;
import com.dffx.pager.PageModel;
import com.dffx.webservice.bean.response.FreeLogResponse;

public interface FreelogMybatisDao extends SqlMapper{

	public long addEntity(Freelog dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Freelog dto);

	public Freelog findEntity(Freelog dto);

	public List<FreeLogResponse> findEntityList(PageModel<Freelog> dto);

}
