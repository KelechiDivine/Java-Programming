package chapterTwo.Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void sumOfArithmetic(){
		
		Arithmetic arithmetic= new Arithmetic();
		
		int firstNumber= 2;
		int secondNumber= 3;
		
		arithmetic.sum(firstNumber, secondNumber);
		assertEquals(5, arithmetic.getSum(), "sum not found.");
		
	}
	
	@Test
	public void divisionOfArithmetic(){
		
		Arithmetic arithmetic= new Arithmetic();
		
		int firstNumber= 4;
		int secondNumber= 2;
		
		arithmetic.division(firstNumber, secondNumber);
		assertEquals(2, arithmetic.getDivision(), "number division is null.");
	}
	
	@Test
	public void subtractionOfArithmetic(){
		
		Arithmetic arithmetic= new Arithmetic();
		
		int firstNumber= 5;
		int secondNumber= 3;
		
		arithmetic.subtraction(firstNumber, secondNumber);
		assertEquals(2, arithmetic.getSubtraction(), "subtraction error.");
	}
	
	@Test
	public void multiplicationOfArithmetic(){
		
		Arithmetic arithmetic= new Arithmetic();
		
		int firstNumber= 3;
		int secondNumber= 3;
		
		arithmetic.multiplication(firstNumber, secondNumber);
		assertEquals(9, arithmetic.getMultiplication(), "multiplication error");
		
	}
}