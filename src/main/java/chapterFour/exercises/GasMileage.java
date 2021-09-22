package chapterFour.exercises;

public class GasMileage {
	
	int totalMilesDriven;
	int totalGallonUsed;
	
	public GasMileage(int totalMilesDriven, int totalGallonUsed) {
		
		this.totalMilesDriven = totalMilesDriven;
		this.totalGallonUsed = totalGallonUsed;
	}
	
	public int getTotalMilesDriven() {
		return totalMilesDriven;
	}
	
	public void setTotalMilesDriven(int totalMilesDriven) {
		this.totalMilesDriven = totalMilesDriven;
	}
	
	public int getTotalGallonUsed() {
		return totalGallonUsed;
	}
	
	public void setTotalGallonUsed(int totalGallonUsed) {
		this.totalGallonUsed = totalGallonUsed;
	}
	
	public double getMilesPerGallonObtain(int miles, int gallons){
		totalMilesDriven  = totalMilesDriven + miles;
		totalGallonUsed = totalGallonUsed + gallons;
		
		return miles  / (double) gallons;
		
	}
	
	public int getTotalMPG(){
		return totalGallonUsed /getTotalMilesDriven();
	}
}
