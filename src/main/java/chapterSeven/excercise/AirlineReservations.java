package chapterSeven.excercise;

public class AirlineReservations {

	private final boolean[] totalNumberOfPassengersSeat = new boolean[10];

//	TODO: If customers book a flight, send a welcome message.
	public String sendWelcomeMessageToCustomers(){
		String message = "Hi valued customer. Thanks for booking a ticket with us. We wish you a nice flight.";
		System.out.println(message);
		return message;
	}

//	TODO: Create first class customer seat reservation.
	public boolean createFirstClassCustomersSeatReservation(String customersChoice){
		if (customersChoice.equals("firstClass")){
			System.out.println(customersChoice);
			if (assignSeatForFirstClassPassenger(customersChoice) > 0){
				for (int seatIndex = 0; seatIndex < 5; seatIndex++){
					if (!totalNumberOfPassengersSeat[seatIndex]){
						System.out.println(seatIndex);
						totalNumberOfPassengersSeat[seatIndex] = true;
						displayBoardInformation(seatIndex);
						return true;
					}
				}
			}
		}
		return false;
	}

//	TODO: Create economy customer seat reservation.
	public boolean createEconomyCustomersSeatReservation(String customersChoice){
		if (customersChoice.equals("economy")){
			if (assignSeatToEconomyCustomer(customersChoice) > 0){
				System.out.println(customersChoice);
				for (int seatIndex = 5; seatIndex < totalNumberOfPassengersSeat.length; seatIndex++){
					if (!totalNumberOfPassengersSeat[seatIndex]){
						System.out.println(seatIndex);
						totalNumberOfPassengersSeat[seatIndex] = true;
						displayBoardInformation(seatIndex);
						return true;
					}
				}
			}
		}
		return false;
	}

//	TODO: Print board information about airline.
	public void displayBoardInformation(int seatIndex) {
		System.out.println("\nBoarding pass for crap Airline.");
		System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
				(seatIndex < 5) ? "firstClass": "economy", seatIndex + 1);
	}

//	TODO: Assign a seat for firstClass passenger logic.
	public int assignSeatForFirstClassPassenger(String firstClassCustomersChoice) {
		int totalNumberOfFirstClassSeat = 0;

		if (firstClassCustomersChoice.equals("firstClass")){
			for (int hasAReservedFirstClassSeat = 0; hasAReservedFirstClassSeat < 5; hasAReservedFirstClassSeat++){
				if (!totalNumberOfPassengersSeat[hasAReservedFirstClassSeat])
					totalNumberOfFirstClassSeat += 1;
				System.out.println(totalNumberOfFirstClassSeat += 1);
			}
		}
		return totalNumberOfFirstClassSeat;
	}

//	TODO: Assign a seat for economy passenger logic
	public int assignSeatToEconomyCustomer(String economyCustomersChoice){
		int totalNumberOfEconomySeat = 5;

		if (economyCustomersChoice.equals("economy")){
			for (int hasAReservedEconomySeat = 5; hasAReservedEconomySeat < totalNumberOfPassengersSeat.length; hasAReservedEconomySeat++){
				if (!totalNumberOfPassengersSeat[hasAReservedEconomySeat])
					totalNumberOfEconomySeat += 1;
			}
		}
		return totalNumberOfEconomySeat;
	}

//	TODO: See whether or not if all seat are booked.
	public boolean checkIfSeatIsAvailableOrNot(){
		for (boolean seatIsNotEmpty : totalNumberOfPassengersSeat) {
			return !seatIsNotEmpty;
		}
		return false;
	}
}