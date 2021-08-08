package chapterSeven.examples;

import java.security.SecureRandom;

public class RollDie {
	public static void main(String[] args){
	
		SecureRandom secureRandom = new SecureRandom();
		int[] frequency = new int[7];
		
		for (int roll= 1; roll <= 6000000; roll= roll + 1)
			++frequency[1 + secureRandom.nextInt(6)];
		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		for (int face= 1; face < frequency.length; face= face + 1)
			System.out.printf("%4d%10d%n", face,frequency[face]);
	}
}
