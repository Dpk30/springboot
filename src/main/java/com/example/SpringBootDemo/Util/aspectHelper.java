package com.example.SpringBootDemo.Util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class aspectHelper {

	public aspectHelper() {
		// TODO Auto-generated constructor stub
	}
	
	
	//@Pointcut("execution(public void print())")
	public void aspectLogger() {
		System.out.println("logger");
	}
	

}
