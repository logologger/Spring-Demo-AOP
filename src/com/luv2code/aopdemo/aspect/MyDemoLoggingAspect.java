package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where a;; our related advices for logging
	
	//lets start with a @Before advice
	
	@Before("execution( * com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n\n ===>  Before Method Called AOP !!! ");
	}
	
}
