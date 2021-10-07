package Microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SolutionTest {
	
	
	private Solution solution;
	
	@BeforeEach
	public void setSolution(){
		solution = new Solution();
	}
	
	@Test
	public void test_diagonalDifferenceExist(){
		solution = new Solution();
		Assertions.assertNotNull(solution, "Class doesn't exist");
	}
	
	@Test
	public void test_diagonalDifference(){
		int y = solution.isDiagonal(new int[][]{{11, 2, 4}, {4 , 5, 6}, {10, 8, -12}}, 3);
		Assertions.assertEquals(15, y);
		
	}
	
	@Test
	public void test_nextDialogDifference(){
		int x = solution.isDiagonal(new int[][]{{10, 3, 5}, {5, 34, 4}, {-12, 4, 6}}, 3);
		Assertions.assertEquals(23, x);
	}

}