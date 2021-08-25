package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HypotenuseCalculationsTest {
	
	@Test
	public void testHypotenuse(){
		HypotenuseCalculations calculations = new HypotenuseCalculations();
		calculations.isHypotenuse(3.0, 4.0);
		Assertions.assertEquals(5.0, calculations.getHypotenuse());
	}
	
	@Test
	public void testHypotenuse1(){
		HypotenuseCalculations hypotenuseCalculations = new HypotenuseCalculations();
		hypotenuseCalculations.isHypotenuse(5.0, 12.0);
		Assertions.assertEquals(13.0, hypotenuseCalculations.getHypotenuse());
	}
	
	@Test
	public void testHypotenuse2(){
		HypotenuseCalculations calculations = new HypotenuseCalculations();
		calculations.isHypotenuse(8.0, 15.0);
		Assertions.assertEquals(17.0, calculations.getHypotenuse());
	}

}