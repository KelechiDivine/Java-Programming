package workingWithAyomide;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChapterTwoTest {
	
	private ChapterTwo errandBoy;
	
	
	@BeforeEach()
	public void setUp(){
		errandBoy = new ChapterTwo();
	}
	
	@Test
	public void testThatWeCanAddTwoNumbers(){
		errandBoy.receiveTwoNumber(3, 4);
		Assertions.assertEquals(7, errandBoy.getResult());
	}
}