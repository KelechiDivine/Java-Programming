package chapterTwo.Exercises;

import java.util.Scanner;

public class Multiples {
	
	public static void main(String[] args){
//
//		Write an application that reads two integers, determines whether the first is a
//		multiple of the second and prints the result. [Hint: Use the remainder operator.]
	
	
		Scanner multiplesOfTwoInteger = new Scanner(System.in);
		
		
		int firstInteger;
		int secondInteger;
		
		
		System.out.print("Enter first number: ");
		firstInteger = multiplesOfTwoInteger.nextInt();
		
		System.out.print("Enter second number: ");
		secondInteger = multiplesOfTwoInteger.nextInt();
		
		
		if (secondInteger % firstInteger == 0)
			System.out.printf("First number is a multiple of the second number: %d%n\n", firstInteger );
		
		// if first number if greater than second number
		
		
		if (firstInteger % secondInteger == 1)
			System.out.print("null");
		
		if (secondInteger % firstInteger == 1)
			System.out.printf("First number is not multiple of the second number: %d%n\n", firstInteger );
		
		
	}
}
