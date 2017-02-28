package com.security.webc.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class HandlerResponseWriter {
	public static void flush(HttpServletResponse response, String jsonResult, String charset)
			throws IOException, ServletException {
		response.setCharacterEncoding(charset);
		response.setContentType("text/html; charset=" + charset);
		PrintWriter writer;
		writer = response.getWriter();
		writer.write(jsonResult);
		writer.flush();
		writer.close();
	}
}
