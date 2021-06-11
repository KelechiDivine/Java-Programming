package chapterThree.makingADifference;

public class ComputerizationOfHealthRecords {
	
	String firstname;
	String lastname;
	String gender;
	String dOb;
	double height;
	double weight;
	int yearOfBirth;
	int age;
	
	public ComputerizationOfHealthRecords(String firstname, String lastname, String gender, String dOb, double height,
										  double weight, int yearOfBirth, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dOb = dOb;
		this.height = height;
		this.weight = weight;
		this.yearOfBirth = yearOfBirth;
		this.age = age;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getdOb() {
		return dOb;
	}
	
	public void setdOb(String dOb) {
		this.dOb = dOb;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double calculateMetric(){
		return weight / (height * height);
	}
	
	public int getMaxHeartRate() {
		return 220 - getAge();
	}
	
	public String getTargetHeartRate() {
		return String.format("%.0f - %.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
	}
}