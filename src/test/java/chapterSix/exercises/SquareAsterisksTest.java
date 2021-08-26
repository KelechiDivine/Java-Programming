package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SquareAsterisksTest {
	
	@Test
	public void printAsterisks(){
		SquareAsterisks asterisks = new SquareAsterisks();
		asterisks.squareAsterisks(10, "*");
		Assertions.assertEquals("*", asterisks.returnAsterisks());
	}
}