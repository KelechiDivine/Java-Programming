package chapterEight.example;

public class Employee1 {

    private static int count = 0;
    private String lastName;
    private String firstName;

    public Employee1(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public static int getCount() {
        return count;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
