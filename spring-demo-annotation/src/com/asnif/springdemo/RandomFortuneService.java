package com.asnif.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
		"happy day",
		"very happy day",
		"miao miao miao ~~"
	};
	
	// create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}




