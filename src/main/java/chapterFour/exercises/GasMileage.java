package chapterFour.exercises;

public class GasMileage {
	
	int totalMilesDriven;
	int totalGalloneUsed;
	
	public GasMileage(int totalMilesDriven, int totalGalloneUsed) {
		
		this.totalMilesDriven = totalMilesDriven;
		this.totalGalloneUsed = totalGalloneUsed;
	}
	
	public int getTotalMilesDriven() {
		return totalMilesDriven;
	}
	
	public void setTotalMilesDriven(int totalMilesDriven) {
		this.totalMilesDriven = totalMilesDriven;
	}
	
	public int getTotalGalloneUsed() {
		return totalGalloneUsed;
	}
	
	public void setTotalGalloneUsed(int totalGalloneUsed) {
		this.totalGalloneUsed = totalGalloneUsed;
	}
	
	public double getMilesPerGallonObtain(int miles, int gallons){
		totalMilesDriven  = totalMilesDriven + miles;
		totalGalloneUsed = totalGalloneUsed + gallons;
		
		return miles  / (double) gallons;
		
	}
	
	public int getTotalMPG(){
		return totalGalloneUsed /getTotalMilesDriven();
	}
}
