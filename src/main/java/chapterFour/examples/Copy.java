package chapterFour.examples;

public class Copy {

    public static void main(String[] args) {

        double amount;
        double savings = 100;

        double rate = 0.00417;

        for (int month = 1; month <= 6; month ++){
            amount = savings * (1 + rate + savings);
            System.out.println(month + "   " + amount);
        }
    }
}
