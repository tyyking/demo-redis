package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/index")
	public String index() throws  IOException {
		System.out.println(123459);
		return "Hello Spring Boot555,我是WQ!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

