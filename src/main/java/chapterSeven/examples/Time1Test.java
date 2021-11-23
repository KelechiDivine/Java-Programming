package chapterSeven.examples;

public class Time1Test {

    public static void main(String[] args) {

        Time1 time1 = new Time1();

        System.out.print("The initial universal time is: ");
        System.out.println(time1.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time1.toString());
        System.out.println();

        time1.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time1.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time1.toString());
        System.out.println();
    }
}


