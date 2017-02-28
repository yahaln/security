package com.security.webc.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import com.security.webc.common.HandlerResponseWriter;
import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		String returnStr = new JsonResult(ResultConstans.CODE_ACCESS_PERMISSION_DENIED,
				ResultConstans.MSG_PERMISSION_DENIED, null).formatjsonStr();
		// String returnStr = "{exception:{name:'" +
		// accessDeniedException.getClass()
		// + "',message:'" + accessDeniedException.getMessage() + "'}}";
		System.out.println(this.getClass().toString() + ":" + returnStr);
		HandlerResponseWriter.flush(response, returnStr, "utf-8");
		// PrintWriter writer;
		// writer = response.getWriter();
		// writer.write(returnStr);
		// writer.flush();
		// writer.close();
	}

}