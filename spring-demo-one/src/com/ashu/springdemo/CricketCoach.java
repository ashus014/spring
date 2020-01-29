package com.ashu.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("Cricket coach : inside setter method - setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}

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
