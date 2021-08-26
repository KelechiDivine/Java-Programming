package chapterSix.exercises;

public class EvenAndOddNumber {
	
	public void isEven(int clientInput) {
		if (clientInput % 2 == 0) {
			System.out.println("This is an even number.");
		}
	}
	
	public int getIsEvenNumber(){
		return 0;
	}
	
	public int getIsOddNumber(){
		return 1;
	}
	
	public void isOdd(int anotherClientInput){
		if (anotherClientInput % 2 == 1){
			System.out.println("This is an odd number..");
		}
	}
}
