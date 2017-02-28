package com.security.webc.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Component;

import com.security.webc.common.HandlerResponseWriter;
import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;

/**
 * 
 * ClassName: RestfulAuthenticationSuccessHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午8:13:43 <br/>
 * 認證成功handler
 * 
 * @author yanghualin
 * @version
 * @since
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	private RequestCache requestCache = new HttpSessionRequestCache();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String returnStr = new JsonResult(ResultConstans.CODE_SUCCESS, ResultConstans.MSG_SUCCESS, null).formatjsonStr();
//		String returnStr = "{message:'sucess'}";
		HandlerResponseWriter.flush(response, returnStr, "utf-8");
//		PrintWriter writer;
//		response.setStatus(200);
//		writer = response.getWriter();
//		writer.write(returnStr);
//		writer.flush();
//		writer.close();
		// requestCache.removeRequest(request, response);
		// clearAuthenticationAttributes(request);
	}

	protected final void clearAuthenticationAttributes(HttpServletRequest request) {
		HttpSession session = request.getSession(false);

		if (session == null) {
			return;
		}
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}

	public void setRequestCache(RequestCache requestCache) {
		this.requestCache = requestCache;
	}
}