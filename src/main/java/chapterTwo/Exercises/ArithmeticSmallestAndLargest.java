package chapterTwo.Exercises;

public class ArithmeticSmallestAndLargest {
	
	private int sum;
	private int products;
	private int average;
	int smallestNumber = Integer.MAX_VALUE;
	int largestNumber = Integer.MIN_VALUE;
	
	
	public void getSumClassMethod(int firstNumber, int secondNumber, int thirdNumber) {
		sum= firstNumber + secondNumber + thirdNumber;
		
	}
	
	public int getSum() {
		return sum;
	}
	
	public void getProductClassMethod(int firstNumber, int secondNumber, int thirdNumber) {
		products= firstNumber * secondNumber * thirdNumber;
	}
	
	public int getProducts() {
		return products;
	}
	
	public void getAverageClassMethod(int firstNumber, int secondNumber, int thirdNumber) {
		average= (firstNumber + secondNumber + thirdNumber) / 2;
	}
	
	public int getAverage() {
		return average;
	}
	
	public void getSmallestClassMethod(int number1, int number2, int number3) {
		
		if (number1 < smallestNumber)
			smallestNumber = number1;
		
		if (number2 < smallestNumber)
			smallestNumber = number2;
		
		if (number3 < smallestNumber)
			smallestNumber = number3;
		
	}
	
	public int getMinimumNumber() {
		return smallestNumber;
	}
	
	public void getLargestClassMethod(int number1, int number2, int number3) {
		
		
		if (number1 > largestNumber)
			largestNumber = number1;
		
		if (number2 > largestNumber)
			largestNumber = number2;
		
		if (number3 > largestNumber)
			largestNumber = number3;
		
		
	}
	
	public int getMaximum() {
		return largestNumber;
	}
}
