package chapterSeven.examples;

public class EnhancedForStatement {
	
	public static void main (String[] args){
		int [] array= {
				87, 68, 94, 100, 83, 78, 85, 91, 76, 87
		};
		
		int total = 0;
		
		/*
		A general for loop
		 */
//
//		for (int counter= 0; counter < array.length; counter = counter + 1)
//			total = total + array[counter];
		
		/*
		 * Enhanced for loop. Adding each element's value to total
		 */

		for (int number : array)
			total = total + number;
		
		System.out.printf("Total of array elements: %d%n", total);
	} // end class EnhancedForTest
}
