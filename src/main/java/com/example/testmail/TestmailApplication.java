package com.example.testmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestmailApplication.class, args);
	}

}
