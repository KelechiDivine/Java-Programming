package chapterSix.exercises;

import java.util.ArrayList;
import java.util.List;

public class DivineParkingCharges {
	
	
	// all time are calculated in hours
	
	private double minimumAmountPayedForParking = 2;
	
	public static class CustomerDetails{
		
		String customerName;
		int customerHoursParked;
		int customerCharges;
	}
	
	public static final List<CustomerDetails> customerDetailsList = new ArrayList<>();
	
	public void parkingCharges(int clientParkingTime){
		
		double minimumParkingTime = 3;
		double maximumParkingTime = 24;
	
		if (clientParkingTime > minimumParkingTime && clientParkingTime < maximumParkingTime){
			double extraChargesForParking = 0.5;
			minimumAmountPayedForParking =  extraChargesForParking + (Math.ceil(clientParkingTime) - minimumParkingTime)
					+ minimumAmountPayedForParking;
		}
		
		if (clientParkingTime  == maximumParkingTime){
			minimumAmountPayedForParking = maximumParkingTime;
		}
	}
	
	public double getParkingCharges(){
		return minimumAmountPayedForParking;
	}
	
	public static void calculateCustomerCharges() {
		for (CustomerDetails details : customerDetailsList) {
			details.customerCharges = details.customerHoursParked;
		}
	}
}
