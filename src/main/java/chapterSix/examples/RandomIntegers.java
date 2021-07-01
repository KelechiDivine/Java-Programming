package chapterSix.examples;

import java.security.SecureRandom;

public class RandomIntegers {
	
	public static void main(String[] args){
		
		SecureRandom secureRandom = new SecureRandom();
		
		for (int counter = 1; counter <= 20; counter = counter + 1){
			int face = 1 + secureRandom.nextInt(6);
			System.out.printf("%d	", face);
			
			if (counter % 5 == 0)
				System.out.println();
		}
	}
}
