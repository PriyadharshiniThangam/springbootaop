package com.springboot.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	@Before(value = "execution(* com.sprinboot.service.EmployeeService.*(..)) and args(name,id)")
	public void beforeAdvice(JoinPoint joinPoint, String name, int id) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee  " + name + " and id - " + id);
	}

	@AfterReturning(pointcut="execution(* com.springboot.service.createEmployee(..))",returning="returnValue")
	public void runAfter(JoinPoint joinPoint, String returnValue) throws Throwable {

		System.out.println("AfterReturning method:" + joinPoint.getSignature());

		System.out.println("created employee" );
	}
}
