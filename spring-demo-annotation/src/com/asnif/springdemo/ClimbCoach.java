package com.asnif.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class ClimbCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${climb.gym}")
	private String gym;
	
	@Value("${climb.team}")
	private String team;
	
	public ClimbCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "ARC for 60 minutes and train with the figerboard!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getTeam() {
		return team;
	}
	
	public String getGym() {
		return gym;
	}
	
}
