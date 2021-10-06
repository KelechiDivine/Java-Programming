package chapterSeven.excercise;

public class SalesCommissions {
	
	private double salary;
	private int range;
	private final int[] total = new int[9];
	
	public void init(double dollar){
		
		while (dollar >= 0){
			salary = dollar * 0.09 + 200;
			range = (int) salary / 100;
			
			if (range > 10)
				range = 10;
			
			++total[range - 2];
		}
	}
}
