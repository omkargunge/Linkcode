package com.SpringBootProject.SpringBootProjectApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@SpringBootApplication(scanBasePackages ="com.SpringBootProject.SpringBootProjectApplication")
@EntityScan (basePackages = "com.SpringBootProject.SpringBootProjectApplication.Entity01")
@EnableJpaRepositories(basePackages = "com.SpringBootProject.SpringBootProjectApplication.Repository01")
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
