package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//	@Autowired
//	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@RequestMapping("/")
	public void hello(){
		return
	}


	@Override
	public void run(String... args) throws Exception {
//		Connection conn = dataSource.getConnection();
//
//		if(conn != null){
//			System.out.println("^^");
//		}
//		conn.close();
	}
}
