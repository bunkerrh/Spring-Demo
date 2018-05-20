package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//read the spring config file
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		//get the bean from the spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		SwimCoach swim = context.getBean("swimCoach", SwimCoach.class);
		Coach WFT = new TrackCoach();

		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		//System.out.println(tennisCoach.getDailyFortune()); 
		
		//System.out.println(alpha.getDailyWorkout());
		//System.out.println(alpha.getDailyFortune()); 
		
		System.out.println(swim.getDailyWorkout());
		System.out.println(swim.getDailyFortune()); 
		
		//System.out.println(result + ": Hash code of tennisCoach: " + tennisCoach.hashCode() + " Hash code of alpha: " + alpha.hashCode());

		//Call our swim coach methods.. has the props values injected
		System.out.println(swim.getEmail());
		System.out.println(swim.getTeam());
		
		context.close();
	} 

}
