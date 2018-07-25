package com.cinfy.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableAutoConfiguration
@Import(JpaConfiguration.class)
@SpringBootApplication
@ComponentScan(basePackages = {"com.cinfy.ams","com.cinfy.ams.controller","com.cinfy.ams.model","com.cinfy.ams.repositories"})

public class AmsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AmsApplication.class);
    }
}
