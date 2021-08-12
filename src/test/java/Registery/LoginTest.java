package Registery;

import Registery.Exceptions.GeneralLoginException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
	
	@Test
	public void testAUserCanLoginWithEmail() throws GeneralLoginException {
		Login loginWithEmail = new Login();
		loginWithEmail.setEmail("okoroaforkelechi123@gmail.com");
		Assertions.assertEquals("okoroaforkelechi123@gmail.com", loginWithEmail.getEmail());
	}
	
	@Test
	public void loginWithAWrongEmailFormat() throws GeneralLoginException {
		Login loginWithAWrongEmailFormat = new Login();
		loginWithAWrongEmailFormat.setEmail("okoroaforkelechi");
		Assertions.assertEquals("okoroaforkelechi", loginWithAWrongEmailFormat.getEmail());
	}
	
}