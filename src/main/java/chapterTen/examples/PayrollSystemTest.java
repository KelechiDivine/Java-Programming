package chapterTen.examples;

import chapterNine.example.CommissionEmployee;

public class PayrollSystemTest {
	
	public static void main(String[] args) {
		
		SalariedEmployee salariedEmployee = new SalariedEmployee(
				"John", "Smith",
				"111-111-1111", 800.00
		);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee(
				"Karen", "price", "222-222-2222",
				16.75, 40);
		
		CommissionEmployee commissionEmployee = new BasePlusCommissionEmployee(
				"sue", "Jones", "333-333-3333",
				10000, .06, 23);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "444-444-4444",
				5000, .04, 300
		);
		
		
	}
}
