package chapterNine;

public class CommissionEmployee extends Object{
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final double grossSales;
	private final String commissionRate;
	
	public CommissionEmployee(String firstName,
							  String lastName, String socialSecurityNumber, double grossSales, String commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
}
