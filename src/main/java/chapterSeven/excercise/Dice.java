package chapterSeven.excercise;

import Registery.Exceptions.InputOutOfBoundException;

import java.security.SecureRandom;

public class Dice {
	
	int[] firstDiceFace = new int[7];
	
	public int getRandom() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(6) + 1;
	}
	
	public void getFirstDice(int rollDice) throws InputOutOfBoundException {
		if (rollDice > firstDiceFace[7]) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			System.out.println();
		}
	}
	
//	public SecureRandom returnRolledDiceResult(){
//		return random;
	}
