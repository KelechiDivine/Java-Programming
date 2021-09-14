package chapterSeven.excercise;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiceTest {
	
	private Dice dice;
	
	@BeforeEach
	public void setDice(){
		dice = new Dice();
	}
	
	@Test
	public void assertDieExist(){
		
		int firstDie = dice.rollDie();
		int secondDie = dice.rollDie();
		
		Assertions.assertNotNull(firstDie);
		Assertions.assertNotNull(secondDie);
		
	}
}