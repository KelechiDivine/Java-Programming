package workingWithAyomide;

public class Example {
	
	int sum;
	
	public void receiveTwoNumbers(int firstNumber, int secondNumber) {
		sum = firstNumber + secondNumber;
		if (firstNumber + secondNumber == sum) {
			System.out.println("The sum is " + sum);
		}
	}
	
	public int getReceivedNumberResult(){
		return sum;
	}
}
