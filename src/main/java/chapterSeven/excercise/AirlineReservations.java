package chapterSeven.excercise;

import java.util.Arrays;

public class AirlineReservations {
	
	int[] availableAirlineSeat = new int[10];
	
	int seatCapacity = 10;
	int firstClassSeatVariable;
	int economySeatVariable;
	int firstClassVariable;
	int firstClassSeatType = -1;

	
	public void firstClassSeatPicker(int firstClassUserChoice) {
		if (firstClassUserChoice >= 0 && firstClassUserChoice <= 5) {
			firstClassSeatVariable = firstClassUserChoice;
			System.out.println("First class seat purchased.");
		}
	}
	
	public void economySeatPicker(int economyUserChoice){
		if (economyUserChoice >= 5 && economyUserChoice <10){
			economySeatVariable = economyUserChoice;
			System.out.println("Economy class seat purchased.");
		}
	}
	
	public int getFirstClassSeatResult(){
		return firstClassSeatVariable;
	}
	
	public int getEconomySeatResults(){
		return economySeatVariable;
	}
	
	public void firstClassSeatArray(int[] seat, int seatType){
		if (seatType == 1){
			for (int index = 0; index < 5; index ++){
				if (seat[index] == 0){
//					return index;
					firstClassVariable = index;
				}
			}
		}
	}
	
	public int getFirstClassArray(){
		return firstClassSeatType;
	}
	
}
