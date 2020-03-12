package com.singashi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config Java Class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		context.close();
		
	}

}
