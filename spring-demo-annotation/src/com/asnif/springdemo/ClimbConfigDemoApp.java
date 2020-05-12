package com.asnif.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClimbConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClimbConfig.class);
		
		ClimbCoach myCoach = context.getBean("climbCoach", ClimbCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		System.out.println("Let's climb in " + myCoach.getGym() + " Boudering gym with " + myCoach.getTeam() + "!!");
		
		context.close();
	}

}
