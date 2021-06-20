package chapterTwo.Exercises;

public class LargestAndSmallestIntegers {
	
	int largestNumber= Integer.MIN_VALUE;
	int smallestNumber = Integer.MAX_VALUE;
	
	public void largestNumberMethod(int number1, int number2, int number3, int number4, int number5) {
		
		
		if (number1 > largestNumber)
			largestNumber = number1;
		
		if (number2 > largestNumber)
			largestNumber = number2;
		
		if (number3 > largestNumber)
			largestNumber = number3;
		
		if (number4 > largestNumber)
			largestNumber = number4;
		
		if (number5 > largestNumber)
			largestNumber = number5;
		
		
		
	}
	
	public int getTheLargestNumber() {
		return largestNumber;
	}
	
	public void smallestNumberMethod(int number1, int number2, int number3, int number4, int number5) {
		
		if (number1 < smallestNumber)
			smallestNumber = number1;
		
		if (number2 < smallestNumber)
			smallestNumber = number2;
		
		if (number3 < smallestNumber)
			smallestNumber = number3;
		
		if (number4 < smallestNumber)
			smallestNumber = number4;
		
		if (number5 < smallestNumber)
			smallestNumber = number5;
		
		
	}
	
	public int getSmallestNumber() {
		return smallestNumber	;
	}
}
