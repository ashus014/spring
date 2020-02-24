package com.singashi.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("> TennisCoach - inside Default Constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> Tennis Coach :: inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> Tennis Coach :: inside of doMyCleanupStuff()");
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
