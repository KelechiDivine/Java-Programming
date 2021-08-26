package chapterSix.exercises;

public class SquareAsterisks {
	
	String asterisksVariable;
	
	public void squareAsterisks(int asterisksSize, String asterisks){
		for (int lengthCounter = 1; lengthCounter <= asterisksSize; lengthCounter ++){
			for (int widthCounter = 1; widthCounter <= asterisksSize; widthCounter ++)
				System.out.print(asterisks);
			asterisksVariable = asterisks;
			System.out.println();
		}
	}
	
	public String returnAsterisks(){
		return asterisksVariable;
	}

}
