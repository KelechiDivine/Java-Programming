package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplesTest {
	
	@Test
	public void thisTestClassHelpsCheckUsersInputAndCompareIfTheInputIsAMultipleOfTwoOrNot(){
		Multiples multiples = new Multiples();
		multiples.checkForMultiples(3, 4);
		Assertions.assertFalse(multiples.isMultiple);
		
	}
}