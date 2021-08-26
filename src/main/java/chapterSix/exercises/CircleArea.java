package chapterSix.exercises;

public class CircleArea {
	
	double aClientVariable;
	double aRadiusVariable = 3.14;
	
	public void circleArea(int varClientInput){
		if (varClientInput > 0){
			aClientVariable = aRadiusVariable * aRadiusVariable;
		}
	}
	
	public double getRadius(){
		return aClientVariable;
	}
}
