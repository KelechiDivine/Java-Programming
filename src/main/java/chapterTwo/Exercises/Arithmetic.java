package chapterTwo.Exercises;


public class Arithmetic {
	
	private int sum;
	private double division;
	private int subtraction;
	private int multiplication;
	
	
	public void getMultiplicationClassMethod(int number1, int number2) {
		
		multiplication= number1 * number2;
	}
	
	public int getMultiplication() {
		return multiplication;
	}
	
	public void getSubtractionClassMethod(int number1, int number2) {
		subtraction = number1 - number2;
	}
	
	public int getSubtraction() {
		return subtraction;
	}
	
	public void getDivisionClassMethod(float number1, float number2) {
		division = number1 / number2;
	}
	
	
	public double getDivision() {
		return division;
	}
	
	public void getSumClassMethod(int number1, int number2) {
		sum= number1 + number2;
	}
	
	public int getSum() {
		return sum;
	}
}