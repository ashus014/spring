package com.singashi.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	//create an array of Strings
	private String[] data = {
			"Beware of the Wolf in the Sheep Clothing",
			"Diligence id the mother of Good Luck",
			"Hard Work is the key to Success"
	};
	
	//create the Random number Generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		//pick a random string from the Array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
