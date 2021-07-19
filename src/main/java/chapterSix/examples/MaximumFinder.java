package chapterSix.examples;

import java.util.*;

public class MaximumFinder {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter three floating-point values by spaces: ");
		double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
		double numberThree = scanner.nextDouble();
		double result = maximum(numberOne, numberTwo, numberThree);
		
		System.out.print("\n Maximum is: " + result);
	}
	
	private static double maximum(double numberOne, double numberTwo, double numberThree) {
		
		double maximumValue = numberOne;
		
		if (numberTwo > maximumValue)
			maximumValue = numberTwo;
		
		if (numberThree > maximumValue)
			maximumValue = numberThree;
		return maximumValue;
	}
}
