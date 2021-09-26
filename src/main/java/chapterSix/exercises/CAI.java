package chapterSix.exercises;

import java.security.SecureRandom;

public class CAI {
	
	SecureRandom secureRandom;
	private int val;
	
	public int firstRandom() {
		secureRandom = new SecureRandom();
		return secureRandom.nextInt(10) +1;
	}
	
	public int secondRandom(){
		secureRandom = new SecureRandom();
		return secureRandom.nextInt(10) + 1;
	}
	
	public int calc(){
		return firstRandom() * secondRandom();
	}
	
	public void getUserAnswer_andCompareItWithInitialAnswer(int userAnswer) {
		val = userAnswer;
		
		if (val == calc()) {
			System.out.println("Good job.");
		} else {
			if (val != calc()){
				System.out.println("Failed!! Try again.");
			}
		}
	}
	
	public int why(){
		System.out.println("The answer is: " + calc());
		return val;
	}
}
