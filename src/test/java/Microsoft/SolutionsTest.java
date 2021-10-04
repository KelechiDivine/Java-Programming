package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionsTest{

	
	private Solutions solutions;
	
	@BeforeEach
	public void setSolutions(){
		solutions = new Solutions();
	}
	
	@Test
	public void assertSolutionsClassExist(){
		Assertions.assertNotNull(solutions, "This class is null!");
	}
	
	@Test
	public void assertSolutionsClassWillExecute(){
		int x = solutions.solution(new int[]{1, 2, 3});
		int y = solutions.solution(new int[]{-1, -3});
		Assertions.assertEquals(4, x, "Object x not found.");
		Assertions.assertEquals(1, y, "Object y not found.");
	}
}