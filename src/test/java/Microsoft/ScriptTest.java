package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScriptTest {
	
	private Script script;
	
	@BeforeEach
	public void setScript(){
		script = new Script();
	}
	
	@Test
	public void test_scriptClassExist(){
		Script itsExist = new Script();
		Assertions.assertNotNull(itsExist);
	}
	
	@Test
	public void test_thatSumOfTwoNumbersWillBe50(){
		boolean sumIs50 = script.returnTrueIfSumOfTwoNumbersIs50(25, 25);
		Assertions.assertTrue(sumIs50);
	}
	
	@Test
	public void test_thatFirstNumberWillReturnTrueIfIts50(){
		boolean firstNumberIs50 = script.returnTrueIfFirstNumberIs50(50);
		Assertions.assertTrue(firstNumberIs50);
	}

	@Test
	public void test_thatSecondNumberWillReturnTrueIfIts50(){
		boolean secondNumberIs50 = script.returnTrueIfSecondNumberIs50(50);
		Assertions.assertTrue(secondNumberIs50);
	}
	
	@Test
	public void assertFailIfBothNumbersAreNot50(){
		boolean theSumWillThrowError = script.returnTrueIfSumOfTwoNumbersIs50(2, 5);
		Assertions.assertTrue(theSumWillThrowError);
	}
	
	@Test
	public void assertFailIfFirstNumberIsNot50(){
		boolean firstNumberWillFail = script.returnTrueIfFirstNumberIs50(34);
		Assertions.assertTrue(firstNumberWillFail);
		
	}
	
	@Test
	public void assertFailIfSecondNumberIsNot50(){
		boolean secondNumberWillFail = script.returnTrueIfSecondNumberIs50(23);
		Assertions.assertTrue(secondNumberWillFail);
		
	}
}