package com.cgi.latch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatchApplication.class, args);  
	}
}
