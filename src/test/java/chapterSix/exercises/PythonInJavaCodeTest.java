package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PythonInJavaCodeTest {
	
	@Test
	public void testPython(){
		PythonInJavaCode python = new PythonInJavaCode();
		python.def(2, 4);
		Assertions.assertEquals(6, python.print());
	}
	
	@Test
	public void testPython2(){
		PythonInJavaCode python = new PythonInJavaCode();
		python.input("what the fuck?");
		Assertions.assertEquals("what the fuck?", python.assertEquals());
	}
	
}