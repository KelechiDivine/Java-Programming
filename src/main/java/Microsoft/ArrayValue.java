package Microsoft;


public class ArrayValue {

	private final int[] integerArrayList = new int[2];
	
	public int[] toArray(int firstArg, int secondArg){
		integerArrayList[0] = firstArg;
		integerArrayList[1] =secondArg;
		System.out.printf("Successfully converted %d and %d to an array.", firstArg, secondArg);
		return integerArrayList;
	}
}
