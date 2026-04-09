package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {

		ApplicationContext  context = SpringApplication.run(FirstProjectApplication.class, args);
		Allien obj = context.getBean(Allien.class);
		obj.code();

		Allien obj1 = context.getBean(Allien.class);
		obj1.code();
	}

}
