package chapterSix.exercises;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CAITest {
	
	private CAI cai;
	
	@BeforeEach
	public void setCai(){
		cai = new CAI();
	}
	
	@Test
	public void assertCAITestExist(){
		if (cai != null) {
			System.out.println("Class is not empty!!");
		}
		Assertions.assertTrue(true);
	}
	
	@Test
	public void askQuestion() {
		cai.compareUserAnswerWithInitialAnswer(40);
		Assertions.assertEquals(40, cai.getAnswer());
	}
}