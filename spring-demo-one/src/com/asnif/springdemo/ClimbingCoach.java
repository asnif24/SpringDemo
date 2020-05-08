package com.asnif.springdemo;

public class ClimbingCoach implements Coach {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train with the fxxking fingerboard!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
