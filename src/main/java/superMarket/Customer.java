package superMarket;

public class Customer {
	
	private int age;
	private String emailAddress;
	private String name;
	private String password;
	private String phoneNumber;
	
	public Customer(int age, String emailAddress, String name,
					String password, String phoneNumber) {
		this.age = age;
		this.emailAddress = emailAddress;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
}
