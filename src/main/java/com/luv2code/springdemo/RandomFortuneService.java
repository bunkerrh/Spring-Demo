package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	//create an array of strings
	private String[] data = {"Fortune1", "Fortune2", "Fortune3"};
	
	//create a random number
	private Random randy = new Random();	
	public String getFortune()
	{
		
		int rand = randy.nextInt(data.length);
		return data[rand];
		
	}
}
