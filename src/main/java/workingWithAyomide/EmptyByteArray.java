package workingWithAyomide;

public class EmptyByteArray {

    public static void main(String[] args) {
        boolean empty_byte_array = true;
        byte[] bytes = new byte[10];

        for (byte b : bytes){
            if (b != 0){
                empty_byte_array = false;
                break;
            }
        }

        if (empty_byte_array)
            System.out.println("Byte array is empty.");
        else
            System.out.println("Byte array is not empty.");
    }
}
