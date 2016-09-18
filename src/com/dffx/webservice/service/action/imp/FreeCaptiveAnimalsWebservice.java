package com.dffx.webservice.service.action.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dffx.businessentry.Account;
import com.dffx.businessentry.Advertisement;
import com.dffx.businessentry.Freelog;
import com.dffx.businessentry.Product;
import com.dffx.businessentry.Totalfree;
import com.dffx.businessentry.dto.Total;
import com.dffx.pager.PageModel;
import com.dffx.service.AccountService;
import com.dffx.service.AdvertisementService;
import com.dffx.service.FreelogService;
import com.dffx.service.MeritetextService;
import com.dffx.service.ProductService;
import com.dffx.service.TotalfreeService;
import com.dffx.webservice.BaseService;
import com.dffx.webservice.bean.WebBaseRespose;
import com.dffx.webservice.bean.request.FreeDesRequest;
import com.dffx.webservice.bean.request.TotalFreeRequest;
import com.dffx.webservice.bean.response.FreeLogResponse;
import com.dffx.webservice.service.action.IFreeCaptiveAnimalsWebservice;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

@Component
@WebService(serviceName = "freeCaptiveAnimalsWebservice", endpointInterface = "com.dffx.webservice.service.action.IFreeCaptiveAnimalsWebservice")
public class FreeCaptiveAnimalsWebservice extends BaseService implements IFreeCaptiveAnimalsWebservice {

	private static Logger log = Logger.getLogger(FreeCaptiveAnimalsWebservice.class);
	
	@Autowired
	private ProductService productService;
	@Autowired
	private TotalfreeService totalFreeService;
	@Autowired
	private AdvertisementService advertisementService;
	@Autowired
	private FreelogService freelogService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private MeritetextService textService;
	
	@Override
	public String freeCaptiave(String requestCode) {
		// TODO Auto-generated method stub
		
//		try {
//			Object clazz = super.getJsonByClass(requestCode, UploadRequest.class, ConstansCN.DFFX_UPLOADFILE); // 接收数据
//			// 检查数据
//			uploadReq = (UploadRequest) clazz;
//		} catch (Exception e) {
//			log.error(e.toString());
//			uploadRes.setErrorMessage(ConstansCN.DFFX_PARAM_ERROR);
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);
//			return super.sendValueAsString(uploadRes, ConstansCN.DFFX_UPLOADFILE);
//		}
		
		
		
		return null;
	}

	@Override
	public String getAllProduct(String requestCode) {
		// TODO Auto-generated method stub
		Map<Object, Object> map = new HashMap<Object, Object>();
		WebBaseRespose uploadRes = new WebBaseRespose();

		PageModel<Product> page = new PageModel<Product>();
		List<Product> product = null;
		try {
			product = productService.findEntityList(page);
			map.put("product", product);
			
			uploadRes.setResultCode(map);
			uploadRes.setAsk(WebConstansCode.SOAP_OK);
			uploadRes.setErrorCode(10000);
			uploadRes.setErrorMessage("成功");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.sendValueAsString(uploadRes, "获取放生产品");
	}

	@Override
	public String freeDes(String requestCode) {
		// TODO Auto-generated method stub
		FreeDesRequest freeDesRes = new FreeDesRequest();
		Map<Object, Object> map = new HashMap<Object, Object>();
		WebBaseRespose totalFree = new WebBaseRespose();
		
		try {
			Object clazz = super.getJsonByClass(requestCode, FreeDesRequest.class, ConstansCN.DFFX_UPLOADFILE); // 接收数据
			// 检查数据
			freeDesRes = (FreeDesRequest) clazz;
		} catch (Exception e) {
			log.error(e.toString());
			totalFree.setErrorMessage(ConstansCN.DFFX_PARAM_ERROR);
			totalFree.setAsk(WebConstansCode.SOAP_ERR);
			totalFree.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);
			return super.sendValueAsString(totalFree, ConstansCN.DFFX_UPLOADFILE);
		}
		
		PageModel<Freelog> page = new PageModel<Freelog>();
		Freelog log = new Freelog();
		log.setLogUid(freeDesRes.getUserUid());
		page.setCondition(log);
		
		List<FreeLogResponse> list = null;
		try {
			list = freelogService.findEntityList(page);
			
			map.put("freelog", list);
			
			Integer personalCount = totalFreeService.findPersonalTotal(freeDesRes.getUserUid());
			map.put("personalCount", personalCount);
			
			Account account = accountService.findNickName(freeDesRes.getUserUid());
			map.put("nickName", account.getUserNickname());
			
			totalFree.setResultCode(map);
			totalFree.setAsk(WebConstansCode.SOAP_OK);
			totalFree.setErrorCode(10000);
			totalFree.setErrorMessage("成功");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return super.sendValueAsString(totalFree, "获取个人放生详情");
	}

	@Override
	public String totalFree(String requestCode) {
		// TODO Auto-generated method stub
		TotalFreeRequest totalFreeRes = new TotalFreeRequest();
		Map<Object, Object> map = new HashMap<Object, Object>();
		WebBaseRespose totalFree = new WebBaseRespose();
		
		try {
			Object clazz = super.getJsonByClass(requestCode, TotalFreeRequest.class, ConstansCN.DFFX_UPLOADFILE); // 接收数据
			// 检查数据
			totalFreeRes = (TotalFreeRequest) clazz;
		} catch (Exception e) {
			log.error(e.toString());
			totalFree.setErrorMessage(ConstansCN.DFFX_PARAM_ERROR);
			totalFree.setAsk(WebConstansCode.SOAP_ERR);
			totalFree.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);
			return super.sendValueAsString(totalFree, ConstansCN.DFFX_UPLOADFILE);
		}
		PageModel<Total> page = new PageModel<Total>();
		List<Total> list = null;
		Advertisement adv = null;
		try {
			list = totalFreeService.findEntityList(page);
			map.put("total", list);
			
			Integer personalCount = totalFreeService.findPersonalTotal(totalFreeRes.getUserUid());
			map.put("personalCount", personalCount);
			
			adv = advertisementService.findEntity(null);
			map.put("adv", adv.getContent());
			
			totalFree.setResultCode(map);
			totalFree.setAsk(WebConstansCode.SOAP_OK);
			totalFree.setErrorCode(10000);
			totalFree.setErrorMessage("成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//获取所有人的放生次数,按大到小排列
			//获取当前本人的放生次数
			//获取广告
			
			
			return super.sendValueAsString(totalFree, "获取放生产品");
		}

	@Override
	public String getMeritetext(String requestCode) {
		// TODO Auto-generated method stub
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		WebBaseRespose meritetext = new WebBaseRespose();
		
		try {
			String content = textService.getTextContent();
			
			map.put("text", content);
			
			meritetext.setResultCode(map);
			meritetext.setAsk(WebConstansCode.SOAP_OK);
			meritetext.setErrorCode(10000);
			meritetext.setErrorMessage("成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.sendValueAsString(meritetext, "获取放生文本");
	}

}
