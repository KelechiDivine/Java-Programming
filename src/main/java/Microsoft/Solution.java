package Microsoft;

public class Solution {
	
	public Solution(){
		System.out.println("This class is not null...");
	}
	public int isDiagonal(int[][] arrayOfArray, int nthLengthOfArray){
		
		int firstDiagonal  = 0;
		int secondDiagonal = 0;
		
		for (int i  = 0; i < nthLengthOfArray; i++){
			for (int j = 0; j < nthLengthOfArray; j++) {
			
//				find sum of first diagonal.
				if (i == j)
					firstDiagonal += arrayOfArray[i][j];
				
//				find sum of second diagonal
				if (i == nthLengthOfArray - j - 1)
					secondDiagonal += arrayOfArray[i][j];
			}
		}
		
//		absolute difference of sum across the diagonal
		return Math.abs(firstDiagonal - secondDiagonal);
	}
}
