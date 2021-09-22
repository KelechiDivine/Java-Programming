package chapterEleven.example;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
	
	public static int quotient(int numerator, int denominator){
		return numerator / denominator;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		
		System.out.println("Please enter a integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		System.out.printf(
				"%nResult: %d / %d = %d%n", numerator, denominator, result
		);
	}
}
