package com.exmaple.MyFirstMVC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.exmaple")
public class MyFirstMvc2Application {
	public static void main(String[] args) {
		SpringApplication.run(MyFirstMvc2Application.class, args);
	}

}
