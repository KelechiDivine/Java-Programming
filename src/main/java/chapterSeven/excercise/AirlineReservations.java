package chapterSeven.excercise;


import java.util.ArrayList;

public class AirlineReservations {
	
	private final int[] firstClassSeat = new int[]{1, 2, 3, 4, 5};
	private final int[] economySeat = new int[]{6, 7, 8, 9, 10};
	
	public void receiveWelcomeMessage(){
		System.out.println("Hi valued customer. Thanks for booking a ticket with us. We wish you a nice flight.");
	}
	
	public String registerPassenger(String passengerLastName, String passengerFirstName) {
		String nameVar = passengerLastName + passengerFirstName;
		receiveWelcomeMessage();
		return nameVar;
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
			System.out.println("Added successfully");
		}
		
		return firstClassChoice;
	}
	
	public void init(){
	
	}
}