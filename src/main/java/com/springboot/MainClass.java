package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainClass.class, args);

	}

}
