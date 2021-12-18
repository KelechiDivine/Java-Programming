//package chapterSeven.excercise;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AirlineReservations {
//
////	private final boolean[] totalNumberOfPassengersSeat = new boolean[10];
//	private final String [] firstClassSeatReservation = new String[]{"1", "2", "3", "4", "5"};
//	private final String [] economySeatReservation = new String[]{"6", "7", "8", "9", "0"};
//
////	TODO: Read customers value from string to int
//	public int readCustomerValueFromStringToInt(String number){
//		int seatCounter = number.length();
//		int seatNumber = 0;
//		int customersValue = 0;
//
////        TODO: Let string '0' be equals to integer 0
//		for (int indexOf = 0; indexOf < number.length(); indexOf++) {
//			if (number.charAt(indexOf) == '0') customersValue = 0;
//			if (number.charAt(indexOf) == '1') customersValue = 1;
//			if (number.charAt(indexOf) == '2') customersValue = 2;
//			if (number.charAt(indexOf) == '3') customersValue = 3;
//			if (number.charAt(indexOf) == '4') customersValue = 4;
//			if (number.charAt(indexOf) == '5') customersValue = 5;
//			if (number.charAt(indexOf) == '6') customersValue = 6;
//			if (number.charAt(indexOf) == '7') customersValue = 7;
//			if (number.charAt(indexOf) == '8') customersValue = 8;
//			if (number.charAt(indexOf) == '9') customersValue = 9;
//			seatNumber += customersValue * ((int)Math.pow(10, (number.length() - 1) - indexOf));
//	}
//	return seatNumber;
//}
//
//	//	TODO: If customers books a flight, send a welcome message.
//	public String sendWelcomeMessageToCustomers(){
//		String message = "Hi valued customer. Thanks for booking a ticket with us. We wish you a nice flight.";
//		System.out.println(message);
//		return message;
//	}
//
////	TODO: Create first class customer seat reservation.
//	public String assignSeatToAFirstClassCustomer(int customersChoice){
//		if (customersChoice == 1){
//			for (String index  : firstClassSeatReservation){
//			}
//		}
//	}
//
//	public String availableSeat(String val){
//		List<String> customerDatabase = new ArrayList<>();
//		for (int firstClassSeatIndex = 0; firstClassSeatIndex > 0; firstClassSeatIndex++){
//
//		}
//	}
////	public boolean createFirstClassCustomersSeatReservation(String customersChoice){
////		if (customersChoice.equals("firstClass")){
////			System.out.println(customersChoice);
////			if (assignSeatForFirstClassPassenger(customersChoice) > 0){
////				for (int seatIndex = 0; seatIndex < 5; seatIndex++){
////					if (!totalNumberOfPassengersSeat[seatIndex]){
////						System.out.println(seatIndex);
////						totalNumberOfPassengersSeat[seatIndex] = true;
////						displayBoardInformation(seatIndex);
////						return true;
////					}
////				}
////			}
////		}
////		return false;
////	}
//
////	TODO: Create economy customer seat reservation.
//	public boolean createEconomyCustomersSeatReservation(String customersChoice){
//		if (customersChoice.equals("economy")){
//			if (assignSeatToEconomyCustomer(customersChoice) > 0){
//				System.out.println(customersChoice);
//				for (int seatIndex = 5; seatIndex < totalNumberOfPassengersSeat.length; seatIndex++){
//					if (!totalNumberOfPassengersSeat[seatIndex]){
//						System.out.println(seatIndex);
//						totalNumberOfPassengersSeat[seatIndex] = true;
//						displayBoardInformation(seatIndex);
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
//
////	TODO: Print board information about airline.
//	public void displayBoardInformation(int seatIndex) {
//		System.out.println("\nBoarding pass for crap Airline.");
//		System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
//				(seatIndex < 5) ? "firstClass": "economy", seatIndex + 1);
//	}
//
////	TODO: Assign a seat for firstClass passenger logic.
//	public int assignSeatForFirstClassPassenger(String firstClassCustomersChoice) {
//		int totalNumberOfFirstClassSeat = 0;
//		if (firstClassCustomersChoice.equals("firstClass")){
//			for (int reservedFirstClassSeatVariable = 0; reservedFirstClassSeatVariable < 5; reservedFirstClassSeatVariable++){
//				if (!totalNumberOfPassengersSeat[reservedFirstClassSeatVariable])
//					totalNumberOfFirstClassSeat += 1;
//				System.out.println(totalNumberOfFirstClassSeat += 1);
//			}
//		}
//		return totalNumberOfFirstClassSeat;
//	}
//
////	TODO: Assign a seat for economy passenger logic
//	public int assignSeatToEconomyCustomer(String economyCustomersChoice){
//		int totalNumberOfEconomySeat = 5;
//
//		if (economyCustomersChoice.equals("economy")){
//			for (int hasAReservedEconomySeat = 5; hasAReservedEconomySeat < totalNumberOfPassengersSeat.length; hasAReservedEconomySeat++){
//				if (!totalNumberOfPassengersSeat[hasAReservedEconomySeat])
//					totalNumberOfEconomySeat += 1;
//			}
//		}
//		return totalNumberOfEconomySeat;
//	}
//
////	TODO: See whether or not if all seat are booked.
//	public boolean checkIfSeatIsAvailableOrNot(){
//		for (boolean seatIsNotEmpty : totalNumberOfPassengersSeat) {
//			return !seatIsNotEmpty;
//		}
//		return false;
//	}
//}