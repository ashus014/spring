package com.singashi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("> TennisCoach - inside Default Constructor");
	}
	
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		
//		System.out.println("> TennisCoach - inside doSomeCrazyStuff");
//		fortuneService = theFortuneService;
//	}
	
	
//	//define a setter method
//	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		
//		System.out.println("> TennisCoach - inside setFortuneService");
//		fortuneService = theFortuneService;
//	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley today";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
