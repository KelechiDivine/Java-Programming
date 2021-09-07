package workingWithAyomide;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", hire, birth);
		
		System.out.println(employee);
	}
}
