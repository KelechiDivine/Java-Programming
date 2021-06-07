package chapterTwo.Exercises;

import java.util.Scanner;

public class ComparingIntegers {
	
	public static void main(String[] args){
		
//		Write an application that asks the user to enter two integers, obtains
//		them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers
		
		
		Scanner userInput = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		
		System.out.print("Enter first number: ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		secondNumber = userInput.nextInt();
		
//		Checking if number is equal
		
		if (firstNumber == secondNumber)
			System.out.print("Number is equal.");
		
//		Checking if number is lesser than each other
		
		if (firstNumber < secondNumber)
			System.out.printf("First number too low %d%n", firstNumber);
		
//		Checking if number is greater than the other
		
		if (firstNumber > secondNumber)
			System.out.printf("Second number too low %d%n", secondNumber);
		
		
	
	
	}
}
