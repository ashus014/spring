package com.ashu.springdemo;

public interface Coach {

	public String getDailyWorkout();
}

-----------------------------------------------

package com.ashu.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

}

-----------------------------------------------

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

	
    <!-- Define your beans here -->
    
    <bean id="myCoach"
    	class = "com.ashu.springdemo.TrackCoach">
    </bean>

</beans>

----------------------------------------------------

package com.ashu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
