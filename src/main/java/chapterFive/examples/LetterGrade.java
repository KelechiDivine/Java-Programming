package chapterFive.examples;

import java.util.Scanner;

public class LetterGrade {
	
	public static void main(String[] args){
	
		int total = 0;
		int gradeCounter = 0;
		int firstCount = 0;
		int secondCount = 0;
		int thirdCount = 0;
		int fourthCount = 0;
		int fifthCount = 0;
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n %s%n %s%n", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		while (userInput.hasNext()){
			int grade = userInput.nextInt();
			
			total = total + grade;
			
			gradeCounter = gradeCounter + 1;
			
			switch (grade / 10) {
				case 9, 10 -> firstCount = firstCount + 1;
				case 8 -> secondCount = secondCount + 1;
				case 7 -> thirdCount = thirdCount + 1;
				case 6 -> fourthCount = fourthCount + 1;

				default -> fifthCount = fifthCount + 1;
				
			}
			
		}
		
		System.out.printf("%nGrade Report: %n");
		
		if (gradeCounter != 0){
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			
			System.out.printf("Class average is %.2f%n", average);
			
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
					"A:	", firstCount,
					"B:	", secondCount,
					"C:	", thirdCount,
					"D: ", fourthCount,
					"F: ", fifthCount);
		}
		
		else
			System.out.println("No grades were entered");
	}
}
