package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplesTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void thisTestClassHelpsCheckUsersInputAndCompareIfTheInputIsAMultipleOfTwoOrNot(){
		Multiples multiples = new Multiples();
		multiples.checkForMultiples(3, 4);
		Assertions.assertFalse(multiples.isMultiple);
		
	}
}