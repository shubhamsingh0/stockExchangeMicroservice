package com.cognizant.StockExchangeMicroservice.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.cognizant.StockExchangeMicroservice.Controller"})

public class WebConfig implements WebMvcConfigurer {
	
	/*@Bean
	public InternalResourceViewResolver resolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/Views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/

	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		return WebMvcConfigurer.super.getValidator();
	}
	
	
}
