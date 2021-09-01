package chapterSeven.excercise;

public class AirlineReservations {
	
	int[] availableAirlineSeat = new int[10];
	
	int planeSeatCapacity = 10;
	int seatVariable;
	int ecoSeatVariable;
	int firstClassVariable;
	int firstClassSeatType = -1;
	private int firstClass;
	private int economy;
	
	
	public void firstClassSeatPicker(int userChoice) {
		if (userChoice >= 0 && userChoice <= 5) {
			seatVariable = userChoice;
			System.out.println("First class seat purchased.");
		}
	}
	
	public void economySeatPicker(int userChoice){
		if (userChoice >= 5 && userChoice <= 10){
			ecoSeatVariable = userChoice;
			System.out.println("Economy class seat purchased.");
		}
	}
	
	public int getSeatResult(){
		return seatVariable;
	}
	
	public int getEcoSeatResult(){
		return ecoSeatVariable;
	}
	
	public void firstClassReservedSeat(int seatType){
		if (seatType == 1){
			availableAirlineSeat[firstClass] = 1;
			firstClass++;
		}
	}
	
	public void economyReservedSeat(int seatType){
		if(seatType == 2){
			availableAirlineSeat[economy] = 2;
			economy ++;
		}
	}
	
	public int returnFirstClassReservedSeat(){
		return firstClass;
	}
	
	public int returnEconomyReservedSeat(){
		return economy;
	}
}
