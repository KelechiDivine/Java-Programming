package chapterSeven.excercise;

public class AirlineReservations {
	
	boolean[] firstClass = new boolean[5];
	boolean[] economyClass = new boolean[5];
	int numbFirstClass = 0;
	int numEconomy = 0;
	boolean trueFirstClass = true;
	
	public void bookAFlight(int passengerChoice) {
		if (passengerChoice == 1) {
			economyClass();
		} else {
			if (passengerChoice == 2) {
				firstClass();
			} else {
				System.out.println("Invalid selection.");
			}
		}
	}
	
	public void firstClass() {
		if (numbFirstClass < 5) {
			for (int passengerIndex = 0; passengerIndex < firstClass.length; passengerIndex++) {
				if (!firstClass[passengerIndex]) {
					trueFirstClass = firstClass[passengerIndex];
					System.out.println("First class seat number: " + (passengerIndex + 1));
					numbFirstClass++;
				}
			}
		}
	}
	public boolean returnFirstResult(){
		return true;
	}
	
	public void economyClass() {
		if (numEconomy < 5) {
			for (int ecPassenger = 0; ecPassenger < economyClass.length; ecPassenger++) {
				if (!economyClass[ecPassenger]) {
					economyClass[ecPassenger] = true;
					System.out.println("Economy class Seat number: " + (ecPassenger + 6));
					numEconomy++;
				}
			}
		}
	}
}
