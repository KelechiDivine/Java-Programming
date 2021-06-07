package chapterTwo.Exercises;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
	
	public static void main(String[] args){
	
//
//		Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and
//		the number of zeros input.
		
		
		 Scanner  inputThatDeterminesWhetherAIntegerIsPositiveOrNegative = new Scanner(System.in);
		 
		 int firstUserInput;
		 int secondUserInput;
		 int thirdUserInput;
		 int fourthUserInput;
		 int fifthUserInput;
		 
		 System.out.print("Enter first integer: ");
		 firstUserInput = inputThatDeterminesWhetherAIntegerIsPositiveOrNegative.nextInt();

		 System.out.print("Enter second integer: ");
		 secondUserInput = inputThatDeterminesWhetherAIntegerIsPositiveOrNegative.nextInt();

		 System.out.print("Enter third integer: ");
		 thirdUserInput = inputThatDeterminesWhetherAIntegerIsPositiveOrNegative.nextInt();

		 System.out.print("Enter fourth integer: ");
		 fourthUserInput = inputThatDeterminesWhetherAIntegerIsPositiveOrNegative.nextInt();

		 System.out.print("Enter fifth integer: ");
		 fifthUserInput = inputThatDeterminesWhetherAIntegerIsPositiveOrNegative.nextInt();

		 System.out.print("......................................................................");
		 String result = "";

		 
		if (firstUserInput < 0)
			result = result + "\nFirst number is negative.\n";
		
		if (firstUserInput == 0)
			result = result + "\nFirst number is equals to zero\n";
		
		if (firstUserInput > 0)
			result = result + "First number is positive.\n";
		
//		Checking for second number
		if (secondUserInput < 0)
			result = result + "Second number is negative.\n";
		
		if (secondUserInput == 0)
			result = result + "Second number is equals to zero.\n";
		
		if (secondUserInput > 0)
			result = result + "Second number is positive.\n";


//		Checking for third number
		if (thirdUserInput < 0)
			result = result + "Third number is negative.\n";
		
		if (thirdUserInput == 0)
			result = result + "Third number is equals to zero.";
		
		if (thirdUserInput > 0)
			result = result + "Third number is positive.\n";


//		Checking for fourth number
		if (fourthUserInput < 0)
			result = result + "Fourth number is negative.\n";
		
		if (fourthUserInput == 0)
			result = result + "Fourth number is equals to zero.";
		
		if (fourthUserInput > 0)
			result = result + "Fourth number is positive.\n";


//		Checking for fifth number
		if (fifthUserInput < 0)
			result = result + "Fifth number is negative.\n";
		
		if (fifthUserInput == 0)
			result = result + "Fifth number is equals to zero.\n";
		
		if (fifthUserInput > 0)
			result = result + "Fifth number is positive.\n";
		
		System.out.printf("%2s%n\n ", result);
	}
}
