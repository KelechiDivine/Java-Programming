package chapterTwo.Exercises;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
	
	public static void main (String[] args){
	
	
//		Write an application that reads five integers and determines
//		and prints the largest and smallest integers in the group. Use only the programming techniques you
//		learned in this chapter.
	
		
		Scanner userInput = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int fifthNumber;
		
		
		System.out.print("Enter first number: ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		secondNumber = userInput.nextInt();
		
		System.out.print("Enter third number: ");
		thirdNumber = userInput.nextInt();
		
		System.out.print("Enter fourth number: ");
		fourthNumber = userInput.nextInt();
		
		System.out.print("Enter the fifth number: ");
		fifthNumber = userInput.nextInt();
		
		int minimum = firstNumber;
		
//		Checking for largest number
		
		if (secondNumber < minimum)
			minimum = secondNumber;
			System.out.printf("Second number is the smallest: %d%n\n", minimum);

		if (thirdNumber < secondNumber)
			secondNumber = thirdNumber;
			System.out.printf("Third number is the smallest: %d%n\n", secondNumber);
//
//		if (fourthNumber < minimum)
//			System.out.printf("Fourth number is the smallest: %d%n\n", fourthNumber);
//
//		if (fifthNumber < minimum)
//			System.out.printf("Fifth number is the smallest: %d%n\n", fifthNumber);
//
////		if ()
////			System.out.printf("Fifth number is highest: %d%n", fifthNumber);
//
//		int maximumNumber = firstNumber;
//
//		if (secondNumber > maximumNumber)
//			System.out.printf("Second number is the highest: %d%n", secondNumber);
//
//		if (thirdNumber > maximumNumber)
//			System.out.printf("Third number is the highest: %d%n", thirdNumber);
//
//		if (fourthNumber > maximumNumber)
//			System.out.printf("Second number is the highest: %d%n", secondNumber);
//		if (secondNumber > maximumNumber)
//			System.out.printf("Second number is the highest: %d%n", secondNumber);
//		if (secondNumber > maximumNumber)
//			System.out.printf("Second number is the highest: %d%n", secondNumber);
//
	}
}
