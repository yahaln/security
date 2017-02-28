package com.security.webc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;
import com.security.webc.core.token.AccessTokenManager;
import com.security.webc.entity.LoginUserEntity;
import com.security.webc.entity.UserEntity;
import com.security.webc.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * 
	 * 登录
	 * 
	 * @author yanghualin
	 * @param request
	 * @param user
	 * @return
	 * @since
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public Object login(HttpServletRequest request, HttpServletResponse response, @RequestBody LoginUserEntity user) {
		UserEntity entity = loginService.start(user);
		if (entity != null) {
			request.getSession().setAttribute(AccessTokenManager.releaseAccessToken(), entity);
			response.setHeader(ResultConstans.ACCESS_TOCKEN, AccessTokenManager.releaseAccessToken());
			return new JsonResult(ResultConstans.CODE_SUCCESS, ResultConstans.MSG_SUCCESS, null);
		} else {
			return new JsonResult(ResultConstans.CODE_FAILUER, ResultConstans.MSG_FAILURE, null);
		}
	}

	@RequestMapping("/login.action")
	public Object loginAction(HttpServletRequest request, HttpServletResponse response,
			@PathParam("name") String username, @PathParam("password") String password) {
		LoginUserEntity user = new LoginUserEntity();
		user.setUsername(username);
		user.setPassword(password);
		UserEntity entity = loginService.start(user);
		if (entity != null) {
			request.getSession().setAttribute(AccessTokenManager.releaseAccessToken(), entity);
			response.setHeader(ResultConstans.ACCESS_TOCKEN, AccessTokenManager.releaseAccessToken());
			return new JsonResult(ResultConstans.CODE_SUCCESS, ResultConstans.MSG_SUCCESS, null);
		} else {
			return new JsonResult(ResultConstans.CODE_FAILUER, ResultConstans.MSG_FAILURE, null);
		}
	}

	/**
	 * 
	 * 注销
	 * 
	 * @author yanghualin
	 * @param request
	 * @return
	 * @since
	 */
	@RequestMapping("/logout.do")
	public Object logout(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String token = request.getHeader(ResultConstans.ACCESS_TOCKEN);
		request.getSession().removeAttribute(token);
		return new JsonResult(ResultConstans.CODE_SUCCESS, ResultConstans.MSG_SUCCESS, null);
	}
}
