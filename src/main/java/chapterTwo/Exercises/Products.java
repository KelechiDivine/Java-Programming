package chapterTwo.Exercises;


//	Using the statements you wrote in Exercise 2.5, write a complete program that calculates
//	and prints the product of three integers.

import java.util.Scanner;

public class Products {
	
	public static void main (String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int results;
		
		System.out.print("Enter first number: ");
		x = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		y = userInput.nextInt();
		
		System.out.print("Enter third number: ");
		z = userInput.nextInt();
		
		
		results = x * y * z;
		
		System.out.printf("Products is %d%n", results);
	}
	
}
