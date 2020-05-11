package com.asnif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationClimbingApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("climbingCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		context.close();

	}

}
