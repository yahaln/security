package com.security.webc.core.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.webc.core.security.AccessDeniedHandlerImpl;
import com.security.webc.core.security.AuthenticationEntryPointImpl;
import com.security.webc.core.security.AuthenticationFailureHandlerImpl;
import com.security.webc.core.security.AuthenticationSuccessHandlerImpl;
import com.security.webc.core.security.CustomLogoutSuccessHandler;
import com.security.webc.core.security.UserDetailsServiceImpl;

@EnableWebSecurity
// 覆盖默认的spring security提供的配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsServiceImpl userService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		// 密码加密
		return new BCryptPasswordEncoder(16);
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http
		// //禁用CSRF保护
		// .csrf().disable()
		// .authorizeRequests()
		// //任何访问都必须授权
		// .anyRequest().fullyAuthenticated()
		// //配置那些路径可以不用权限访问
		// .mvcMatchers("/login").permitAll()
		// .and()
		// .formLogin()
		// //登陆成功后的处理，因为是API的形式所以不用跳转页面
		// .successHandler(new RestfulAuthenticationSuccessHandler())
		// //登陆失败后的处理
		// .failureHandler(new SimpleUrlAuthenticationFailureHandler())
		// .and()
		// //登出后的处理
		// .logout().logoutSuccessHandler(new RestLogoutSuccessHandler())
		// .and()
		// //认证不通过后的处理
		// .exceptionHandling()
		// .authenticationEntryPoint(new RestfulAuthenticationEntryPoint());

		http.authorizeRequests().anyRequest().fullyAuthenticated();//
		http.authorizeRequests().mvcMatchers("/login").permitAll();
		http.authorizeRequests().mvcMatchers("/logout").permitAll();
		http.logout().logoutSuccessHandler(new CustomLogoutSuccessHandler());
		http.logout().permitAll(); // 注销行为任意访问
		http.csrf().disable();
		http.anonymous().disable();
		http.formLogin().usernameParameter("username");
		http.formLogin().passwordParameter("password");
		// http.addFilterBefore(new
		// CustomFilterSecurityInterceptor(),FilterSecurityInterceptor.class);
		http.exceptionHandling().authenticationEntryPoint(new AuthenticationEntryPointImpl());
		http.formLogin().successHandler(new AuthenticationSuccessHandlerImpl());
		http.formLogin().failureHandler(new AuthenticationFailureHandlerImpl());
		http.exceptionHandling().accessDeniedHandler(new AccessDeniedHandlerImpl());
		http.rememberMe();
		http.sessionManagement().maximumSessions(1);//第二个登录的用户踢掉第一个登录的用户
	}

}