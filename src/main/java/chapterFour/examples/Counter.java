package chapterFour.examples;

import java.util.Scanner;

public class Counter {
	
	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		int total = 0;
		
		int gradeCounter = 1;
		
		System.out.print("Enter grade: ");
		int grade = userInput.nextInt();
		
		while (grade != 0) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = userInput.nextInt();
			
			if (gradeCounter != 0) {
				double average = (double) total / gradeCounter;
				
				System.out.printf("%nTotal of the %d grades entered is %d%n",
						gradeCounter, total);
				
				System.out.printf("Class average is %.2f%n", average);
			} else
				System.out.print("No grade were entered.");
		}
	
	}
		
}

