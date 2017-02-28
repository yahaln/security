package com.security.webc.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String home(HttpSession httpSession) {
		httpSession.setAttribute("user", "helloword");
		return "Hello World!";
	}
	@RequestMapping("/admin/hello.do")
	public String admin(HttpSession httpSession) {
		return "Hello admin!";
	}
	@RequestMapping("/user/hello.do")
	public String user(HttpSession httpSession) {
		return "Hello user!";
	}
}