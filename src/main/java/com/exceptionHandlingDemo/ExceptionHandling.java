package com.exceptionHandlingDemo;

import com.exceptionHandlingDemo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
public class ExceptionHandling {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandling.class, args);
	}

}
