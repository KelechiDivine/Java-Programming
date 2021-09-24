package unitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TuringTest {
	
	private Turing turing;
	
	@BeforeEach
	public void setTuring(){
		turing = new Turing();
	}
	
	@Test
	public void assertTuringPollsExist(){
		turing.calPoints();
		Assertions.assertNotNull(turing);
	}
	
	@Test
	public void assertCalPoints_willExecute(){
		int y = turing.calPoints(new String[]{"5", "2", "D", "C", "+"});
		Assertions.assertEquals(30, y);
	}

}