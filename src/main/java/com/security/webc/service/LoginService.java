package com.security.webc.service;

import org.springframework.stereotype.Service;

import com.security.webc.entity.LoginUserEntity;
import com.security.webc.entity.UserEntity;


@Service
public class LoginService {
	/**
	 * 
	 * 登录
	 * @author yanghualin
	 * @param user
	 * @return
	 * @since
	 */
	public static UserEntity start(LoginUserEntity loginUser){
		UserEntity user=null;
		if(loginUser.getUsername().equals("yahaln")&&loginUser.getPassword().equals("111")){
			user=new UserEntity();
			user.setUsername("杨化林");
			user.setIdno("222424198712064937");
			user.setUserid("ce74b93e6381472f93516c3bf187aebe");
		}
		/**
		 * 访问网络去查询用户信息
		 */
		return user;
	}
}
