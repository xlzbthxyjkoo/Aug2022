package kr.ac.sku.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	private String name;
	private int count;
	
	@Autowired
	private MyDAO myDao;
	
	public MyService(MyDAO myDao) {
		this.myDao = myDao;
	}
	
	
	public void checkPrint() {
		myDao.print();
	}
	public void setMyDao(MyDAO myDao) {
		this.myDao = myDao;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
