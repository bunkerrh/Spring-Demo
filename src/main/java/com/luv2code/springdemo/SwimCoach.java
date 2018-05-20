package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;

public class SwimCoach implements Coach {


	@Qualifier("HappyFortuneService")
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		
	 return "Swim like a million laps";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
