package com.example.Springbootdemo2;

import com.example.Springbootdemo2.model.app.Alien;
import com.example.Springbootdemo2.model.app.Laptop;
import com.example.Springbootdemo2.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Springbootdemo2Application.class, args);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
