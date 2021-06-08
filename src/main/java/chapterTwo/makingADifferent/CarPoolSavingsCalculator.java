package chapterTwo.makingADifferent;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
	
	public static void main(String[] args){
		
		Scanner driverUsageInput = new Scanner (System.in);
		
		int  totalMilesDrivenPerDay;
		int costPerGallonOfGasoline;
		int averageMilesPerGallon;
		int parkingFeesPerDay;
		int tollsPerDay;
		int dailyDrivingCost;
		
		System.out.println ("This Application Calculates Your Daily Driving Cost.");
		
		System.out.println ("....................................................\n"); //displays a blank line
		
		System.out.print ("Enter Total Miles Driven Per Day: ");
		totalMilesDrivenPerDay = driverUsageInput.nextInt();
		
		
		System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
		costPerGallonOfGasoline = driverUsageInput.nextInt();
		
		
		System.out.print ("Enter Average Miles Per Gallon: ");
		averageMilesPerGallon = driverUsageInput.nextInt();
		
		
		System.out.print ("Enter Parking Fees Per Day: ");
		parkingFeesPerDay = driverUsageInput.nextInt();
		
		
		System.out.print ("Enter Tolls Per Day: ");
		tollsPerDay = driverUsageInput.nextInt();
		
		dailyDrivingCost = (totalMilesDrivenPerDay / averageMilesPerGallon) *
				costPerGallonOfGasoline + parkingFeesPerDay + tollsPerDay;
		
		System.out.println("\n");
		System.out.printf ("Your Daily Driving Cost Is: %d\n", dailyDrivingCost);
	}
}
