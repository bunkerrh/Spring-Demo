package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennis")
@Scope("prototype")
public class TennisCoach implements Coach {

	//This is a field injection that will inject.
	
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMuStartupStuff");
	}
	
	@PreDestroy
	public void doMyDestroyStuff()
	{
		System.out.println("Tennis Coach inside of predestroy");
	}
	
	public String getDailyWorkout()
	{
		return "Practice Tennis";
	}
	
	public String getDailyFortune() 
	{
		
		return fortuneService.getFortune();
		
	}
	
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	*/
	//define a default constructor
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	

}
