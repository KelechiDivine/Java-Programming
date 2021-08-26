package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CircleAreaTest {
	
	@Test
	public void testGetRadiusResults(){
		CircleArea radius = new CircleArea();
		radius.circleArea(23);
		Assertions.assertEquals(9.8596, radius.getRadius());
	}

}