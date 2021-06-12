package chapterFour.exercises;

import java.util.Scanner;

public class GasMileageTest {

	public static void main(String[] args){
		
		GasMileage gasMileage = new GasMileage(43, 65);
		
		
		int miles;
		int gallons;
		
		String driverDecisions  = "y";
		
		
		Scanner driverInput = new Scanner(System.in);
		
		while (!driverDecisions.equals("n")){
			
			System.out.print("................................................\n");
			
			System.out.print("Enter Gas Mileage for this trip: ");
			miles = driverInput.nextInt();
			
			System.out.print("Enter Gallons used for this trip: ");
			gallons = driverInput.nextInt();
			
			System.out.printf("Your MPG for this trip is: %.2f\n",gasMileage.getMilesPerGallonObtain(miles, gallons));
			
			System.out.print("Add another trip? (y/n): ");
			driverDecisions = driverInput.next();
			
		}
	}
}
