package chapterSeven.excercise;

import java.security.SecureRandom;

public class Dice {
	
	public int getRandom() {
		SecureRandom random = new SecureRandom();
		return random.nextInt(6) + 1;
	}
	
	public int rollDie() {
		return getRandom();
	}
}
