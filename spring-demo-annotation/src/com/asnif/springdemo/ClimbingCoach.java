package com.asnif.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService myFirstFortuneService;
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService mySecondFortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "ARC for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return "1. "+myFirstFortuneService.getFortune()+"\n2. "+mySecondFortuneService.getFortune();
	}

}
