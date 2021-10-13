package Microsoft;

public class PositiveAndNegativeNumbers {
	
	public boolean checkIfTwoNumbersArePositive(int firstNumber, int secondNumber){
		if (firstNumber >= 0 && secondNumber >=0){
			System.out.printf("%d and %d are both positive numbers.", firstNumber, secondNumber);
		}
		
		if (firstNumber > 0){
			System.out.printf("%d is a positive number.", firstNumber);
		}
		
		if (secondNumber > 0){
			System.out.printf("%d is a positive number.", secondNumber);
		}
		return true;
	}
	
	public boolean checkIfTwoNumbersAreNegative(int firstNumber, int secondNumber){
		if (firstNumber < 0 && secondNumber < 0){
			System.out.printf("%d and %d are both negative numbers.", firstNumber, secondNumber);
		}
		
		if (firstNumber < 0){
			System.out.printf("%d is a negative number.", firstNumber);
		}
		
		if (secondNumber < 0){
			System.out.printf("%d is a negative number.", secondNumber);
		}
		return true;
	}
	
	public boolean checkIfFirstNumberIsPositive(int firstNumber){
		if (firstNumber >= 0){
			System.out.printf("%d is a positive number.", firstNumber);
		}
		return true;
	}
	
	public boolean checkIfFirstNumberIsNegative(int firstNumber){
		if (firstNumber < 0){
			System.out.printf("%d is a negative number.", firstNumber);
		}
		return true;
	}
	
	public boolean checkIfSecondNumberIsPositive(int secondNumber){
		if (secondNumber >= 0){
			System.out.printf("%d is a positive number.", secondNumber);
		}
		return true;
	}
	
	public boolean checkIfSecondNumberIsNegative(int secondNumber){
		if (secondNumber < 0 ){
			System.out.printf("%d is a negative number.", secondNumber);
		}
		return true;
	}
}
