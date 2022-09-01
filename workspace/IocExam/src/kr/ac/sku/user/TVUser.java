package kr.ac.sku.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.sku.ioc.CaramiTV;
import kr.ac.sku.ioc.DingdingTV;
import kr.ac.sku.ioc.TV;
import kr.ac.sku.ioc.TVFactory;

public class TVUser {

	public static void main(String[] args) {
	//	TV tv = new DingdingTV();
	//	TV tv = TVFactory.getTV(args[0]);
		
		ApplicationContext factory 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		TV tv = factory.getBean("dingTV",TV.class);
		tv.turnOn();
		tv.volumUp();
		tv.volumUp();
		tv.volumDown();
		tv.turnOff();
		
//		BTV tv = new BTV();
//		tv.turnOnTV();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOffTV();
//		
		
	}

}
