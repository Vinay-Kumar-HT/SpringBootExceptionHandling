package com.exceptionHandlingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"src/main/java/com/exceptionHandlingDemo"})

@RestController
public class ExceptionHandling {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandling.class, args);
	}

}
