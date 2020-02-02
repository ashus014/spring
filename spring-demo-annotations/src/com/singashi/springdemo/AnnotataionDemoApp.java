package com.singashi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotataionDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
		
	}

}
