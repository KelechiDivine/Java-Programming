package chapterTwo.Exercises;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
	
	public static void main (String[] args){


//		Write an application that inputs three integers from the
//		user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//		shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//		representation of the average. So, if the sum of the values is 7, the average should be 2, not
//		2.3333….]
		
		
		Scanner userInput = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int sum;
		int products;
		int average;
		
		System.out.print("Enter first number: ");
		firstNumber = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		secondNumber = userInput.nextInt();
		
		System.out.print("Enter third number: ");
		thirdNumber = userInput.nextInt();
		
		sum = firstNumber + secondNumber + thirdNumber;
		
		products = firstNumber * secondNumber * thirdNumber;
		
		average = sum / 2;
		
//		Checking for the largest number
		
		if(firstNumber > secondNumber && firstNumber > thirdNumber)
			System.out.println("First number is the highest number\n");
		
		if(secondNumber > firstNumber && secondNumber > thirdNumber)
			System.out.println("Second number is the highest number\n");
		
		if(thirdNumber > firstNumber && thirdNumber > secondNumber)
			System.out.println("Third number is the highest number\n");
		
//		Checking for the smallest number
		
		if(firstNumber < secondNumber && firstNumber < thirdNumber)
			System.out.println("First number is the lowest integer ");
		
		
		if(secondNumber < firstNumber && secondNumber < thirdNumber)
			System.out.println("Second number is the lowest integer");
		
		
		if(thirdNumber < firstNumber && thirdNumber < secondNumber)
			System.out.println("Third number is the lowest integer. ");
			
			
		System.out.printf("The sum of the numbers is =>%d%n", sum);
		System.out.printf("The products of the numbers is =>%d%n", products);
		System.out.printf("The average of the numbers is =>%d%n", average);
	
	}
}
