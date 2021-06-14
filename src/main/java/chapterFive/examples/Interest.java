package chapterFive.examples;

public class Interest {

	public static void main(String[] args){
	
		double amount;
		double principal = 100.0;
		double rate = 0.05;
		
		System.out.printf ("%s%20s %n", "Year", "Amount on deposit");
		
		for (int years = 1; years <= 10; years = years + 1){
			
			amount = principal * Math.pow(1.0 + rate, years);
			
			System.out.printf("%4d%,20.2f%n", years, amount);
			
		}
	}
}
