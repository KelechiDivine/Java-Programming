package chapterSix.exercises;

public class DistanceCalculation {
	
	Double distance;
	
	public void calculateDistance(){
		System.out.println("Hey! Yo, This method isn't null...");
	}
	
	public Double calculateDistance(int x1, int x2, int y1, int y2){
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The distance between point x and y is: " + distance);
		return distance;
	}
}
