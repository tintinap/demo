package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		System.out.println(1);
		SpringApplication.run(MainApplication.class, args);
		System.out.println(2);
	}
}
