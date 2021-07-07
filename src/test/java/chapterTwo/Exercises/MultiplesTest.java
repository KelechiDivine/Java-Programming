package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplesTest {
	
	@Test
	public void testIsMultiple(){
		Multiples multiples = new Multiples();
		multiples.checkForMultiples(2, 4);
		Assertions.assertFalse(multiples.isMultiple);
		
	}
	
	@Test
	public void testIsNotMultiple(){
		Multiples multiplesTwo = new Multiples();
		multiplesTwo.isNotMultiple(2, 5);
		Assertions.assertTrue(multiplesTwo.getNotMultiple);
	}
}