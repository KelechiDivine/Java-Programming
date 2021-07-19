package hackerRank;

import java.util.Scanner;

public class Format {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		
		for(int format = 0; format < 3; format = format + 1){
			
			String firsString = sc.next();
			
			int wordArrangement = sc.nextInt();
			
			System.out.printf("%-14s %03d\n", firsString, wordArrangement);
		}
		
		System.out.println("================================");
	}
}
