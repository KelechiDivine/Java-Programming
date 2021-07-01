package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTest {
	
	@Test
	public void thisTestClassChecksTheSumOfArithmeticAndItWillPassIfTheMethodLogicIsEqualToTheExpectedResultInTheTestClass(){
		Arithmetic arithmetic= new Arithmetic();
		arithmetic.getSumClassMethod(4, 7);
		Assertions.assertEquals(11, arithmetic.getSum(), "sum not found.");
	}
	
	@Test
	public void thisTestClassChecksTheDivisionOfArithmeticAndItWillPassIfTheMethodLogicIsEqualToTheExpectedResultInTheTestClass(){
		Arithmetic arithmetic= new Arithmetic();
		arithmetic.getDivisionClassMethod(3, 6);
		Assertions.assertEquals(0.5, arithmetic.getDivision(), "number division is null.");
	}
	
	@Test
	public void thisTestClassChecksTheSubtractionOfArithmeticAndItWillPassIfTheMethodLogicIsEqualToTheExpectedResultInTheTestClass(){
		Arithmetic arithmetic= new Arithmetic();
		arithmetic.getSubtractionClassMethod(2, 3);
		Assertions.assertEquals(-1, arithmetic.getSubtraction(), "subtraction error.");
	}
	
	@Test
	public void thisTestClassChecksTheMultiplicationOfArithmeticAndItWillPassIfTheMethodLogicIsEqualToTheExpectedResultInTheTestClass(){
		Arithmetic arithmetic= new Arithmetic();
		arithmetic.getMultiplicationClassMethod(2, 3);
		Assertions.assertEquals(6, arithmetic.getMultiplication(), "multiplication error");
		
	}
}