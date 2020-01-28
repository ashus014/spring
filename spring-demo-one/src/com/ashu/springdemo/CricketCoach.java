package com.ashu.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket coach : inside no-arg constructor");
	}
	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach : inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
