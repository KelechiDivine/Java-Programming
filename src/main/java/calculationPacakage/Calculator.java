package calculationPacakage;

public class Calculator {
	
	int sum;
	int minus;
	int multiplication;
	int division;
	
	public void additionTwoNumbers(int firstNumber, int secondNumber){
		sum = firstNumber + secondNumber;
	}
	
	public int getSumResult() {
		return sum;
	}
	
	public void subtractingTwoNumbers(int firstNumber, int secondNumber){
		minus = firstNumber - secondNumber;
	}
	
	public int getMinusResult() {
		return minus;
	}
	
	public void multiplyingTwoNumbers(int firstNumber, int secondNumber){
		multiplication = firstNumber * secondNumber;
	}
	
	public int getMultiplyResult() {
		return multiplication;
	}
	
	public void dividingTwoNumbers(int firstNumber, int secondNumber){
		division = firstNumber / secondNumber;
	}
	
	public int getDivisionResult() {
		return division;
	}
}
