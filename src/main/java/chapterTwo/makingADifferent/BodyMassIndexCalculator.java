package chapterTwo.makingADifferent;

import java.util.Scanner;

public class BodyMassIndexCalculator {
	
	public static void main(String[] args){
//
//		Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
//		body mass index. Also, display the following information from the Department of Health and
//		Human Services/National Institutes of Health so the user can evaluate his/her BMI:
		
		Scanner userShouldEnterAWeightOrHeight = new Scanner(System.in);
//
//		No instance variable is declared here... Oppss!!!
		int weight;
		int height;
		int bmi;
		
		System.out.print("Enter your weight in pounds: ");
		weight = userShouldEnterAWeightOrHeight.nextInt();
		
		System.out.print("Enter your height in inches: ");
		height = userShouldEnterAWeightOrHeight.nextInt();
		
		bmi = (weight * 703) / (height * height);
		System.out.printf("Your body mass index (BMI) is %d\n\n", bmi);
		
		System.out.print("BMI VALUES.\n");
		System.out.print("Underweight: less than 18.5\n");
		System.out.print("Normal:		between 18.5 and 24.9\n");
		System.out.print("Overweight:	between 25 and 29.9\n");
		System.out.print("Obese:		30 0r greater\n");
	}
}
