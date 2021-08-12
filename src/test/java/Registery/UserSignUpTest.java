package Registery;

import Registery.Exceptions.EmailCantBeEmptyException;
import Registery.Exceptions.EmailFieldException;
import Registery.Exceptions.OutOfLengthMobileException;
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

}