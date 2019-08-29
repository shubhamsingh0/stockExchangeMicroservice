package com.cognizant.StockExchangeMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableDiscoveryClient(autoRegister=true)
@ComponentScan(basePackages="com.cognizant.StockExchangeMicroservice.*")

public class StockExchangeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockExchangeMicroserviceApplication.class, args);
	}
}
