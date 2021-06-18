package chapterTwo.Exercises;

public class ArithmeticSmallestAndLargest {
	
	private int sum;
	private int products;
	private int average;
	
	public void sum(int firstNumber, int secondNumber, int thirdNumber) {
		sum= firstNumber + secondNumber + thirdNumber;
		
	}
	
	public int getSum() {
		return sum;
	}
	
	public void products(int firstNumber, int secondNumber, int thirdNumber) {
		products= firstNumber * secondNumber * thirdNumber;
	}
	
	public int getProducts() {
		return products;
	}
	
	public void average(int firstNumber, int secondNumber, int thirdNumber) {
		average= (firstNumber + secondNumber + thirdNumber) / 2;
	}
	
	public int getAverage() {
		return average;
	}
}
