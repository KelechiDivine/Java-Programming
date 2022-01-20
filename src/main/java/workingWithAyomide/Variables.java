package workingWithAyomide;

public class Variables {

    int rollNumber;
    String name;
    static String college = "ITS";

    public Variables(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display() {
        System.out.println(rollNumber + "" + name + "" + college);
    }
}

