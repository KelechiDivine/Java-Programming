package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DisplayAnyCharacterTest {
	
	@Test
	public void printCharacter(){
		DisplayAnyCharacter anyCharacter = new DisplayAnyCharacter();
		anyCharacter.charArgument(5, '#');
		Assertions.assertEquals('#', anyCharacter.returnChar());
	}

}