package hackerRank;

import java.util.Scanner;

public class OddAndEven {
	
	/**
	 * Given an integer, n, perform the following conditional actions:
	 *
	 * If n is odd, print Weird
	 * If n is even and in the inclusive range of 2 to 5, print Not Weird
	 * If n is even and in the inclusive range of 6 to 20, print Weird
	 * If n is even and greater than 20, print Not Weird
	 * Complete the stub code provided in your editor to print whether or not n is weird.**/

	
	public void init(int index){
		if (index % 2 == 1)
			System.out.println("Weird");
		
		if (index >= 2 && index <= 5)
			System.out.println("Not weird!!");
		
		if (index >= 6 && index <= 20)
			System.out.println("Weird");
		
		else
			System.out.println("Not Weird...");
		
		if (index > 20)
			System.out.println("Weird...");
	}
	
}
