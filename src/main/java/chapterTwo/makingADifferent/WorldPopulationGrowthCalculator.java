package chapterTwo.makingADifferent;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
	
	public static void main(String[] args){
		
		Scanner worldPopulationInput = new Scanner(System.in);
		
		double currentYear;
		double firstYear;
		double secondYear;
		double thirdYear;
		double fourthYear;
		double fifthYear;
		float growthRate;

		System.out.print( "Enter the current world population (exclude commas): ");
		currentYear = worldPopulationInput.nextInt();
		
		System.out.print( "Enter the annual world population growth rate (in percent): ");
		growthRate = worldPopulationInput.nextInt();

		growthRate = growthRate / 100;
		
		firstYear = currentYear + ( currentYear * growthRate );
		System.out.printf( "\nWorld population after one year: %.0f\n", firstYear );
		
		currentYear = firstYear;
		
		secondYear = currentYear + ( currentYear * growthRate );
		System.out.printf( "                after two years: %.0f\n", secondYear );
		
		currentYear = secondYear;
		
		thirdYear = currentYear + ( currentYear * growthRate );
		System.out.printf( "              after three years: %.0f\n", thirdYear );
		
		currentYear = thirdYear;
		
		fourthYear = currentYear + ( currentYear * growthRate );
		System.out.printf( "               after four years: %.0f\n", fourthYear );
		
		currentYear = fourthYear;
		
		fifthYear = currentYear + ( currentYear * growthRate );
		System.out.printf( "               after five years: %.0f\n", fifthYear );
	}
}
