package chapterTwo.Exercises;

import java.util.Scanner;

public class MultiplesDriverClass {
	
	public static void main(String[] args){
		
		
		Multiples multiples = new Multiples();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a first number: ");
		int numberOne = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		int numberTwo = scanner.nextInt();
		
		multiples.checkForMultiples(numberOne, numberTwo);
		multiples.isNotMultiple(numberOne, numberTwo);
		
	}
}
