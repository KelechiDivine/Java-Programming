package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayValueTest {

	private ArrayValue arrayValue;
	
	@BeforeEach
	public void setArrayValue(){
		arrayValue = new ArrayValue();
	}
	
	@Test
	public void test_arrayValueClassExist(){
		ArrayValue arrayValue1 = new ArrayValue();
		System.out.println("This class is not empty.");
		Assertions.assertNotNull(arrayValue1);
	}
	
	@Test
	public void test_convertIntegerTwoAndThree_toAnArray(){
		int[] actual = arrayValue.toArray(2, 3);
		int[] expected = new int[] {2,3};
		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void test_convertIntegerOneAndFour_toAnArray(){
		int [] actual = arrayValue.toArray(1, 4);
		int [] expected = new int[]{1, 4};
		Assertions.assertArrayEquals(expected, actual);
	}
}