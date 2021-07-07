package chapterThree.examples;

import java.util.Scanner;

public class AccountTestClass {

	public static void main(String[] args){
		
		Account account1 = new Account("Victoria", 50.00);
		Account account2 = new Account("Adamma",	 456.77);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(),
				account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),
				account2.getBalance());
		
		Scanner userAccountInput = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = userAccountInput.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $ %.2f  %n", account1.getName(), account1.getBalance());
		
		System.out.printf("%s balance: $ %.2f  %n%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = userAccountInput.nextDouble();
		
		System.out.printf("%nadding  %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $ %.2f  %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $ %.2f  %n%n", account2.getName(), account2.getBalance());
		
		double newAccount = depositAmount;
		System.out.print(newAccount);
	}
}
