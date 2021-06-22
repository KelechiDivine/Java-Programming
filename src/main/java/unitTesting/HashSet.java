package unitTesting;

import java.util.Set;

public class HashSet {
	
	public static void main(String[] args){
		
		Set<String> daysOfTheWeek = new java.util.HashSet<>();
		
		daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");
		
//		daysOfTheWeek.add("Monday");
		
		System.out.print(daysOfTheWeek);
	}
}
