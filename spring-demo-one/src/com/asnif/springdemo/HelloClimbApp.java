package com.asnif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClimbApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myClimbCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		
		
		
	}

}
