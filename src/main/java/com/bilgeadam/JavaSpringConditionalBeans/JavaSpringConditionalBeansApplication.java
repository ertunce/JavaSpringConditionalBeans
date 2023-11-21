package com.bilgeadam.JavaSpringConditionalBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringConditionalBeansApplication {

	public static void main(String[] args) {

		System.setProperty("my.custom.condition", "false");

		SpringApplication.run(JavaSpringConditionalBeansApplication.class, args);
	}

}
