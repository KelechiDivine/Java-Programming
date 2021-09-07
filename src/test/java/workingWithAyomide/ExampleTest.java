package workingWithAyomide;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
	
	private Example example;
	
	
	@BeforeEach()
	public void setUp(){
		example = new Example();
	}
	
	
	@Test
	public void testWeCanAddTwoNumbersAndGetTheAnswer(){
		example.addingTwoNumbers(5, 2);
		Assertions.assertEquals(7, example.getSumResult());
	}
	
}