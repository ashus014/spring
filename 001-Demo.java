package com.ashu.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}
}

---------------------------------------------------------------------------------------------------

package com.ashu.springdemo;

public interface Coach {

	public String getDailyWorkout();
}

------------------------------------------------------------------------------------------------------

package com.ashu.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new BaseballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
