package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class CoachConfig {

	
	//define a bean for our happy fortune service
	@Bean
	public FortuneService happyFortuneSerivce()
	{
		return new HappyFortuneService();
	}
	
	@Bean
	public FortuneService randomFortuneService()
	{
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach tennisCoach()
	{
		return new TennisCoach(randomFortuneService());
	}
	//define bean for our sad fortune service
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(happyFortuneSerivce());
	}
}
