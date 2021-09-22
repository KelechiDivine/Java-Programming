package chapterFour.exercises;

public class Cryptography {
	
	public void fourNumbersEncrypting(int firstInteger, int secondInteger,
									  int thirdInteger, int fourthInteger){
		
		int firstResult = firstInteger + 7;
		int secondResult = secondInteger + 7;
		int thirdResult = thirdInteger + 7;
		int fourthResult = fourthInteger +7;
		
		System.out.println("Your input: " + firstInteger + " " + secondInteger + " " + thirdInteger +
				" " + fourthInteger);
		
		int sum = firstResult + secondResult + thirdResult + fourthResult;
		
		int getTheRemainderAfterDividingTheDigitValueByTen = sum % 10;

		System.out.println("The remainder is: " + getTheRemainderAfterDividingTheDigitValueByTen);
		
//		swap logic
		int swapVar = firstInteger;
		int swapVar2 = secondInteger;
		
		firstInteger = thirdInteger;
		thirdInteger = swapVar;
		
		secondInteger = fourthInteger;
		fourthInteger = swapVar2;
		
		System.out.println("Encrypted values after swapping: " + firstInteger + " " +
				secondInteger + " " + thirdInteger + " " + fourthInteger);
	}
}
