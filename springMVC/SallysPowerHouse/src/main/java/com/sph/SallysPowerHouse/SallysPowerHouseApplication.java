package com.sph.SallysPowerHouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sph")
public class SallysPowerHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SallysPowerHouseApplication.class, args);
	}

}
