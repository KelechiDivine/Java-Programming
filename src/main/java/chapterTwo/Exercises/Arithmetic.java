package chapterTwo.Exercises;


public class Arithmetic {
	
	private int sum;
	private int division;
	private int subtraction;
	private int multiplication;
	
	public void sum(int firstNumber, int secondNumber) {
		sum = firstNumber + secondNumber;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void division(int firstNumber, int secondNumber) {
		division = firstNumber / secondNumber;
	}
	
	public int getDivision() {
		return division;
	}
	
	public void subtraction(int firstNumber, int secondNumber) {
		subtraction = firstNumber - secondNumber;
	}
	
	public int getSubtraction() {
		return subtraction;
	}
	
	public void multiplication(int firstNumber, int secondNumber) {
		multiplication = firstNumber * secondNumber;
	}
	
	public int getMultiplication() {
		return multiplication;
	}
	
}