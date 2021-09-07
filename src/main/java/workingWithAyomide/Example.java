package workingWithAyomide;

public class Example {
	
	int sum;
	
	public void addingTwoNumbers(int firstNumber, int secondNumber) {
		sum = firstNumber + secondNumber;
		if (firstNumber + secondNumber == sum) {
			System.out.println("The sum is " + sum);
		}
	}
	
	public int getSumResult(){
		return sum;
	}
}
