package chapterSeven.excercise;


import java.util.ArrayList;

public class AirlineReservations {

	private final boolean[] totalNumberOfPassengerSeat = new boolean[10];

	public void receiveWelcomeMessage(){
		System.out.println("Hi valued customer. Thanks for booking a ticket with us. We wish you a nice flight.");
	}

	public boolean assignSeatToPassenger(String choice){
		boolean firstClassSeat = true;
		if (choice.equals("first") && getSeat(choice) > 0){
			for (int index = 0; index < 5; index++){
				if (!totalNumberOfPassengerSeat[index]){
					firstClassSeat = totalNumberOfPassengerSeat[index];
					printBoardingPass(index);
					return true;
				}
			}
		}

		else {
			boolean economySeat = true;
			if (choice.equals("economy")) {
				if (getSeat(choice) > 0) {
					for (int index = 5; index < totalNumberOfPassengerSeat.length; index++) {
						if (!totalNumberOfPassengerSeat[index]) {
							economySeat = totalNumberOfPassengerSeat[index];
							printBoardingPass(index);
							return true;
						}
					}
				}
			}
			//TODO: Check if it is OK to assign seat to a passenger's choice , if seat is full.

			System.out.printf("All seat in section \"%s\" are booked. \n", choice);
			System.out.printf("Would you like to be moved to section \"%s\" (y/n)", (choice.equals("first") ? "economy" : "first"));
			passengersResponse(choice);

		}
		return false;
	}
	private void printBoardingPass(int index) {

	}

	private int getSeat(String choice) {
		return 0;
	}

	public void displayFirstClassSeat() {
		System.out.println("			Available First class seat");
		System.out.println("		----------------------------------");
		
		for (int i = 1; i <= firstClassSeat.length; i++) {
			System.out.printf("seat No_: %d%n", i);
		}
	}
	
	public void displayEconomySeat(){
		System.out.println("			Available Economy seat");
		System.out.println("		------------------------------");
		for (int j = 1; j <= economySeat.length; j++){
			System.out.printf("seat No_: %d%n", j);
		}
	}
	
	public int registerSeatForFirstClassPassenger(int firstClassChoice){
	
		if (firstClassChoice > firstClassSeat.length){
			throw new IndexOutOfBoundsException("First class doesn't have seat reserved.");
		}
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		if (firstClassChoice == firstClassSeat[0] && firstClassChoice == firstClassSeat[1] &&
				firstClassChoice == firstClassSeat[2] && firstClassChoice == firstClassSeat[3] &&
				firstClassChoice == firstClassSeat[4]) {
			arrayList.add(firstClassSeat[0]);
			arrayList.add(firstClassSeat[1]);
			arrayList.add(firstClassSeat[2]);
			arrayList.add(firstClassSeat[3]);
			arrayList.add(firstClassSeat[4]);
		}
		
		return firstClassChoice;
	}
	
	public void init(){
	
	}
}