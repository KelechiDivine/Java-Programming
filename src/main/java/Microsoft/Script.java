package Microsoft;

public class Script {

	public Script(){
	}
	
	public boolean returnTrueIfSumOfTwoNumbersIs50(int firstNumber, int secondNumber){
		if (firstNumber + secondNumber == 50){
			System.out.printf("The sum of %d and %d is 50", firstNumber, secondNumber);
		}
		
		if (firstNumber + secondNumber != 50){
			System.out.printf("The sum of %d and %d is not 50", firstNumber, secondNumber);
		}
		return true;
	}
	
	public boolean returnTrueIfFirstNumberIs50(int firstNumber){
		
		if (firstNumber == 50){
			System.out.printf("The first number is %d.", firstNumber);
		}
		if (firstNumber != 50){
			System.out.println("The first number is not 50.");
		}
		return true;
	}
	
	public boolean returnTrueIfSecondNumberIs50(int secondNumber){
		
		if (secondNumber == 50){
			System.out.printf("Second number is %d.", secondNumber);
		}
		
		if (secondNumber != 50){
			System.out.println("The second number is not 50.");
		}
		return true;
	}
}
