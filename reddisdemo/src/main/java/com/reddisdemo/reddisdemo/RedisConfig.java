package com.reddisdemo.reddisdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
	
	@Bean
	public CustomerDAL customerDAL() {
		return new CustomerDALImpl();
	}

}
