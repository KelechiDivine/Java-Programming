package chapterFour.exercises;

public class SalesCommissionCalculator {
	
	int firstSale;
	int secondSale;
	int thirdSale;
	int fourthSales;
	double totalGrossPay;
	int basePay = 200;
	int commissionPay = 9 / 100;
	
	
	public SalesCommissionCalculator(int firstSale, int secondSale, int thirdSale,
									 int fourthSales, double totalGrossPay) {
		this.firstSale = firstSale;
		this.secondSale = secondSale;
		this.thirdSale = thirdSale;
		this.fourthSales = fourthSales;
		this.totalGrossPay = totalGrossPay;
	}
	
	public int getFirstSale() {
		return firstSale;
	}
	
	public void setFirstSale(int firstSale) {
		this.firstSale = firstSale;
	}
	
	public int getSecondSale() {
		return secondSale;
	}
	
	public void setSecondSale(int secondSale) {
		this.secondSale = secondSale;
	}
	
	public int getThirdSale() {
		return thirdSale;
	}
	
	public void setThirdSale(int thirdSale) {
		this.thirdSale = thirdSale;
	}
	
	public int getFourthSales() {
		return fourthSales;
	}
	
	public void setFourthSales(int fourthSales) {
		this.fourthSales = fourthSales;
	}
	
	public double getTotalGrossPay() {
		return totalGrossPay;
	}
	
	public void setTotalGrossPay(double totalGrossPay) {
		this.totalGrossPay = totalGrossPay;
	}
	
	public double getSalesTotal() {
		return totalGrossPay;
		
	}
	
	public double calculateCommission() {
		return basePay + totalGrossPay * commissionPay;
		
	}
}