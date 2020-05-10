package com.asnif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		System.out.println("start");
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml"); 
		
		System.out.println("start2");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("start");
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println("finish0");
		// close the context
		context.close();
		
		System.out.println("finish");
	}

}
