package chapterSix.exercises;

public class SquareAsterisks {
	
	String asterisksVariable;
	
	public void squareAsterisks(int asterisksSize, String asterisks){
		for (int asterisksLength = 1; asterisksLength <= asterisksSize; asterisksLength ++){
			for (int asterisksWidth = 1; asterisksWidth <= asterisksSize; asterisksWidth ++)
				System.out.print(asterisks);
			asterisksVariable = asterisks;
			System.out.println();
		}
	}
	
	public String returnAsterisks(){
		return asterisksVariable;
	}

}
