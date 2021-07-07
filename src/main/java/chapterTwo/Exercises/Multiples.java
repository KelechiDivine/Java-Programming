package chapterTwo.Exercises;

public class Multiples {
	
	public boolean isMultiple;
	public boolean getNotMultiple;
	
	public Multiples() {
		this.isMultiple = false;
		this.getNotMultiple = true;
	}
	
	
	public boolean isMultiples() {
		return isMultiple;
	}
	
	public void checkForMultiples(int divisor, int number){
		
		System.out.print("Is multiple.");
	}
	
	public void isNotMultiple(int divisorOne, int numberOne) {
		System.out.print("Is not multiple.");
	}
}
