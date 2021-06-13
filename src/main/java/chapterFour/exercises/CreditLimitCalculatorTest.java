package chapterFour.exercises;

import java.util.Scanner;

public class CreditLimitCalculatorTest {
	
	public static void main(String[] args){
		
		Scanner customerUserInput = new Scanner(System.in);
		
		CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(234563.457, 234,
				230000.56, 34.453, 45000.45);
		
		String customerDecision = "y";
		
		while (!customerDecision.equals("n")){
			
			System.out.print("Enter customer Account number: ");
			int customerAccountNumber = customerUserInput.nextInt();
			
			System.out.printf("Enter account balance at the end of the month " + customerAccountNumber + ":", customerDecision );
			int startBalance = customerUserInput.nextInt();
			
			System.out.printf("Enter total monthly charges for account " + customerAccountNumber + ": ", customerUserInput);
			int chargesTotal = customerUserInput.nextInt();
			
			
			if (creditLimitCalculator.newBalanceExceeds ())
				System.out.print("Credit limit exceed.\n");
			
			System.out.print("Calculate credit for another account? (y/n): ");
			customerDecision = customerUserInput.next();
		
		
		}
		
	}
}
