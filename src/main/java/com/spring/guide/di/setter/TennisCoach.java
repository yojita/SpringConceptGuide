package com.spring.guide.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach : Inside default constructor");
	}
	
	//define a setter method 
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TennisCoach : inside setFortuneService");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
