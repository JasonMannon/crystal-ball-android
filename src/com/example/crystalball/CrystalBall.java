package com.example.crystalball;

import java.util.Random;

import android.view.View;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certain",
			"It is decidingly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say" 
		};
	
	public String getAnAnswer() {
		String answer = "";
			
		Random randomGenerator = new Random(); //Construct a new random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
			answer = mAnswers[randomNumber];
			return answer;
	}
}
