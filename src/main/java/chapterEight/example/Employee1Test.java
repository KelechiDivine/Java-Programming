package chapterEight.example;

public class Employee1Test {

    public static void main(String[] args) {

        System.out.printf("Employee before instantiation: %d", Employee1.getCount());

        Employee1 employee1 = new Employee1("Susan", "Baker");
        Employee1 employee2 = new Employee1("Bob", "Blue");

        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("Via employee1.getCount(): %d%n", employee1.getCount());
        System.out.printf("Via employee2.getCount(): %d%n", employee2.getCount());
        System.out.printf("Via Employee.getCount(): %d%n", Employee1.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", employee1.getFirstName(),
                employee1.getLastName(), employee2.getFirstName(), employee2.getLastName());
    }
}
