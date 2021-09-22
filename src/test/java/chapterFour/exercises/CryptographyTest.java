package chapterFour.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CryptographyTest {
	
	
	private Cryptography cryptography;
	
	@BeforeEach
	public void setUp(){
		cryptography = new Cryptography();
	}
	
	@Test
	public void assertCryptographyExists(){
		cryptography = new Cryptography();
		Assertions.assertNotNull(cryptography);
	}
	
	@Test
	public void replaceEachDigitWithTheResultOfAddingSevenToTheDigit(){
		cryptography.fourNumbersEncrypting(1, 4, 2, 6);
		Assertions.assertNotNull(cryptography);
	}
}