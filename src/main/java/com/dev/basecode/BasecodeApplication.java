package com.dev.basecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasecodeApplication {

	public static final String EXAMPLE_USER = "example.user";
	
	public static void main(String[] args) {
		SpringApplication.run(BasecodeApplication.class, args);
	}

}
