package workingWithAyomide;

public class DateClass {

	private final int month;
	private final int day;
	private final int year;

	private static final int[] daysPerMonth = {
			0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};

	public DateClass(int month, int day, int year){
		if (month <= 0 || month > 12) {
			throw new IllegalStateException("Month (" + month + ") " +
					"must be 1-12");
		}
		if(day <= 0 || (day > daysPerMonth[month]&& !(month == 2
		&& day == 29))){
			throw new IllegalArgumentException("day (" + day +
					") out-of-range for the specified month and year");
			
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date" +
				"%s%n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
