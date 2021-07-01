package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComparingIntegersTest {
	
	@Test
	public void thisTestClassHelpsCompareIfTwoIntegersAreEqual(){
		ComparingIntegers comparingIntegers = new ComparingIntegers();
		comparingIntegers.getComparingClassMethod(3, 3);
		Assertions.assertEquals(3, comparingIntegers.getCompared(), "unable to compare" );
	}
	
	@Test
	public void thisTestClassHelpsCompareTheLargestNumberInAnUserInput(){
		ComparingIntegers comparingIntegers = new ComparingIntegers();
		comparingIntegers.getTheLargestNumberInAnUserInput(2, 5);
		Assertions.assertEquals(5, comparingIntegers.getLarge(), "Largest number not found");
	}
	
	@Test
	public void thisTestClassHelpsCompareTheSmallestNumberInAnUserInput(){
		ComparingIntegers comparingIntegers = new ComparingIntegers();
		comparingIntegers.getTheSmallestNumberInAUserInput(4, 7);
		Assertions.assertEquals(4, comparingIntegers.getSmall(), "Smallest number not found");
	}
}