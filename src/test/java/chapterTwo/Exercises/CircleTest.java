package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
	
	@Test
	
	public void testThatRadiusIsWritten(){
		//given
		Circle circle = new Circle();
		//when
		circle.findRadius(12);
		//check
		Assertions.assertEquals(6, circle.getRadius());
		
	}
	@Test
	
	public void testThatDiameterIsWorking(){
		//given
		Circle circle = new Circle();
		circle.findDiameter(7.5);
		Assertions.assertEquals(15, circle.getDiameter(), "Diameter is 15");
	}
	
	@Test
	
	public void testThatIsWorking(){
		Circle circle = new Circle();
		circle.findArea(2);
		Assertions.assertEquals(12.56, circle.getArea(), "Area is 12.56");
	}
}