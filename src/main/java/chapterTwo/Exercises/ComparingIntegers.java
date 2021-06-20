package chapterTwo.Exercises;

public class ComparingIntegers {
	
	private int compared;
	
	public void comparing(int firstNumber, int secondNumber) {
		
		compared = firstNumber;
		
		if (firstNumber == secondNumber)
			System.out.printf("Compared successfully(numbers are equal): %s ", compared);
		
		if (firstNumber < secondNumber)
			System.out.printf("Second number is the highest %d%n", firstNumber);
		
		if (firstNumber > secondNumber)
			System.out.printf("Second number too low %d%n", secondNumber);
	}
	
	public int getCompared() {
		return compared;
	}
	
}
