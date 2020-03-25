package com.singashi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config Java Class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//call our new swim coach methods...has the props values injected
		System.out.println("email :: " + theCoach.getEmail());
		System.out.println("team :: " + theCoach.getTeam());
		
		context.close();
		
	}

}
