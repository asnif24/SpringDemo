package com.asnif.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String fileName = "src/fortune-data.txt";
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	public RandomFortuneService() {
		File theFile = new File(fileName);
		// initialize array list
		theFortunes = new ArrayList<String>(); 
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
			String tempLine;
			while ((tempLine = br.readLine()) != null){
				theFortunes.add(tempLine);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

}
