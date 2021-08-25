package chapterThree.exercises;

public class ComputerizationOfHealthRecords {
	
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String yearOfBirth;
	private double height;
	private double weight;
	
	
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void healthRecordMethodForFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void healthRecordMethodForLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void heightRecordMethodForWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void healthRecordMethodForHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
//
//	public void healthRecordMethodForAge(int age) {
//		this.age = age;
//	}
//
//	public int getAge() {
//		return age;
//	}
	
	public void healthRecordMethodForGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String setFirstName(String firstName) {
		this.firstName = getFirstName();
		return firstName;
	}
	
	public String setLastName(String lastName) {
		this.lastName = getLastName();
		return lastName;
	}
	
	public double setWeight(double weight) {
		this.weight = getWeight();
		return weight;
	}
	
	public double setHeight(double height) {
		this.height = getHeight();
		
		return height;
	}
	
	public String setGender(String gender) {
		this.gender = getGender();
		return gender;
	}
	
	public void healthRecordMethodForDateOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getDateOfBirth() {
		return yearOfBirth;
	}
	
	public String setDateOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
		return yearOfBirth;
	}
}
