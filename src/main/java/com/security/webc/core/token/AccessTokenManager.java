package com.security.webc.core.token;

import java.util.UUID;

/**
 * 
 * date: 2017年2月21日 下午2:53:30 <br/>
 * 访问令牌管理器
 * @author yanghualin
 * @version 
 * @since
 */
public class AccessTokenManager {
	
	/**
	 * 
	 * 生成一个访问令牌
	 * @author yanghualin
	 * @return
	 * @since
	 */
	public static String releaseAccessToken(){
		return UUID.randomUUID().toString();
	}
}
