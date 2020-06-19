package com.sendmylove.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.sendmylove.demo.controller" })
@EnableJpaRepositories(basePackages = { "com.sendmylove.demo.model.dao" })
@EntityScan("model.domain")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
