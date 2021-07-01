package chapterSix.examples;

import java.security.SecureRandom;

public class RollDie {
	
	public static void main(String[] args){
		
		SecureRandom secureRandom = new SecureRandom();
		
		int frequencyOne = 0;
		int frequencyTwo = 0;
		int frequencyThree = 0;
		int frequencyFour = 0;
		int frequencyFive = 0;
		int frequencySix = 0;
		
		for (int roll = 1; roll <= 6000000; roll = roll + 1){
			int face = 1 + secureRandom.nextInt(6);
			
			switch (face) {
				case 1 -> frequencyOne = frequencyOne + 1;
				case 2 -> frequencyTwo = frequencyTwo + 1;
				case 3 -> frequencyThree = frequencyThree + 1;
				case 4 -> frequencyFour = frequencyFour + 1;
				case 5 -> frequencyFive = frequencyFive + 1;
				case 6 -> frequencySix = frequencySix + 1;
			}
		}
		
		System.out.print("Face  Frequency");
		System.out.printf("\n1\t % d%n2\t % d%n3\t % d%n4\t % d%n5\t % d%n6\t % d%n",
				frequencyOne, frequencyTwo, frequencyThree, frequencyFour, frequencyFive,
				frequencySix);
	}
}
