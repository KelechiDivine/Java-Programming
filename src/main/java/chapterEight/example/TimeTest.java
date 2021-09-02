package chapterEight.example;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time time = new Time();
		
		displayTime("After time object is created", time);
		System.out.println();
		
		
		time.setTime(13, 7, 6);
		displayTime("After calling setTime", time);
		System.out.println();
		
		
		try {
			time.setTime(99, 99, 99);
		}
		
		catch (IllegalStateException exception){
			System.out.printf("Exception: %s%n%n", exception.getMessage());
		}
		
		displayTime("After calling setTime with invalid values", time);
	}
	
	private static void displayTime(String header, Time time){
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header
		, time.toUniversalString(), time.toString());
	}
}
