package Microsoft;


public class ArrayValue {

	private final int[] integerArrayList = new int[2];
	
	public int[] toArray(int firstArgument, int secondArgument){
		integerArrayList[0] = firstArgument;
		integerArrayList[1] = secondArgument;
		System.out.printf("Successfully converted %d and %d to an array.", firstArgument, secondArgument);
		System.out.println();
		System.out.println(integerArrayList[0]);
		System.out.println(integerArrayList[1]);
		return integerArrayList;
	}
}
