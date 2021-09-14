package chapterSeven.excercise;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiceTest {
	
	private Dice dice;
	
	@BeforeEach
	public void setDice(){
		dice = new Dice();
	}
	
	@Test
	public void rollFirstDie_andShowTheNumberOutput() {
		dice.rollFirstDie();
	}
	
	@Test
	public void rollSecondDie_andShowTheResult() {
		dice.rollSecondDie();
	}
	
	@Test void returnResultOfBothDie(){
		dice.returnResultOfFirstDieAndSecondDie();
	}
}