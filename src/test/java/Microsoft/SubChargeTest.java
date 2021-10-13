package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubChargeTest {
	
	private SubCharge subCharge;
	
	@BeforeEach
	public void setSubCharge(){
		subCharge = new SubCharge();
	}
	
	@Test
	public void test_subCategoryExist(){
		SubCharge subCharge = new SubCharge();
		Assertions.assertNotNull(subCharge);
	}
	
	@Test
	public void test_ifSubChargeIsGreaterThan10_addPlus2(){
		int actual = subCharge.addWithSubCharge(5,7);
		Assertions.assertEquals(2, actual);
	}
	
	@Test
	public void test_ifSubChargeIsLesserOrEquals10_addPlus1(){
		int actual = subCharge.addWithSubCharge(2,3);
		Assertions.assertEquals(1, actual);
	}
}