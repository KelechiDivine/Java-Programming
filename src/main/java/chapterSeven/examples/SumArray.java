package chapterSeven.examples;

public class SumArray {
	public static void main(String[] args){
		int[] arrays = {
				87, 68, 94, 100, 83, 78, 85, 91, 76, 87
		};
		int total = 0;
		
		for (int counter= 0; counter < arrays.length; counter= counter + 1)
			total = total + arrays[counter];
		System.out.printf("Total of array elements: %d%n", total);
	}
}
