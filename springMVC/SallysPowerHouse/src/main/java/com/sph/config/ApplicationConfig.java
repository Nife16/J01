package com.sph.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// @Configuration lets spring know this file is for config purposes
@Configuration
// Entity scan will scan your entity folder to make beans of your Entitys
@EntityScan(basePackages = "com.sph.entity")
// EnableJPARepo's will scan your repo folder for your repo's to make them beans as well,
// so you can autowire them
@EnableJpaRepositories(basePackages = "com.sph.repo")
public class ApplicationConfig {
    
}
