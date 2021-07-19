package hackerRank;

import java.util.Scanner;

public class Queries {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int anInt = scanner.nextInt();
		
		for(int integer = 0; integer < anInt; integer = integer + 1){
			int firstNumber = scanner.nextInt();
			int secondNumber = scanner.nextInt();
			int thirdNumber = scanner.nextInt();
			int calculator = firstNumber;
			
			for(int loop = 0; loop < thirdNumber; loop = loop + 1)
			{
				calculator+=(Math.pow(2,loop)*secondNumber);
				System.out.print(calculator + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
