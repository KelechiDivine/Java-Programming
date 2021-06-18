package unitTesting;

public class SimpleTestClass {
	
	
	private int sum;
	
	public void add(int firstNumber, int secondNumber) {
		sum = firstNumber + secondNumber;
	}
	
	public int getSum() {
		return sum;
	}
	
	private int division;
	
	public void divide(int firstNumberToDivide, int secondNumberToDivide) {
		division= firstNumberToDivide / secondNumberToDivide;
	}
	
	public int getDivision() {
		return division;
	}
}
