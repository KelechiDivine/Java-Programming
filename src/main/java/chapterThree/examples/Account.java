package chapterThree.examples;

public class Account {


//	Instance variable are always declared inside the class
	
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0)
		this.balance = balance;
	}
	
	public void deposit(double depositAmount){
	
		if (depositAmount > 0.0)
			balance = balance  + depositAmount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}


