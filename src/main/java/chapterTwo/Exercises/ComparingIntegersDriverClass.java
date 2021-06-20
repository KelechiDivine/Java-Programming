package chapterTwo.Exercises;

import java.util.Scanner;

public class ComparingIntegersDriverClass {
	
	
	public static void main(String[] args) {

//		Write an application that asks the user to enter two integers, obtains
//		them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers
		
		
		ComparingIntegers comparingIntegers = new ComparingIntegers();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstInput = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		int secondInput = userInput.nextInt();
		
		comparingIntegers.getComparingClassMethod(firstInput, secondInput);
		comparingIntegers.getTheLargestNumberInAnUserInput(firstInput, secondInput);
		comparingIntegers.getTheSmallestNumberInAUserInput(firstInput, secondInput);
		
		System.out.printf("Is large: %d", comparingIntegers.getLarge());
		System.out.printf("\nIs small: %d", comparingIntegers.getSmall());
	}
}