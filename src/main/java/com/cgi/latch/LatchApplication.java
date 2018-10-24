package com.cgi.latch;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


// The annotation (exclude = SecurityAutoConfiguration.class) avoids the need for basic authentication when making an api call
// see https://stackoverflow.com/questions/37285016/what-is-username-and-password-when-starting-spring-boot-with-tomcat
// and https://stackoverflow.com/questions/40228036/how-to-turn-off-spring-security-in-spring-boot-application
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatchApplication.class, args);  
	}
}
