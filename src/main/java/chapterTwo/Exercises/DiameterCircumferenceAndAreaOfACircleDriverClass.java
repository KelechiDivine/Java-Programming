package chapterTwo.Exercises;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircleDriverClass {

	public static void main(String[] args){

		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter circumference of a circle: ");
		int findRadius = userInput.nextInt();
		
		diameterCircumferenceAndAreaOfACircle.getDiameterOfCircleMethod(findRadius);
		diameterCircumferenceAndAreaOfACircle.getAreaOfACircle(findRadius);
		diameterCircumferenceAndAreaOfACircle.getRadiusOfACircleMethod(findRadius);

		System.out.printf("Radius = %s", diameterCircumferenceAndAreaOfACircle.getRadiusFromAUser());
		System.out.printf("\nDiameter = %s", diameterCircumferenceAndAreaOfACircle.getDiameterFromUserInput());
		System.out.printf("\nArea= %s", diameterCircumferenceAndAreaOfACircle.getAreaFromUserInput());

	}
}
