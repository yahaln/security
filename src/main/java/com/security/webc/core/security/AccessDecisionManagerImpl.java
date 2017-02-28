package com.security.webc.core.security;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * 
 * ClassName: CustomAccessDecisionManager <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午7:07:57 <br/>
 * 访问决策器
 * @author yanghualin
 * @version
 * @since
 */
@Service
public class AccessDecisionManagerImpl implements AccessDecisionManager {

	// decide 方法是判定是否拥有权限的决策方法
	@Override
	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {

		HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
		String pm;
		AntPathRequestMatcher matcher;
		for (GrantedAuthority ga : authentication.getAuthorities()) {
			if (ga instanceof SimpleGrantedAuthority) {
				// return;
				SimpleGrantedAuthority authority = (SimpleGrantedAuthority) ga;
				pm = authority.getAuthority();
				for(ConfigAttribute t:configAttributes){
					if(pm!=null&&pm.equals(t.getAttribute())){
						return;
					}
				}
//				matcher = new AntPathRequestMatcher(url);
//				if (matcher.matches(request)) {
//					// 当权限表权限的method为ALL时表示拥有此路径的所有请求方式权利。
//					// if (method.equals(request.getMethod()) ||
//					// "ALL".equals(method)) {
//					return;
//					// }
//				}
			} else if (ga.getAuthority().equals("ROLE_ANONYMOUS")) {// 未登录只允许访问
																	// login 页面
				matcher = new AntPathRequestMatcher("/login");
				if (matcher.matches(request)) {
					return;
				}
			}
		}
		throw new AccessDeniedException("no right");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
}
