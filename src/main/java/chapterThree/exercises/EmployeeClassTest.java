package chapterThree.exercises;

public class EmployeeClassTest {
	
	public static void main(String[] args){
	
	EmployeeClass kelechiEmployeeClass = new EmployeeClass("Kelechi", "Okoroafor", 356724000);
	EmployeeClass estherEmployeeClass = new EmployeeClass("Esther", "Omolola", 5409760);
	
	System.out.print("\nEmployer\t\tEmployers Name\t\t\tMonthly Salary\n");
	System.out.printf("S/n:\t\t%10s %10s\t\t%5s%.2f\n", kelechiEmployeeClass.getFirstName(),
					kelechiEmployeeClass.getLastName(), "$ ", kelechiEmployeeClass.getMonthlySalary());
	
	System.out.printf("S/n:\t\t%10s %10s\t\t%5s%.2f\n", estherEmployeeClass.getFirstName(),
					estherEmployeeClass.getLastName(), "$ ", estherEmployeeClass.getMonthlySalary());
	
	
//	Set raise by 10%
		
//		If the monthly salary is not positive, do not set its value.
		
		if (kelechiEmployeeClass.getMonthlySalary() > 0)
			kelechiEmployeeClass.setMonthlySalary(0.1 * kelechiEmployeeClass.getMonthlySalary()
					+ kelechiEmployeeClass.getMonthlySalary());
		
		if (estherEmployeeClass.getMonthlySalary() > 0)
			estherEmployeeClass.setMonthlySalary(0.1 * estherEmployeeClass.getMonthlySalary()
					+ estherEmployeeClass.getMonthlySalary());
		
		
		System.out.print("\n10 Percent Salary Raised!!!\n");
		
		System.out.print("\nEmployer\t\tEmployers Name\t\t\tMonthly Salary\n");
		
		System.out.printf("S/n:\t\t%10s %10s\t\t%5s%.2f\n", kelechiEmployeeClass.getFirstName(),
				kelechiEmployeeClass.getLastName(), "$ ", kelechiEmployeeClass.getMonthlySalary());
		
		System.out.printf("S/n:\t\t%10s %10s\t\t%5s%.2f\n", estherEmployeeClass.getFirstName(),
				estherEmployeeClass.getLastName(), "$ ", estherEmployeeClass.getMonthlySalary());
	
	
	}
}
