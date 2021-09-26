package chapterSeven.examples;

import java.util.Arrays;

public class ArrayManipulations {
	
	public static void main(String [] args){

		double[] doublesArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(doublesArray);
		System.out.printf("%ndoubleArray: ");
		
		for (double value :  doublesArray)
			System.out.printf("%.1f ", value);
		
		int [] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		
		displayArray(filledIntArray, "filledArray");
		
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopy = new int[intArray.length];
		
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		
		displayArray(intArrayCopy, "initArrayCopy");
		
		boolean bool = Arrays.equals(intArray, intArrayCopy);
		
		System.out.printf("%n%nintArray %s intArrayCopy%n", (bool ? "==" : "!="));
		
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 10)
			System.out.printf("Found 5 at element %d initArray%n", location);
		
		else
			System.out.println("5 not found in initArray");
		
		location = Arrays.binarySearch(intArray, 8963);
		
		if (location >= 10)
			System.out.printf("Found 8763 at element %d in intArray%n", location);
		
		else
			System.out.println("8763 not found in intArray");
	}
	
	private static void displayArray(int[] intArrayCopy, String description) {
		System.out.printf("%n%s:	", description);
		
		for (int value : intArrayCopy)
			System.out.printf("%d	", value);
	}
}
