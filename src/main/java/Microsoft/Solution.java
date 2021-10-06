package Microsoft;

public class Solution {
	
	public int diagonalDifference(int[][] arr, int n){
		
		int firstDiagonal  = 0;
		int secondDiagonal = 0;
		
		for (int i  = 0; i < n; i++){
			for (int j = 0; j < n; j++) {
			
//				find sum of first diagonal.
				if (i == j)
					firstDiagonal += arr[i][j];
				
//				find sum of second diagonal
				if (i == n - j - 1)
					secondDiagonal += arr[i][j];
			}
		}
		
//		absolute difference of sum across the diagonal
		return Math.abs(firstDiagonal - secondDiagonal);
	}
}
