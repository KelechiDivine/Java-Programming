package workingWithAyomide;

public class Human {
	
	// creating attributes of class human. As a human what are the things you'd have?
	
//	We first create an attributes of the class Human
	
	private String firstname;
	private String lastname;
	private int age;
	private String phoneNumber;

//	By default java creates an empty constructor for every class you create

//	An empty constructor
//	Notice: That a constructor must have the same name as the class, and a constructor have no return type
//	Just access modifier and the class name;
	
	public Human(){}
	
//	Now we will create a constructor that returns all the object of the class;
	
	public Human(String firstname, String lastname, int age, String phoneNumber) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
}
