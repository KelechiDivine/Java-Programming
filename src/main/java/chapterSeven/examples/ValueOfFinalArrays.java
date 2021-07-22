package chapterSeven.examples;

public class ValueOfFinalArrays {
	public static void main(String[] args){
		final int ARRAY_LENGTH= 10;
		
		int[] array = new int[ARRAY_LENGTH];
		
		for (int counter= 0; counter < array.length; counter= counter + 1)
			array[counter] = 2 + 2 * counter;
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter= 0; counter < array.length; counter= counter + 1)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}
