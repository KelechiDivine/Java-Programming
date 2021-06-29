package chapterThree.exercises;

import java.util.Scanner;

public class ComputerizationOfHealthRecordsDriverClass {
	
	public static void main(String[] args){
		
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String userFirstName = scanner.nextLine();
		
		System.out.print("Enter last name: ");
		String userLastName = scanner.nextLine();
//
//		System.out.print("Enter age: ");
//		int userAge = scanner.nextInt();
		
		
		System.out.print("\nEnter weight: ");
		double userWeight = scanner.nextDouble();
		
		System.out.print("Enter height: ");
		double userHeight = scanner.nextDouble();
//
//		System.out.print("Enter year of Birth: ");
//		String userYearOfBirth = scanner.nextLine();
		
		System.out.print("Enter gender: \n");
		String userGender = scanner.nextLine();
		
		
		
		computerizationOfHealthRecords.healthRecordMethodForFirstName(userFirstName);
//		computerizationOfHealthRecords.healthRecordMethodForAge(userAge);
//		computerizationOfHealthRecords.healthRecordMethodForDateOfBirth(userYearOfBirth);
		computerizationOfHealthRecords.healthRecordMethodForLastName(userLastName);
		computerizationOfHealthRecords.healthRecordMethodForGender(userGender);
		computerizationOfHealthRecords.healthRecordMethodForHeight(userHeight);
		computerizationOfHealthRecords.heightRecordMethodForWeight(userWeight);
	}
}
