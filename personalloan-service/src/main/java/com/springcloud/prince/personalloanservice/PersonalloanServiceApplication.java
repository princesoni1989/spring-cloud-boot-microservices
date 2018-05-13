package com.springcloud.prince.personalloanservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springcloud.prince.personalloanservice")
@EnableDiscoveryClient
public class PersonalloanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalloanServiceApplication.class, args);
	}
}
