package chapterSeven.excercise;

import Registery.Exceptions.InputOutOfBoundException;

import java.security.SecureRandom;

public class Dice {
	
	
	SecureRandom random = new SecureRandom();
	int[] firstDice = new int[7];
	
	public SecureRandom getRandom() {
		random.nextInt(firstDice[7]);
		return random;
	}
	
	public void getFirstDice(int rollDice) throws InputOutOfBoundException {
		if (rollDice > firstDice[7]) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			random.nextInt(rollDice);
		}
	}
	
	public SecureRandom returnRolledDiceResult(){
		return random;
	}
}
