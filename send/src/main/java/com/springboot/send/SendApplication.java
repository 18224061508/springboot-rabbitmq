package com.springboot.send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.springboot.send")
public class SendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendApplication.class, args);
	}
}
