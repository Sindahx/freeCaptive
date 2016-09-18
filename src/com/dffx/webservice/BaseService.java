package com.dffx.webservice;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class BaseService{
   
	private static Logger log = Logger.getLogger(BaseService.class);
	
	public static final String DATE_FORMAT_FREE                 = "yyyy-MM-dd HH:mm:ss";
	
	 /**
     * 得到几个小时后的时间
     * 
     * @param num
     * @return
     */
    public Date getEndTime(Date date, int num)
    {
        long time = date.getTime() + (1000L * 60 * 60 * num);
        if (time > 0)
        {
            date.setTime(time);
        }
        return date;
    }
    
    /**
	* 字符串转换成日期
	* @param str
	* @return date
	*/
	public Date StrToDate(String str,String str2) {
	  
	   SimpleDateFormat format = new SimpleDateFormat(str2);
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
		   log.error(e.getMessage()+":时间格式装换异常");
	   }
	   return date;
	}
    
    /***
     * 类型装换发送接口
     * @param obj
     * @return
     */
    public String sendValueAsString(Object obj,String message){
    	String json = null;
    	ObjectMapper mapper = new ObjectMapper();
    	
    	 try {
    		 json = mapper.writeValueAsString(obj);
    		 if(json != null){
    			 json = json.replaceAll("null", "\"\"");
    		 }
//    		 System.err.println(json);
		} catch (JsonGenerationException e) {
			log.error(e.getMessage()+":"+message+":发送bean转换json格式异常");
		} catch (JsonMappingException e) {
			log.error(e.getMessage()+":"+message+":发送bean转换json格式映射bean异常");
		} catch (IOException e) {
			log.error(e.getMessage()+":"+message+":发送bean转换json流异常");
		}
    	 
    	 return json;
    }
    
    /***
     * 类型转换接口接收
     * @param requestCode
     * @param cla
     * @param message
     * @return
     */
    @SuppressWarnings("unchecked")
	public Object getJsonByClass(String requestCode,Class obj,String message) throws Exception{
    	
    	Object clazz = null;
    	ObjectMapper mapper = new ObjectMapper();
    	
//    	 try {
    		 clazz =  mapper.readValue(requestCode,obj);
//		} catch (JsonParseException e) {
//			log.error(e.getMessage()+":"+message+":接收json转换bean格式异常");
//			return null;
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			log.error(e.getMessage()+":"+message+":接收json转换bean格式映射bean异常");
//			return null;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			log.error(e.getMessage()+":"+message+":接收json转换bean格式流异常");
//			return null;
//		}
    	
    	return clazz;
    }
    
}
