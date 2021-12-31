package chapterEight.example;

public class PackageData {
    int number;
    String string;

    public PackageData() {
        number = 0;
        string = "Hello";
    }

    public String toString() {
        return String.format("number: %d: string %s", number, string);
    }
}
