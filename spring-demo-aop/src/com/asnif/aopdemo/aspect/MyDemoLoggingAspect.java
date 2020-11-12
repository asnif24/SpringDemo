package com.asnif.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all our related advices for logging

	// let's start with an @Before advice
	
//	@Before("execution(public void add*())")
	
	@Before("execution(* com.asnif.aopdemo.dao.*.*(..))")
	public void beforeAddAcount() {
		
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}
	
}
