package com.asnif.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.Iterators.Getter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(21)
public class MyDemoLoggingAspect {

	
	@Before("com.asnif.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAcount() {
		
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}
		
	

}






