package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("controller")
@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Java Code goes here");
		SpringApplication.run(MySpringBootApplication.class, args);
	}

}
