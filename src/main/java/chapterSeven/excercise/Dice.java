package chapterSeven.excercise;

import java.security.SecureRandom;

public class Dice {
	
//	int[] firstDiceFace = new int[7];
	
	public int getRandom() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(6) + 1;
	}
	
	public int rollFirstDie(){
		int firstDie = getRandom();
//		System.out.println("The first die number is " + firstDie);
		
		return firstDie;
	}
	
	public int rollSecondDie(){
		int secondDie = getRandom();
//		System.out.println("The second die number is " + secondDie);
		return secondDie;
	}
	
	public void returnResultOfFirstDieAndSecondDie(){
		int firstDieVariable = rollFirstDie();
		int secondDieVariable = rollSecondDie();
		int sumOfDice = firstDieVariable + secondDieVariable;
		
		System.out.println("First die number " + firstDieVariable);
		System.out.println("Second die number is " + secondDieVariable);
		System.out.println("The sum of the dice is " + sumOfDice);
	}
	
	
	
}
