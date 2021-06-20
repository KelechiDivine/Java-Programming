package chapterTwo.Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticSmallestAndLargestTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	public void thisTestClassChecksTheSumOfThreeNumbersAndReturnsTheExpectedResult(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest= new ArithmeticSmallestAndLargest();
		
		arithmeticSmallestAndLargest.getSumClassMethod(45, 2, 4);
		
		Assertions.assertEquals(51, arithmeticSmallestAndLargest.getSum());
	}
	
	@Test
	public void thisTestClassChecksTheProductsOfThreeNumbersAndReturnsTheExpectedResult(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
		
		arithmeticSmallestAndLargest.getProductClassMethod(2, 3, 4);
		
		Assertions.assertEquals(24, arithmeticSmallestAndLargest.getProducts(), "Test is invalid!" );
	}
	
	@Test
	public void thisTestClassChecksTheAverageOfThreeNumbersAndReturnsTheExpectedResult(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest= new ArithmeticSmallestAndLargest();
	
		arithmeticSmallestAndLargest.getAverageClassMethod(2, 4, 4);
		
		Assertions.assertEquals(5, arithmeticSmallestAndLargest.getAverage(), "Average not found");
	}
	
	@Test
	public void thisIsATestThatLoopsThroughThreeNumbersAndCheckForTheLowestNumber(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
		
		arithmeticSmallestAndLargest.getSmallestClassMethod(2, 5, 7);
		
		Assertions.assertEquals(2, arithmeticSmallestAndLargest.getMinimumNumber());
	
	}
	
	@Test
	public void thisIsATestThatLoopsThroughThreeNumbersAndCheckForTheHighestNumber(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
		
		arithmeticSmallestAndLargest.getLargestClassMethod(2, 5, 9);
		
		Assertions.assertEquals(9, arithmeticSmallestAndLargest.getMaximum());
	}
	

}