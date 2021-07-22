package chapterSeven.examples;

public class InitArray {
	public static void main(String[] args){
		int[] love= new int[10];
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter= 0; counter < love.length; counter = counter + 1)
			System.out.printf("%5d%8d%n", counter, love[counter]);
	}
}
