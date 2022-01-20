package workingWithAyomide;

public class ByteInAnArray {

    public static void main(String[] args) {
        String string = "byte array size example";

        byte[] bytes = string.getBytes();
        System.out.println("Size of byte array : " + bytes.length);
    }
}
