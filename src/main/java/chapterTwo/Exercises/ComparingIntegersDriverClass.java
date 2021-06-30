package chapterTwo.Exercises;

import java.util.Scanner;

public class ComparingIntegersDriverClass {
	
	
	public static void main(String[] args) {

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