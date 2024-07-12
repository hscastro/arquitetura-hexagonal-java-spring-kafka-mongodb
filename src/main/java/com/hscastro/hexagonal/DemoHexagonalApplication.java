package com.hscastro.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHexagonalApplication.class, args);
	}

}
