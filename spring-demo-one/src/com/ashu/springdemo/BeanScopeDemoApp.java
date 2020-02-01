package com.ashu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object :: " + result);
		
		System.out.println("\nMemeory location for theCoach :: " + theCoach);
		
		System.out.println("\nmemoery location for alphaCoach :: " + alphaCoach);
		
		//close the context
		context.close();
		
		
	}

}
