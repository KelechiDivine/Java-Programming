package chapterTwo.Exercises;

public class ComparingIntegers {
	
	private int compared;
	int largestNumber = Integer.MIN_VALUE;
	int smallestNumber = Integer.MAX_VALUE;
	
	
	public int getCompared() {
		return compared;
	}
	
	public void getComparingClassMethod(int number1, int number2) {
		
		compared = number1;
		compared = number2;
		
			if (number1 == number2)
				System.out.printf("Compared successfully(numbers are equal): %s ", compared);
	}
	
	public void getTheLargestNumberInAnUserInput(int number1, int number2) {
		
		if (number1 > largestNumber)
			largestNumber = number1;
		
		if (number2 > largestNumber)
			largestNumber = number2;
	}
	
	public int getLarge() {
		return largestNumber;
	}
	
	public void getTheSmallestNumberInAUserInput(int number1, int number2) {
		
		if (number1 < smallestNumber)
			smallestNumber = number1;
		
		if (number2 < smallestNumber)
			smallestNumber = number2;
	}
	
	public int getSmall() {
		return smallestNumber;
	}
}
