package com.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RecordServiceM2Application {

	public static void main(String[] args) {
		SpringApplication.run(RecordServiceM2Application.class, args);
	}

}
