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
		
//		Checking for largest number
		
		if (firstNumber > secondNumber && firstNumber > thirdNumber
		&& firstNumber > fourthNumber && firstNumber > fifthNumber)
			System.out.printf("First number is the highest: %d%n\n", firstNumber);
		
		if (secondNumber > firstNumber && secondNumber > thirdNumber
		&& secondNumber > fourthNumber && secondNumber >fifthNumber)
			System.out.printf("Second number is the highest: %d%n\n", secondNumber);
		
		if (thirdNumber > firstNumber && thirdNumber > secondNumber
		&& thirdNumber > fourthNumber && thirdNumber > fifthNumber)
			System.out.printf("Third number is the highest: %d%n\n", thirdNumber);
		
		if (fourthNumber > firstNumber && fourthNumber > secondNumber
		&& fourthNumber > thirdNumber && fourthNumber > fifthNumber)
			System.out.printf("Fourth number is the highest: %d%n\n", fourthNumber);
		
		if (fifthNumber > firstNumber && fifthNumber > secondNumber
		&& fifthNumber > thirdNumber && fifthNumber > fourthNumber)
			System.out.printf("Fifth number is highest: %d%n", fifthNumber);
		
		
//		Checking for smallest number
		
		if (firstNumber < secondNumber && firstNumber < thirdNumber
				&& firstNumber < fourthNumber && firstNumber < fifthNumber)
			System.out.printf("First number is the lowest: %d%n", firstNumber);
		
		
		if (secondNumber < firstNumber && secondNumber < thirdNumber
				&& secondNumber < fourthNumber && secondNumber < fifthNumber)
			System.out.printf("Second number is the lowest: %d%n", secondNumber);
		
		
		if (thirdNumber < firstNumber && thirdNumber < secondNumber
				&& thirdNumber < fourthNumber && thirdNumber < fifthNumber)
			System.out.printf("Third number is the lowest: %d%n", thirdNumber);
		
		
		if (fourthNumber < firstNumber && fourthNumber < secondNumber
				&& fourthNumber < thirdNumber && fourthNumber < fifthNumber)
			System.out.printf("Fourth number is the lowest: %d%n", fourthNumber);
		
		
		if (fifthNumber < firstNumber && fifthNumber < secondNumber
				&& fifthNumber < thirdNumber && fifthNumber < fourthNumber)
			System.out.printf("Fifth number is lowest: %d%n", fifthNumber);
		
	}
}
