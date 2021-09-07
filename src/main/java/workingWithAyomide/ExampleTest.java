package workingWithAyomide;

import java.util.Scanner;

public class ExampleTest {
	
	public static void main(String[] args) {
		
		int firstClientInput;
		int secondClientInput;
		
		// create an object of the class
		Example example = new Example();
	
		//receive an input from a client by using Scanner class
		Scanner clientInput = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		firstClientInput = clientInput.nextInt();
		
		System.out.print("Enter second number: ");
		secondClientInput = clientInput.nextInt();
		
		example.receiveTwoNumbers(firstClientInput, secondClientInput);
	}
}
