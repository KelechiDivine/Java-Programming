//package chapterSeven.examples;
//
//public class PassArray {
//
//	public static void main(String[] args){
//		int[] array = {
//				1, 2, 3, 4, 5
//		};
//		System.out.printf("Effect of passing reference to entire array: %n " + "The value" +
//				"of the original array are: %n");
//
//		for(int value : array)
//			System.out.printf("		%d", value);
//
//		modifyArray(array);
//		System.out.printf("%n%nThe value of the modified  array are:%n");
//
//		for(int value : array)
//			System.out.printf("		%d",value);
//
//		System.out.printf("%n%nEffect of passing array element value: %n" +
//				"array[3] before modifyElement: %d%n", array[3]);
//
//		modifyArray(array[3]);
//		System.out.printf("Array[3] after modifyElement: %d%n", array[3]);
//	}
//
//	private static void modifyArray(int array) {}
//
//	public static void modifiedArray(int[] array2){
//		for (int counter : array2)
//			array2[counter] *= 2;
//	}
//
//	public static void modifyElement(int element){
//		element *= 2;
//		System.out.printf("Value of element in modifyElement: %d%n", element);
//	}
//}