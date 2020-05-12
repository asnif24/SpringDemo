package com.asnif.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileBasedFortuneService implements FortuneService {
	
	private String fileName = "src/fortune-data.txt";
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	public FileBasedFortuneService() {

		System.out.println(">> FileFortuneService: inside default constructor");
		
	}
	
	@PostConstruct
	private void loadFile() {
		System.out.println(">> FileFortuneService: inside PostConstruct");
		
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
		System.out.println("File loaded!");
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

}
