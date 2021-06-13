package chapterFour.exercises;

public class CreditLimitCalculator {
	
	double accountNumber;
	double balanceAtTheEndOfTheMonth;
	double totalOfAllItemsCharged;
	double totalOfAllCreditsApplied;
	double allowedCreditLimit;
	
	public CreditLimitCalculator(double accountNumber, double balanceAtTheEndOfTheMonth, double totalOfAllItemsCharged,
								 double totalOfAllCreditsApplied, double allowedCreditLimit) {
		this.accountNumber = accountNumber;
		this.balanceAtTheEndOfTheMonth = balanceAtTheEndOfTheMonth;
		this.totalOfAllItemsCharged = totalOfAllItemsCharged;
		this.totalOfAllCreditsApplied = totalOfAllCreditsApplied;
		this.allowedCreditLimit = allowedCreditLimit;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalanceAtTheEndOfTheMonth() {
		return balanceAtTheEndOfTheMonth;
	}
	
	public void setBalanceAtTheEndOfTheMonth(int balanceAtTheEndOfTheMonth) {
		this.balanceAtTheEndOfTheMonth = balanceAtTheEndOfTheMonth;
	}
	
	public double getTotalOfAllItemsCharged() {
		return totalOfAllItemsCharged;
	}
	
	public void setTotalOfAllItemsCharged(int totalOfAllItemsCharged) {
		this.totalOfAllItemsCharged = totalOfAllItemsCharged;
	}
	
	public double getTotalOfAllCreditsApplied() {
		return totalOfAllCreditsApplied;
	}
	
	public void setTotalOfAllCreditsApplied(int totalOfAllCreditsApplied) {
		this.totalOfAllCreditsApplied = totalOfAllCreditsApplied;
	}
	
	public double getAllowedCreditLimit() {
		return allowedCreditLimit;
	}
	
	public void setAllowedCreditLimit(int allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}
	
//	The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits),
	
	public double customerGetNewBalance(){
	
		return getBalanceAtTheEndOfTheMonth() - getTotalOfAllItemsCharged() + getTotalOfAllCreditsApplied();
	}
	
//	display the new balance and determine whether the new balance exceeds the
//	customer’s credit limit.
	
	public boolean newBalanceExceeds(){
		return !(getBalanceAtTheEndOfTheMonth() > getAllowedCreditLimit());
		
	}
}
