package chapterThree.makingADifference;

public class TargetHeartRateCalculator {
	
	String firstName;
	String lastName;
	int month;
	int day;
	int year;
	
	
	public TargetHeartRateCalculator(String firstName, String lastName,
									 int month, int day, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getPersonAge(){
		return	java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - getYear();
	}
	
	// calculate and return max heart rate
	
	public int getMaxHeartRate(){
		return 220 - getPersonAge();
	}
	
	// calculate and return target heart rate
	
	public String getTargetedHeartRate(){
		return String.format("%.0f - %.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
		
	}
}
