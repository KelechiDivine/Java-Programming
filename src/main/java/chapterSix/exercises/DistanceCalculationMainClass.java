package chapterSix.exercises;

import java.util.Scanner;

public class DistanceCalculationMainClass {
	
	public static void main(String[] args) {
		
		DistanceCalculation distanceCalculation = new DistanceCalculation();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter point x1: ");
		int firPt = scanner.nextInt();
		
		System.out.print("Enter point x2: ");
		int secPt = scanner.nextInt();
		
		System.out.print("Enter point y1: ");
		int thiPt = scanner.nextInt();
		
		System.out.print("Enter point y2: ");
		int fort = scanner.nextInt();
		
		distanceCalculation.calculateDistance(firPt, secPt, thiPt, fort);
	}
}
