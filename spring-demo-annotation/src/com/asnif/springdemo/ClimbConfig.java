package com.asnif.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class ClimbConfig {
	@Bean
	public FortuneService climbFortuneService() {
		return new ClimbFortuneService();
	}
	
	@Bean
	public Coach climbCoach() {
		return new ClimbCoach(climbFortuneService());
	}
	
}
