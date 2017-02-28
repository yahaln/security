package com.security.webc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * Spring Boot 入口类
 * 最好是设置在项目根目录下，application只会扫描同包或者子包下的@controller @service
 * @author yanghualin
 * @version 
 * @since
 */
@SpringBootApplication
@EnableJpaRepositories("com.security.webc.dao")
@ComponentScan(basePackages = { "com.security.webc.*" })
@EntityScan("com.security.webc.entity")  
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
