package com.steve.applications.demo_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.steve.applications")
public class DemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExampleApplication.class, args);
	} 
} 	