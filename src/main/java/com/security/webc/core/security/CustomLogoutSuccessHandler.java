package com.security.webc.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.security.webc.common.HandlerResponseWriter;
import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;
/**
 * 
 * ClassName: CustomLogoutSuccessHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年2月28日 上午9:04:24 <br/>
 * 注销成功！
 * @author yanghualin
 * @version 
 * @since
 */
@Component
public class CustomLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		String returnStr = new JsonResult(ResultConstans.CODE_SUCCESS, ResultConstans.MSG_SUCCESS,
				null).formatjsonStr();
		System.out.println(this.getClass().toString() + ":" + returnStr);
		HandlerResponseWriter.flush(response, returnStr, "utf-8");
//		writer = response.getWriter();
//		writer.write(returnStr);
//		writer.flush();
//		writer.close();
	}
}
