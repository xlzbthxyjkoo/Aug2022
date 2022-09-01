package kr.ac.sku.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext factory 
//		= new ClassPathXmlApplicationContext("exam.xml");
		= new AnnotationConfigApplicationContext(MyConfig.class);
		MyService my = factory.getBean(MyService.class);
		
		my.checkPrint();
		System.out.println(my.getName());
	}

}
