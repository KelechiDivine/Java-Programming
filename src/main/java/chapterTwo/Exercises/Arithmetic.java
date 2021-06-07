package chapterTwo.Exercises;

import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args){
	
//		Write an application that asks the user to enter two integers, obtains them
//		from the user and prints their sum, product, difference and quotient (division).
		
		Scanner userInput = new Scanner(System.in);
		
		int userFirstNumber;
		int userSecondNumber;
		int sum;
		int products;
		int difference;
		int quotient;
		
		System.out.print("Enter first number: ");
		userFirstNumber = userInput.nextInt();
		
		
		System.out.print("Enter second number: ");
		userSecondNumber = userInput.nextInt();
		
		sum = userFirstNumber + userSecondNumber;
		
		products = userFirstNumber * userSecondNumber;
		
		difference = userFirstNumber - userSecondNumber;
		
		quotient = userFirstNumber / userSecondNumber;
		
		System.out.printf("Sum of the numbers is: %d%n", sum);
		
		System.out.printf("Products of the numbers is: %d%n", products);
		
		System.out.printf("Difference of the number is: %d%n", difference);
		
		System.out.printf("Quotient of the number is: %d%n", quotient);
		
	}
}
