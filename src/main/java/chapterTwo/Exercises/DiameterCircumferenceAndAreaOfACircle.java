package chapterTwo.Exercises;


public class DiameterCircumferenceAndAreaOfACircle {
	
	private double diameter;
	private double radius;
	private  double area;
	private double circumference;
	
	public void getDiameterOfCircleMethod(double userInputForFindingDiameter) {
		diameter = 2 * userInputForFindingDiameter;
	}
	
	public double getDiameterFromUserInput() {
		return diameter;
	}
	
	public void getRadiusOfACircleMethod(double userInputForFindingRadius) {
		radius = userInputForFindingRadius / 2;
	}
	
	public double getRadiusFromAUser() {
		return radius;
	}
	
	public void getAreaOfACircle(double userInputForFindingArea) {
		area =  Math.PI * (userInputForFindingArea * userInputForFindingArea);
	}
	
	public double getAreaFromUserInput() {
		return area;
	}
	
	public void getCircumferenceOfACircle(int userInputForFindingCircumference) {
		circumference = 2 * Math.PI * userInputForFindingCircumference;
	}
	
	public double getCircumference() {
		return circumference;
	}
}
