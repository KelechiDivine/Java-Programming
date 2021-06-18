package unitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleTestClassTest {
	
	@Test
	public void addTwoNumbersTest(){
		//given
		SimpleTestClass simpleTestClass = new SimpleTestClass();
		//when
		int firstNumber = 12;
		int secondNumber = 11;
		simpleTestClass.add(firstNumber, secondNumber);
		//assert
		assertEquals(23, simpleTestClass.getSum());
	}
	
	@Test
	public void dividingTwoNumbers(){
		
		SimpleTestClass simpleTestClass= new SimpleTestClass();
		
		int firstNumberToDivide= 4;
		int secondNumberToDivide= 2;
		
		simpleTestClass.divide(firstNumberToDivide, secondNumberToDivide);
		assertEquals(2, simpleTestClass.getDivision());
	}
}