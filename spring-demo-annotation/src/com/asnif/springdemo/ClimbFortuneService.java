package com.asnif.springdemo;

public class ClimbFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Climb now, work later!";
	}

}
