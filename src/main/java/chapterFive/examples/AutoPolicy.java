package chapterFive.examples;

public class AutoPolicy {
	
	int accountNumber;
	String makeAndModel;
	String state;
	
	
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getMakeAndModel() {
		return makeAndModel;
	}
	
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public boolean isNoFaultState(){
		
		return switch (getState()) {
			case "MA", "NJ", "NY", "PA" -> true;
			default -> false;
		};
	}
}
