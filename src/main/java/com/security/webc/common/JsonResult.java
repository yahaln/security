package com.security.webc.common;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * date: 2017年2月21日 下午1:53:37 <br/>
 * 
 * @author yanghualin
 * @version 
 * @since
 */
public class JsonResult implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String msg;
	private Object data;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public JsonResult(int code,String msg,Object data){
		this.code=code;
		this.msg=msg;
		this.data=data;
	}
	public JsonResult(int code,String msg){
		this.code=code;
		this.msg=msg;
		this.data=new Object();
	}
	/**
	 * 
	 * 对象转json串
	 * @author yanghualin
	 * @return
	 * @since
	 */
	public String formatjsonStr()throws JsonProcessingException{
		try{
	        ObjectMapper mapper = new ObjectMapper();  
	        // Convert object to JSON string  
			return mapper.writeValueAsString(this);
		}catch(JsonProcessingException ex){
			throw ex;
		}
	}
}
