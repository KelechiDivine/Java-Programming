package chapterTwo.Exercises;

import java.util.Scanner;

public class Circle {
	private double hasRadius;
	private double hasArea;
	private double hasDiameter;
	
	public void findRadius(double hasCircumference){
	hasRadius = hasCircumference / 2.0;
	}
	
	public double getRadius(){
		return hasRadius;
	}
	
	public void findDiameter(double hasCircumference){
		hasDiameter = hasCircumference * hasRadius;
	}
	
	public double getDiameter(){
		return hasDiameter;
	}
	
	public void findArea(double hasRadius){
		hasArea = 3.14 * hasRadius * hasRadius;
	}
	
	public double getArea(){
		return hasArea;
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		double userInput = input.nextInt();
		
		circle.findRadius(userInput);
		circle.findDiameter(userInput);
		circle.findArea(userInput);
		
		System.out.printf("Radius is %s", circle.getRadius());
		
		System.out.printf("\nDiameter is %s", circle.getDiameter());
		
		System.out.printf("\nArea is %s", circle.getArea());
		
	}
}
