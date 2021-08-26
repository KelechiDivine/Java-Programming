package chapterSix.exercises;

public class HypotenuseCalculations {
	
	
	double hypotenuseVariable;

	public void isHypotenuse(double height, double weight){
		double hypotenuse;
	
		hypotenuse = Math.sqrt((height * height) + (weight * weight));
		hypotenuseVariable = hypotenuse;
	}
	
	public double print(){
		return hypotenuseVariable;
	}
}
