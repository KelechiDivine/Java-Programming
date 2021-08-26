package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EvenAndOddNumberTest {
	
	@Test
	public void testIsEven(){
		EvenAndOddNumber evenNumber = new EvenAndOddNumber();
		evenNumber.isEven(44);
		Assertions.assertEquals(0, evenNumber.getIsEvenNumber());
	}
	
	@Test
	public void testIsOdd(){
		EvenAndOddNumber oddNumber = new EvenAndOddNumber();
		oddNumber.isOdd(55);
		Assertions.assertEquals(1, oddNumber.getIsOddNumber());
	}

}