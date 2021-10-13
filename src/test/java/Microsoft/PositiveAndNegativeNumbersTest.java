package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveAndNegativeNumbersTest {
	
	private PositiveAndNegativeNumbers numbers;
	
	@BeforeEach
	public void setNumbers() {
		numbers = new PositiveAndNegativeNumbers();
	}
	
	@Test
	public void test_thatPositiveAndNegativeNumbersClassExist() {
		PositiveAndNegativeNumbers positiveAndNegativeNumbers = new PositiveAndNegativeNumbers();
		Assertions.assertNotNull(positiveAndNegativeNumbers);
	}
	
	@Test
	public void test_returnTrueIfTwoNumbersArePositive() {
		boolean itsPositive = numbers.checkIfTwoNumbersArePositive(2, 3);
		Assertions.assertTrue(itsPositive);
	}
	
	@Test
	public void test_returnTrueIfTwoNumbersAreNegative() {
		boolean itsNegative = numbers.checkIfTwoNumbersAreNegative(-2, -4);
		Assertions.assertTrue(itsNegative);
	}
	
	@Test
	public void test_returnTrueIfOneOutOfTwoNumbersIsNegative() {
		boolean oneNumberIsNegative = numbers.checkIfTwoNumbersAreNegative(2, -4);
		Assertions.assertTrue(oneNumberIsNegative);
	}
	
	@Test
	public void test_returnTrueIfOneOutOfTwoNumbersIsPositive() {
		boolean oneNumberIsPositive = numbers.checkIfTwoNumbersArePositive(2, -4);
		Assertions.assertTrue(oneNumberIsPositive);
	}
	
	@Test
	public void test_returnTrueIfFirstNumberIsPositive(){
		boolean firstNumberIsPositive = numbers.checkIfFirstNumberIsPositive(3);
		Assertions.assertTrue(firstNumberIsPositive);
	}
	
	@Test
	public void test_returnTrueIfFirstNumberIsNegative(){
		boolean firstNumberIsNegative = numbers.checkIfFirstNumberIsNegative(-2);
		Assertions.assertTrue(firstNumberIsNegative);
	}
	
	@Test
	public void test_returnTrueIfSecondNumberIsPositive(){
		boolean secondNumberIsPositive = numbers.checkIfSecondNumberIsPositive(2);
		Assertions.assertTrue(secondNumberIsPositive);
	}
	
	@Test
	public void test_returnTrueIfSecondNumberIsNegative(){
		boolean secondNumberIsNegative = numbers.checkIfSecondNumberIsNegative(-3);
		Assertions.assertTrue(secondNumberIsNegative);
	}
}