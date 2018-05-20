package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	public String getFortune() {
		return "Today I will be great!";
	}

	
}
