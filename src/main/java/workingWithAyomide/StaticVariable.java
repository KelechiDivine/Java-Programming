package workingWithAyomide;

public class StaticVariable {

    int rollNumber;
    String name;
    static String college = "ITS";

    public StaticVariable(){}
    public StaticVariable(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display() {
        System.out.println(rollNumber + "" + name + "" + college);
    }
}

class var1{

    StaticVariable staticVariable = new StaticVariable();

    public void run(){
        String n = StaticVariable.college = "Biscuit";
        System.out.println(n);
    }

    public static void main(String[] args) {
        var1 var1 = new var1();
        var1.run();
    }
}

