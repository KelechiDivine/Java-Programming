package chapterFour.examples;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		//Set the total to zero
		int total = 0;
		
		//Set the counter to one
		int counter = 1;
		
		while (counter <= 3){
			System.out.print("Enter grade: ");
			int grade = userInput.nextInt();
			
			total = total + grade;
			counter = counter + 1;
			
		}
		
		int average = total / 3;
		System.out.printf("%nTotal of all 3 grades is %d%n", total);
		
		System.out.printf("%nAverage of all 3 grades is %d%n", average);
	}
}
