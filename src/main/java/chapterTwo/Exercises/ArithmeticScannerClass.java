package chapterTwo.Exercises;

import java.util.Scanner;

public class ArithmeticScannerClass {
	
	public static void main(String[] args){
		
		Arithmetic arithmetic= new Arithmetic();
		
		
//		Write an application that asks the user to enter two integers, obtains them
//		from the user and prints their sum, product, difference and quotient (division).

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = userInput.nextInt();


		System.out.print("Enter second number: ");
		int secondNumber = userInput.nextInt();
		
		
		arithmetic.division(firstNumber, secondNumber);
		arithmetic.sum(firstNumber, secondNumber);
		arithmetic.subtraction(firstNumber, secondNumber);
		arithmetic.multiplication(firstNumber, secondNumber);
		
		System.out.printf("Sum of the numbers is: %d%n", arithmetic.getSum());

		System.out.printf("Products of the numbers is: %d%n", arithmetic.getMultiplication());

		System.out.printf("Difference of the number is: %d%n", arithmetic.getSubtraction());

		System.out.printf("Quotient of the number is: %d%n", arithmetic.getDivision());
	
	}
}
