package chapterSix.exercises;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistanceCalculationTest {
	
	private DistanceCalculation distanceCalculation;
	
	@BeforeEach
	public void setDistanceCalculation(){
		distanceCalculation = new DistanceCalculation();
	}
	
	@Test
	public void assertThatDistanceClassExist(){
		distanceCalculation.calculateDistance();
		Assertions.assertNotNull(distanceCalculation);
	}
	
	@Test
	public void calculateDistance(){
		double p= distanceCalculation.calculateDistance(1, 2, 3, 4);
		Assertions.assertEquals(1.4142135623730951, p);
	}
}