package com.exmaple.MyFirstMVC2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * This is an auto-generated file, DO NOT TOUCH
 * this file will allow your controller to generate the mappings
 * for your front end 
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFirstMvc2Application.class);
	}

}
