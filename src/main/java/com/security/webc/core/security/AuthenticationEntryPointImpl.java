package com.security.webc.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.security.webc.common.HandlerResponseWriter;
import com.security.webc.common.JsonResult;
import com.security.webc.common.ResultConstans;
@Component
public class AuthenticationEntryPointImpl implements  
        AuthenticationEntryPoint {  
  
    @Override  
    public void commence(HttpServletRequest request,  
            HttpServletResponse response, AuthenticationException authException)  
            throws IOException, ServletException {  
  
        String returnStr = new JsonResult(ResultConstans.CODE_NOT_LOGIN, ResultConstans.MSG_NO_LOGIN, null).formatjsonStr();
//        String returnStr = "{exception:{name:'" + authException.getClass()  
//                + "',message:'" + authException.getMessage() + "'}}";  
        System.out.println(this.getClass().toString()+":"+returnStr);  
        HandlerResponseWriter.flush(response, returnStr, "utf-8");
//        writer = response.getWriter();  
//        writer.write(returnStr);  
//        writer.flush();  
//        writer.close();  
    }  
  
} 