package chapterNine;

public class CommissionEmployeeTest {
	
	public static void main(String[] args) {
		
		CommissionEmployee commissionEmployee = new CommissionEmployee(
				"sue","Jones", "2222222", 1000,
				.06
		);
		
		System.out.println(
				"Employee information obtained by get methods: "
		);
		
		System.out.printf("%n%s %s%n" +
				" first name is ", commissionEmployee.getFirstName());
		
		System.out.printf("%n%s %s%n" +
				" last name is ", commissionEmployee.getFirstName());
		
		System.out.printf("%n%s %s%n" +
				" social security number is ", commissionEmployee.getSocialSecurityNumber());
		
		System.out.printf("%n%s %s%n" +
				" gross is ", commissionEmployee.getGrossSales());
		
		System.out.printf("%n%s %s%n" +
				"commission rate is ", commissionEmployee.getCommissionRate());
		
		commissionEmployee.setGrossSales(5000);
		commissionEmployee.setCommissionRate(.1);
	}
}
