package chapterThree.makingADifference;



public class ComputerizationOfHealthRecordsTest {
	
	public static void main(String [] args) {
		
		ComputerizationOfHealthRecords instanceOfTheClasss = new ComputerizationOfHealthRecords(
				"esther", "omolola", "female", "05/04", 1.2
				, 39, 2003, 18);
		
		System.out.printf("%s%15s%12s%10s%13s%10s%17s%10s%n", "Lastname", "Firstname", "Gender", "DoB", "Height", "Weight", "Yearofbirth",  "Age\n");

		System.out.printf("%s%12s%12s%14s%9s%10s%15s%11s%n", instanceOfTheClasss.lastname, instanceOfTheClasss.firstname, instanceOfTheClasss.gender
			, instanceOfTheClasss.dOb, instanceOfTheClasss.getHeight(), instanceOfTheClasss.getWeight(), instanceOfTheClasss.getYearOfBirth(),
				instanceOfTheClasss.getAge());
		
		System.out.printf("\nHeight:\t%.2f inches\nWeight: %.2f pounds\n", instanceOfTheClasss.height, instanceOfTheClasss.weight);
		
		System.out.print("\n\t\t***** HEART RATE *****\n");
		
		System.out.printf("Maximum heart rate:\t%d\nTarget heart rate:\t%s\n", instanceOfTheClasss.getMaxHeartRate(), instanceOfTheClasss.getTargetHeartRate());
		
		
		System.out.print("\n***** Body Mass Index *****\n");
		System.out.printf("Your Body Mass Index: %.1f\n\n", instanceOfTheClasss.calculateMetric());
		
		if (instanceOfTheClasss.gender.equals("female"))
			System.out.printf("%s%s%s", "Dear Mrs. ", instanceOfTheClasss.getLastname(), " thank you for using our service.");
	
		if (instanceOfTheClasss.gender.equals("male"))
			System.out.printf("%s%s%s", "Dear Mr.", instanceOfTheClasss.getLastname(), " thank you for using our service.");
		
	}
	
	

}