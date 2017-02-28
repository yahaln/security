package com.security.webc.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.security.webc.common.HandlerResponseWriter;
import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;

/**
 * 
 * ClassName: RestfulAuthenticationFailureHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月21日 下午8:14:50 <br/>
 * 認證失敗Handler
 * 
 * @author yanghualin
 * @version
 * @since
 */
@Component
public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
//		PrintWriter writer;
		// String returnStr = "{exception:{name:'" + exception.getClass()
		// + "',message:'" + exception.getMessage() + "'}}";
		String returnStr = new JsonResult(ResultConstans.CODE_EXCEPTION, ResultConstans.MSG_NO_LOGIN, null).formatjsonStr();
		System.out.println(this.getClass().toString() + ":" + returnStr);
		HandlerResponseWriter.flush(response, returnStr, "utf-8");
//		writer = response.getWriter();
//		writer.write(returnStr);
//		writer.flush();
//		writer.close();
	}

}