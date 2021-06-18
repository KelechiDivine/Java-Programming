package chapterTwo.Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiameterCircumferenceAndAreaOfACircleTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	public void findingTheRadiusOfaCircle(){
		
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		
		int diameter= 8;

		diameterCircumferenceAndAreaOfACircle.circleRadius(diameter);
		Assertions.assertEquals(4, diameterCircumferenceAndAreaOfACircle.getRadius(), "was not able to get radius");
	}
	
	@Test
	public void findingTheDiameterOfACircle(){
		
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		
		int radius = 4;
		
		diameterCircumferenceAndAreaOfACircle.circleDiameter(radius);
		Assertions.assertEquals(8, diameterCircumferenceAndAreaOfACircle.getDiameter(), "diameter was not found.");
	}
	
	@Test
	public void findingTheAreaOfACircle(){
		
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		
		double radius = 4;
		
		diameterCircumferenceAndAreaOfACircle.circleArea(radius);
		Assertions.assertEquals(50.26544, diameterCircumferenceAndAreaOfACircle.getArea(), "area not found.");
	}
}