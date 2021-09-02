package chapterEight.example;

public class Time {
	
	private int hour;
	private int minutes;
	private int seconds;
	
	public void setTime(int hour, int minutes, int seconds){
		
		if (hour < 0 || hour >= 24 || minutes < 0 || minutes
				>= 60 || seconds < 0 || seconds >= 60){
			throw new IllegalStateException("Hour, minutes and/ or second was out of range ");
		}
		
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", hour, minutes, seconds);
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour
		% 12), minutes, seconds, (hour < 12 ? "AM" : "PM"));
	}
}
