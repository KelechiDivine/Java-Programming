package unitTesting.AmigoseCode;

public class Employee extends Polymorphism{
	
	public void walk(){
		System.out.println("Can fast.");
	}
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.walk();
		
		Polymorphism polymorphism1 = new Employee();
		polymorphism1.walk();
	}
}
