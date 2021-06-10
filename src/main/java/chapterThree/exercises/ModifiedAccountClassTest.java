package chapterThree.exercises;

import java.util.Scanner;

public class ModifiedAccountClassTest {

//	provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
//	the Account’s balance. If it does, the balance should be left unchanged and the method should print
//	a message indicating "Withdrawal amount exceeded account balance."

	public static void main(String[] args) {
		
		
		ModifiedAccountClass modifiedAccountClass = new ModifiedAccountClass( 1000000);
		
		Scanner userAmountToWithdraw = new Scanner(System.in);
		
		System.out.print("Enter amount to withdraw: ");
		double withdrawInput = userAmountToWithdraw.nextInt();
		
		if (withdrawInput > modifiedAccountClass.balance)
			System.out.print("Withdrawal amount exceeded account balance");
		
		if (withdrawInput < modifiedAccountClass.balance)
			System.out.printf("Withdrawal successful.\n%nAccount balance is: %.2f %n%n", modifiedAccountClass.balance - withdrawInput);
		
		if (withdrawInput == modifiedAccountClass.balance)
			System.out.print("Balance can't be null.");
		
		
		
		
		
	}
	
}
