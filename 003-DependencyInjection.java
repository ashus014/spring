package com.ashu.springdemo;

public class BaseballCoach implements Coach{

	//define private field for dependency
	private FortuneService fortuneService;
	
	
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}

---------------------------------------------------------------------------------

package com.ashu.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
-----------------------------------------------------------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

	
    <!-- Define your beans here -->
    
    <bean id="myFortune"
    	class = "com.ashu.springdemo.HappyFortuneService">
    	
    </bean>
    
    <bean id="myCoach"
    	class = "com.ashu.springdemo.BaseballCoach">
    	
    	<!-- set up constructor injection -->
    	<constructor-arg
			ref="myFortune">
		</constructor-arg>
    </bean>

</beans>

--------------------------------------------------------------------
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
		
		//let's call new methods for fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
------------------------------------------------------------------------------
package com.ashu.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
--------------------------------------------------------------------------------
package com.ashu.springdemo;

public interface Coach {

	public String getDailyWorkout();
	
	public String getDailyFortune();
}
-------------------------------------------------------------------------------

package com.ashu.springdemo;

public interface FortuneService {

	public String getFortune();
	
}

---------------------------------------------------------------------------------

package com.ashu.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}




