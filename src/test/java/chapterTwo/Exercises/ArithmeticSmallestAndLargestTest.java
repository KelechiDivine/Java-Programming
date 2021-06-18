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
	public void checkingSumThreeNumbers(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest= new ArithmeticSmallestAndLargest();
		
		int firstNumber= 2;
		int secondNumber= 4;
		int thirdNumber= 1;
		
		arithmeticSmallestAndLargest.sum(firstNumber, secondNumber, thirdNumber);
		Assertions.assertEquals(7, arithmeticSmallestAndLargest.getSum());
	}
	
	@Test
	public void checkingProductForThreeNumber(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
		
		int firstNumber= 3;
		int secondNumber= 4;
		int thirdNumber= 1;
		
		arithmeticSmallestAndLargest.products(firstNumber, secondNumber, thirdNumber);
		Assertions.assertEquals(12, arithmeticSmallestAndLargest.getProducts(), "Test is invalid!" );
	}
	
	@Test
	public void checkingAverageForThreeNumbers(){
		
		ArithmeticSmallestAndLargest arithmeticSmallestAndLargest= new ArithmeticSmallestAndLargest();
		
		int firstNumber= 2;
		int secondNumber= 3;
		int thirdNumber= 1;
		
		arithmeticSmallestAndLargest.average(firstNumber, secondNumber, thirdNumber);
//		System.out.println("Test passed.");
		Assertions.assertEquals(3, arithmeticSmallestAndLargest.getAverage(), "Average not found");
	}

}