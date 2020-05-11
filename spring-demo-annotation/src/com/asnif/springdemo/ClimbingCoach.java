package com.asnif.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "ARC for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
