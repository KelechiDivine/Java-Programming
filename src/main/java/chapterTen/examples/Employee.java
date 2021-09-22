package chapterTen.examples;

public abstract class Employee {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	
	public Employee(String firstName,
					String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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
	
	@Override
	public String toString() {
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", socialSecurityNumber='" + socialSecurityNumber + '\'' +
				'}';
	}
	
	public abstract double earnings();
}
