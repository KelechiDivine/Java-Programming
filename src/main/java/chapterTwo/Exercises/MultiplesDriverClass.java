package chapterTwo.Exercises;

import java.util.Scanner;

public class MultiplesDriverClass {
	
	public static void main(String[] args){
		
		
		Multiples multiples = new Multiples();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a first number: ");
		int ifUserEntersFirstNumber = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		int ifUserEntersSecondNumber = scanner.nextInt();
		
		multiples.checkForMultiples(ifUserEntersFirstNumber, ifUserEntersSecondNumber);
		
	}
}
