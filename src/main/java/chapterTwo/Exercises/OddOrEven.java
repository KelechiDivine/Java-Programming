package chapterTwo.Exercises;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main (String[] args){
		
		Scanner applicationThatReadsInputs = new Scanner(System.in);
		
		int firstUserNumber;
		int secondUserNumber;
		int thirdUserNumber;
		int fourthUserNumber;
		
		System.out.print("Enter your first number: ");
		firstUserNumber = applicationThatReadsInputs.nextInt();
		
		System.out.print("Enter your second number: ");
		secondUserNumber = applicationThatReadsInputs.nextInt();
		
		System.out.print("Enter your third number: ");
		thirdUserNumber = applicationThatReadsInputs.nextInt();
		
		System.out.print("Enter your fourth number: \n");
		fourthUserNumber = applicationThatReadsInputs.nextInt();
		
//		Checking if user input number is even and odd number for each user input for first number
		
		if (firstUserNumber % 2 == 0)
			System.out.printf("First number is an even number: %d%n\n", firstUserNumber);
		
		if (firstUserNumber % 2 == 1)
			System.out.printf("First number is an odd number: %d%n\n", firstUserNumber);





//		Checking if user input number is even and odd number for each user input for second number
		
		if(secondUserNumber % 2 == 0)
			System.out.printf("Second number is an even number: %d%n\n", secondUserNumber);
		
		if(secondUserNumber % 2 == 1)
			System.out.printf("Second number is an odd number: %d%n\n", secondUserNumber);





//		Checking if user input number is even and odd number for each user input for third number
		
		if(thirdUserNumber % 2 == 0)
			System.out.printf("Third number is an even number: %d%n\n",thirdUserNumber);
		
		if(thirdUserNumber % 2 == 1)
			System.out.printf("Third number is an odd number: %d%n\n", thirdUserNumber);






//		Checking if user input number is even and odd number for each user input for fourth number
		
		if(fourthUserNumber % 2 == 0)
			System.out.printf("Fourth number is an even number: %d%n\n", fourthUserNumber);
		
		if (fourthUserNumber % 2 == 1)
			System.out.printf("Fourth number is an odd number: %d%n", fourthUserNumber);
	
	}
}
