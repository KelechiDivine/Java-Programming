package chapterTwo.Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegersTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	public void comparingTwoNumbersTogether(){
		
		ComparingIntegers comparingIntegers = new ComparingIntegers();
		
		int firstNumber = 16;
		int secondNumber= 16;
		comparingIntegers.comparing(firstNumber, secondNumber);
		
		Assertions.assertEquals(secondNumber, comparingIntegers.getCompared(), "unable to compare" );
	}
}