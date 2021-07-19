package hackerRank;

import java.util.Scanner;

public class NewLineForm {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int integer = 1; integer <= 10; integer= integer + 1){
			System.out.println(number + " x " + integer + " = " + integer * number);
		}
	}
}
