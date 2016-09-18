package com.dffx.businessmapper;

import com.dffx.businessentry.Advertisement;
import java.util.List;
import com.dffx.pager.PageModel;

public interface AdvertisementMybatisDao extends SqlMapper{

	public long addEntity(Advertisement dto);

	public boolean deleteEntity(long id);

	public long updateEntity(Advertisement dto);

	public Advertisement findEntity(Advertisement dto);

	public List<Advertisement> findEntityList(PageModel<Advertisement> dto);

}
