package kr.ac.sku.ioc.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.ac.sku")
public class MyConfig {
	/*
	@Bean
	public MyService myService(MyDAO myDao) {
		return new MyService(myDao);
	}
	
	@Bean
	public MyDAO myDao() {
		return new MyDAO();
	}*/
}
