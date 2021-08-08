package chapterSeven.excercise;

public class StudentPoll {
	
	/*
	 * Twenty students were asked to rate on a
	 * scale of 1 to 5 the quality of the food in the
	 * student cafeteria, with 1 being “awful” and
	 * 5 being “excellent.” Place the 20 responses
	 * in an integer array and determine the
	 * frequency of each rating.*/
	
	public static void main(String[] args){
		
		int[] responses= {
				1, 2, 5, 4, 3, 5, 2, 1, 3, 3,
				1, 4, 3, 3, 3, 2, 3, 3, 2, 14
		};
		
		int[] frequency= new int[6];
		
		for (int response : responses) {
			try {
				++frequency[response];
			}
			
			catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
				System.out.println(arrayIndexOutOfBoundsException);
				System.out.println();
			}
		}
	}
}
