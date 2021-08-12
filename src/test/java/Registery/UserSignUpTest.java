package Registery;

import Registery.Exceptions.EmailCantBeEmptyException;
import Registery.Exceptions.EmailFieldException;
import Registery.Exceptions.OutOfLengthMobileException;
import Registery.Exceptions.YearOfBirthOutOfLengthException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserSignUpTest {

	@Test
	public void testThatEmailIsCorrect() throws EmailFieldException, EmailCantBeEmptyException {
		UserSignUp correctEmailFormat = new UserSignUp();
		correctEmailFormat.setEmail("okoroafor123@gmail.com");
		Assertions.assertEquals("okoroafor123@gmail.com", correctEmailFormat.getEmail());
	}
	
	@Test
	public void testThatEmailFieldCantBeEmpty() throws EmailFieldException, EmailCantBeEmptyException {
		UserSignUp emailFieldCantBeEmpty = new UserSignUp();
		emailFieldCantBeEmpty.setEmail("");
		Assertions.assertEquals("", emailFieldCantBeEmpty.getEmail());
	}
	
	@Test
	public void testThatEmailFieldIsInRightFormat() throws EmailFieldException, EmailCantBeEmptyException {
		UserSignUp wrongEmailFormat = new UserSignUp();
		wrongEmailFormat.setEmail("okoraforkelechi");
		Assertions.assertEquals("okoroaforkelechi", wrongEmailFormat.getEmail());
	}
	
	@Test
	public void testCorrectMobileNumberFormat() throws OutOfLengthMobileException {
		UserSignUp correctMobileFormat = new UserSignUp();
		correctMobileFormat.setMobile("+234 80 821 677 64");
		Assertions.assertEquals("+234 80 821 677 64", correctMobileFormat.getMobile());
	}
	
	@Test
	public void testThatMobileLengthDoesNotExit11() throws OutOfLengthMobileException {
		UserSignUp doesNotExitLength11 = new UserSignUp();
		doesNotExitLength11.setMobile("08082167764");
		Assertions.assertEquals("08082167764", doesNotExitLength11.getMobile());
	}
	
	@Test
	public void testThatMobileNumberExit11() throws OutOfLengthMobileException {
		UserSignUp exitLength11 = new UserSignUp();
		exitLength11.setMobile("0808216776412345");
		Assertions.assertEquals("0808216776412345", exitLength11.getMobile());
	}
	
//	@Test
//	public void testYearOfBirthLengthIsAlways4() throws YearOfBirthOutOfLengthException {
//		UserSignUp lengthIsWithinRange = new UserSignUp();
//		lengthIsWithinRange.setYearOfBirth(2004);
//		Assertions.assertEquals(2004, lengthIsWithinRange.getYearOfBirth());
//	}



}