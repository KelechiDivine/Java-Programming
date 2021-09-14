package chapterSeven.excercise;


import Registery.Exceptions.InputOutOfBoundException;
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
	public void rollSingleDice() throws InputOutOfBoundException {
		dice.getFirstDice(2);
		Assertions.assertEquals(2, dice.returnRolledDiceResult());
	}
}