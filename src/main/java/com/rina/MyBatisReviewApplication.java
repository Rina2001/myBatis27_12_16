package com.rina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rina")
public class MyBatisReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisReviewApplication.class, args);
	}
}
