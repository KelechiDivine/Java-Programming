package workingWithAyomide;

public class ChapterTwo {

//	A method that calculate the sum of two numbers

	int result;
	
	public void receiveTwoNumber(int clientFirstNumber, int clientSecondNumber){
		result = clientFirstNumber + clientSecondNumber;
		if (clientFirstNumber + clientSecondNumber == result){
			System.out.println("The sum is " + result);
		}
	}
	
	public int getResult(){
		return result;
	}
	
}
