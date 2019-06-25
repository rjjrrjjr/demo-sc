package com.rj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@MapperScan(basePackages = "com.rj.mapper")
//服务熔断在服务端
public class ProviderHystrix8001Application {

	public static void main(String[] args) {
		SpringApplication.run(ProviderHystrix8001Application.class, args);
	}

}
