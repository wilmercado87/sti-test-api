package com.sti.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.sti.api.model"})
public class StiTestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StiTestApiApplication.class, args);
	}

}
