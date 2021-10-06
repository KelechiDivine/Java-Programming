package hackerRank;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewLineFormTest {
	
	private NewLineForm newLineForm;
	
	@BeforeEach
	public  void setNewLineForm(){
		newLineForm = new NewLineForm();
	}
	
	@Test
	public void test_newLineFormatClassExist(){
		int emp = newLineForm.createLineFormat();
		Assertions.assertEquals(emp, 0, "I choose to be wise...");
	}
	@Test
	public void test_newLineFormat(){
		int y = newLineForm.createLineFormat(2);
		Assertions.assertEquals(2, y, "Message wasn't available!!");
	}
	
}