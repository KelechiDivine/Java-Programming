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
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getDob(){
		return String.format("%d%d%d", month, day, year);
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
