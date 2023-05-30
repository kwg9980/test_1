package com.semiproject.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class WebprojectApplication {
	@RequestMapping("/")
	String home() {
		return "안녕하세요";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebprojectApplication.class, args);
	}
}
