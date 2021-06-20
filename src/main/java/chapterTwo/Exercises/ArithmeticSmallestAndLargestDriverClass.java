package chapterTwo.Exercises;

import java.util.Scanner;

public class ArithmeticSmallestAndLargestDriverClass {
	
	public static void main (String[] args){


//		Write an application that inputs three integers from the
//		user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//		shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//		representation of the average. So, if the sum of the values is 7, the average should be 2, not
//		2.3333….]
		
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest= new ArithmeticSmallestAndLargest();
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = userInput.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = userInput.nextInt();

		System.out.print("Enter third number: \n");
		int thirdNumber = userInput.nextInt();

		arithmeticSmallestAndLargest.getSumClassMethod(firstNumber, secondNumber, thirdNumber);
		arithmeticSmallestAndLargest.getProductClassMethod(firstNumber, secondNumber, thirdNumber);
		arithmeticSmallestAndLargest.getAverageClassMethod(firstNumber, secondNumber, thirdNumber);
		arithmeticSmallestAndLargest.getSmallestClassMethod(firstNumber, secondNumber, thirdNumber);
		arithmeticSmallestAndLargest.getLargestClassMethod(firstNumber, secondNumber, thirdNumber);

		System.out.printf("The sum of the numbers is: %d%n", arithmeticSmallestAndLargest.getSum());
		System.out.printf("The products of the numbers is: %d%n", arithmeticSmallestAndLargest.getProducts());
		System.out.printf("The average of the numbers is: %d%n", arithmeticSmallestAndLargest.getAverage());
		System.out.printf("The Lowest number is: %d%n", arithmeticSmallestAndLargest.getMinimumNumber());
		System.out.printf("The Highest number is: %d%n", arithmeticSmallestAndLargest.getMaximum());

	}
}
