package com.springcloud.prince.homeloanservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springcloud.prince.homeloanservice")
@EnableDiscoveryClient
public class HomeloanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeloanServiceApplication.class, args);
	}
}
