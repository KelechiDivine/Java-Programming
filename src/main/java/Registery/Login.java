//package Registery;
//
//import Registery.Exceptions.GeneralLoginException;
//
//public class Login {
//
//	private String email;
//	private String password;
//
//	public Login(){}
//	public Login(String email) {
//		this.email = email;
//	}
//
//	public Login(String email, String password) {
//		this.email = email;
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) throws GeneralLoginException {
//
//		if (email.contains("@gmail.com")){
//			System.out.println("Email have been saved in the database.");
//		}
//		else {
//
//			// check if email field is empty or not
//
//			if (email.isEmpty()) {
//				throw new GeneralLoginException("Email field is required");
//			}
//		}
//
//		if (!email.contains("@gmail.com")){
//			throw new GeneralLoginException("Email is not in the right format.");
//		}
//
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) throws GeneralLoginException {
//
//		if (password.isEmpty()) {
//			throw new GeneralLoginException("Password field is required");
//		}
//		this.password = password;
//	}
//}
