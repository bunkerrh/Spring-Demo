package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.*;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public interface Coach {

	public String getDailyWorkout();
	
	public String getDailyFortune();
	
}
