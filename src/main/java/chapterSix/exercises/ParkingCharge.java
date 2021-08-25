package chapterSix.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingCharge {

//	A parking garage charges a $2.00 minimum fee to park for up to three
//	hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//	hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//	longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//	customer. The program should display the charge for the current customer and should calculate and
//	display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.
	
	private static class CustomerParking {
		
		private String customersName;
		private int hoursPark;
		private double charges;
	}
	
	private static final List<CustomerParking> customerParkingList = new ArrayList<>();
	
	private static double calculateCharges(int hoursParked) {
		
		double charges = 2;
		if (hoursParked > 3) {
			charges = charges + (hoursParked - 3) * 0.5;
		}
		
		if (charges > 10) {
			charges = 10;
		}
		
		return charges;
	}
	
	private static void calculateCustomers() {
		for (CustomerParking customerParking : customerParkingList) {
			customerParking.charges = calculateCharges(customerParking.hoursPark);
		}
	}
	
	private static void printCustomer() {
		
		System.out.println("name		charges			running total");
		double total = 0f;
		
		for (CustomerParking customerParking : customerParkingList) {
			total = total + customerParking.charges;
			
			System.out.println(customerParking.customersName + "	" + customerParking.charges
					+ "		" + total);
		}
	}
	
	private static void readCustomer(){
		System.out.println("Please input customer and parked hours or print \"end\"" +
				"to finish");
		
		Scanner clientInput = new Scanner(System.in);
		
		String string = clientInput.nextLine();
		
		while (!("end".equals(string))){
			CustomerParking customerParking = new CustomerParking();
			String [] clientArray = string.split("	");
			customerParking.customersName = clientArray[0];
			customerParking.hoursPark = Integer.parseInt(clientArray[1]);
			customerParkingList.add(customerParking);
			System.out.println("Input next customer or print \"end\" to finish");
			string = clientInput.nextLine();
		}
	}
	
	public static void main(String[] args) {
		readCustomer();
		calculateCustomers();
		printCustomer();
	}
}