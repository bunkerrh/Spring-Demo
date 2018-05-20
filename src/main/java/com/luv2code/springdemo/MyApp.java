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
		//Coach alpha = context.getBean("tennis", Coach.class);
		Coach swim = context.getBean("swimCoach", Coach.class);
		//boolean result = (tennisCoach == alpha);

		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		//System.out.println(tennisCoach.getDailyFortune()); 
		
		//System.out.println(alpha.getDailyWorkout());
		//System.out.println(alpha.getDailyFortune()); 
		
		System.out.println(swim.getDailyWorkout());
		System.out.println(swim.getDailyFortune()); 
		
		//System.out.println(result + ": Hash code of tennisCoach: " + tennisCoach.hashCode() + " Hash code of alpha: " + alpha.hashCode());

		
		context.close();
	} 

}
