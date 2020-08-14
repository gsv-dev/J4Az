package com.shrcorp.az4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.print("Application is starting...");
		SpringApplication.run(DemoApplication.class, args);
	}

}
