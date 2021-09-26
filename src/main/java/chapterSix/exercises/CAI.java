package chapterSix.exercises;

import java.security.SecureRandom;

public class CAI {
	
	SecureRandom secureRandom;
	private int val;
	
	public int firstRandomNumberGenerator() {
		secureRandom = new SecureRandom();
		return secureRandom.nextInt(10) +1;
	}
	
	public int secondRandomNumberGenerator(){
		secureRandom = new SecureRandom();
		return secureRandom.nextInt(10) + 1;
	}
	
	public int getSecuredRandomResult(){
		return firstRandomNumberGenerator() * secondRandomNumberGenerator();
	}
	
	public void compareUserAnswerWithInitialAnswer(int userAnswer) {
		val = userAnswer;
		
		if (val == getSecuredRandomResult()) {
			System.out.println("Good job.");
		} else {
			if (val != getSecuredRandomResult()){
				System.out.println("Failed!! Try again.");
			}
		}
	}
	
	public int getAnswer(){
		System.out.println("The answer is: " + getSecuredRandomResult());
		return val;
	}
}
