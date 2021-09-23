package chapterFour.exercises;

import java.util.Scanner;

public class CryptographyMainClass {
	
	public static void main(String[] args) {
		
		Cryptography cryptography = new Cryptography();
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter first number to encrypt: ");
		int fir = scanner.nextInt();
		
		System.out.print("Please enter second number to encrypt: ");
		int sec = scanner.nextInt();
		
		System.out.print("Please enter third number to encrypt: ");
		int thi = scanner.nextInt();
		
		System.out.print("Please enter fourth number to encrypt: ");
		int fort = scanner.nextInt();
		
		cryptography.fourNumbersEncrypting(fir, sec, thi, fort);
		
	}
	
	
}
