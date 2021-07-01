package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestAndSmallestIntegersTest {
	
	@Test
	public void thisIsATestThatLoopsThroughFiveNumbersAndCheckForTheHighestNumber(){
		LargestAndSmallestIntegers largestAndSmallestIntegers  = new LargestAndSmallestIntegers();
		largestAndSmallestIntegers.largestNumberMethod(2, 5, 6, 3, 9);
		Assertions.assertEquals(9, largestAndSmallestIntegers.getTheLargestNumber(), "Largest number not found.");
	}
	
	
	@Test
	public void thisIsATestThatLoopsThroughFiveNumbersAndCheckForTheLowestNumber(){
		LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
		largestAndSmallestIntegers.smallestNumberMethod(2, 4, 6, 7, 9);
		Assertions.assertEquals(2, largestAndSmallestIntegers.getSmallestNumber(), "Smallest number not found.");
	}
}