package chapterTwo.Exercises;


public class DiameterCircumferenceAndAreaOfACircle {
	
	private double radius;
	private int diameter;
	private double area;
	
	public void circleRadius(double diameter) {
		
		radius= diameter /2;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void circleDiameter(int radius) {
		diameter = 2 * radius;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public void circleArea(double radius) {
		// area = πr2
		
		area = 3.14159 * (radius * radius);
	}
	
	public double getArea() {
		return area;
	}
}
