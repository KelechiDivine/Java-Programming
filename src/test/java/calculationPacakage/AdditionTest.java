package calculationPacakage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionTest {
	
	@Test
	public void testAdditionOfTwoNumbers(){
		Calculator addition = new Calculator();
		addition.additionTwoNumbers(3, 5);
		Assertions.assertEquals(8, addition.getSumResult());
	}
	
	@Test
	public void testSubtractionOfTwoNumbers(){
		Calculator subtraction = new Calculator();
		subtraction.subtractingTwoNumbers(4, 6);
		Assertions.assertEquals(-2, subtraction.getMinusResult());
	}
	
	@Test
	public void testMultiplicationOfTwoNumbers(){
		Calculator multiplication = new Calculator();
		multiplication.multiplyingTwoNumbers(3, 4);
		Assertions.assertEquals(12, multiplication.getMultiplyResult());
	}
	
	@Test
	public void testDivisionOfTwoNumbers(){
		Calculator division = new Calculator();
		division.dividingTwoNumbers(4, 2);
		Assertions.assertEquals(2, division.getDivisionResult());
	}
	
	@Test
	public void main(){}
	

}