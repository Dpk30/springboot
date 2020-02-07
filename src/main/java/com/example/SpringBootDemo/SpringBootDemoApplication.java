package com.example.SpringBootDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringBootDemo.Component.Employee;
import com.example.SpringBootDemo.Entity.Studentbean;

@SpringBootApplication
@ConditionalOnClass(Studentbean.class)
public class SpringBootDemoApplication {
	

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringBootDemo/src/main/resources/ApplicationContext.xml");
	       
	Employee emp=context.getBean(Employee.class);
	emp.print();
	}

	 
}
