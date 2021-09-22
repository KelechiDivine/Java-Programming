package chapterNine.example;

import chapterTen.examples.Employee;

public class CommissionEmployee extends Employee {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final double grossSales;
	private final double commissionRate;
	
	public CommissionEmployee(String firstName,
							  String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0"
			);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0"
			);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
//	public double earning(){
//		return commissionRate * grossSales;
//	}
	
	@Override
	public String toString() {
		return String.format(
				"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate
		);
	}
	
	@Override
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	public void setGrossSales(int i) {
	
	}
	
	public void setCommissionRate(double v) {
	}
}
