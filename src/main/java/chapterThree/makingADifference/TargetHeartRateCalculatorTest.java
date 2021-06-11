package chapterThree.makingADifference;

public class TargetHeartRateCalculatorTest {
	
	public static void main(String[] args){
		
//		While exercising, you can use a heart-rate monitor to see that
//		your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
//		formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
//				Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
//		estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
//		and gender of the individual. Always consult a physician or qualified health-care professional before
//		beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
//should include the person’s first name, last name and date of birth (consisting of separate attributes for
//		the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that
//				calculates and returns the person’s age (in years), a method that calculates and returns the person’s
//		maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
//		Java app that prompts for the person’s information, instantiates an object of class HeartRates and
//				prints the information from that object—including the person’s first name, last name and date of
//		birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
//		range
//
		
		TargetHeartRateCalculator firstUserHeartRate = new TargetHeartRateCalculator("Okoroafor",
				"Kelechi", 12, 16, 2002);
		
		TargetHeartRateCalculator secondUserHeartRate = new TargetHeartRateCalculator("Esther", "Omolola",
				4, 5, 2003);
		
		TargetHeartRateCalculator thirdUserHeartRate = new TargetHeartRateCalculator("Chinwendu", "Okoroafor",
				1, 23, 2000);
		
		TargetHeartRateCalculator fourthUserHeartRate = new TargetHeartRateCalculator("Chinonso", "Okoroafor",
				3, 21, 1991);
				
				
		System.out.print("Lastname\t\tfirstname\t\tUser Age\t\tMax heart rate\t\tTargeted Heart Rate\n");
		
		System.out.printf("%s\t%12s\t%10s\t%20s\t%15s", firstUserHeartRate.getFirstName(), firstUserHeartRate.getLastName(),
				firstUserHeartRate.getPersonAge(), firstUserHeartRate.getMaxHeartRate(),
				firstUserHeartRate.getTargetedHeartRate());
		
		System.out.printf("\n%s\t%16s\t%10.5s\t%20s\t%15s", secondUserHeartRate.getFirstName(), secondUserHeartRate.getLastName(),
				secondUserHeartRate.getPersonAge(), secondUserHeartRate.getMaxHeartRate(),
				secondUserHeartRate.getTargetedHeartRate());
		
		
		System.out.printf("\n%s\t%12s\t%10s\t%20s\t%15s", thirdUserHeartRate.getFirstName(), thirdUserHeartRate.getLastName(),
				thirdUserHeartRate.getPersonAge(), thirdUserHeartRate.getMaxHeartRate(),
				thirdUserHeartRate.getTargetedHeartRate());
		
		
		System.out.printf("\n%s\t%12s\t%10.5s\t%20s\t%15s", fourthUserHeartRate.getFirstName(), fourthUserHeartRate.getLastName(),
				fourthUserHeartRate.getPersonAge(), fourthUserHeartRate.getMaxHeartRate(),
				fourthUserHeartRate.getTargetedHeartRate());
		
		
		
	}
}
