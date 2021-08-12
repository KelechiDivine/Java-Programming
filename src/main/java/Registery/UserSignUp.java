package Registery;


import Registery.Exceptions.EmailCantBeEmptyException;
import Registery.Exceptions.EmailFieldException;
import Registery.Exceptions.OutOfLengthMobileException;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class UserSignUp {
	
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private String countryName;
	private String address;
	private String password;
	private int YearOfBirth;
	
	// created an empty constructor that allows us to run our code without any given arguement
	public UserSignUp(){}
	
	public UserSignUp(String firstname, String lastname,
					  String email, String mobile, String countryName,
					  String address, String password, int YearOfBirth) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.countryName = countryName;
		this.address = address;
		this.password = password;
		this.YearOfBirth = YearOfBirth;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws EmailCantBeEmptyException, EmailFieldException {
		
		// check if email contains "@gmail.com"
		
		if (email.contains("@gmail.com")){
			System.out.println("Email have been saved in the database.");
		}
		else {
			
			// check if email field is empty or not
		
			if (email.isEmpty()) {
				throw new EmailCantBeEmptyException("Email field is required");
			}
		}
		
		// check if email field doesn't contain "@gmail.com"
		
		if (!email.contains("@gmail.com")){
			throw new EmailFieldException("Email is not in the right format.");
		}
		this.email = email;
	}
	
	public String getMobile()  {
		return mobile;
	}
	
	public void setMobile(String mobile) throws OutOfLengthMobileException{
		while (mobile.length() == 11)
			System.out.println(mobile);
		
		// Just in-case the mobile format will contain "+234 ...."
		// We wanna check that the program shouldn't throw any error
		
		Optional.of(mobile.contains("+234"));
		System.out.println("This mobile number is optional in the database..");
		
		if (mobile.length() > 11){
			throw new OutOfLengthMobileException("Invalid phone number format.");
		}
		this.mobile = mobile;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getYearOfBirth() {
		return YearOfBirth;
	}
	
	public void setYearOfBirth(int YearOfBirth) {
		this.YearOfBirth = YearOfBirth;
	}
}
