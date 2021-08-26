package chapterSix.exercises;

public class PythonInJavaCode {

	int sum;
	String text;
	
	public void def(int firstNumber, int secondNumber){
		sum = firstNumber + secondNumber;
	}
	
	public int print(){
		return sum;
	}
	
	public void input(String name){
		text = name;
	}
	
	public String assertEquals(){
		return text;
	}
}
