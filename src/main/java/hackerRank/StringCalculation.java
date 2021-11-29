package hackerRank;

public class StringCalculation {

    public int readFromStringToInt(String number){
        int counter = number.length();
        int newNumber = 0;
        int value = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') value = 0;
            if (number.charAt(i) == '1') value = 1;
            if (number.charAt(i) == '2') value = 2;
            if (number.charAt(i) == '3') value = 3;
            if (number.charAt(i) == '4') value = 4;
            if (number.charAt(i) == '5') value = 5;
            if (number.charAt(i) == '6') value = 6;
            if (number.charAt(i) == '7') value = 7;
            if (number.charAt(i) == '8') value = 8;
            if (number.charAt(i) == '9') value = 9;
            newNumber += value * ((int)Math.pow(10, (number.length() - 1) - i));
        }
        return newNumber;
    }

    public int addTwoStringNumbers(String firstNumber, String secondNumber){
        return readFromStringToInt(firstNumber) + readFromStringToInt(secondNumber);
    }
    public int subtractTwoStringNumbers(String firstNumber, String secondNumber){
        return readFromStringToInt(firstNumber) - readFromStringToInt(secondNumber);
    }
    public int multiplyTwoStringNumbers(String firstNumber, String secondNumber){
        return readFromStringToInt(firstNumber) * readFromStringToInt(secondNumber);
    }
    public int divideTwoStringNumbers(String firstNumber, String secondNumber){
        return readFromStringToInt(firstNumber) / readFromStringToInt(secondNumber);
    }
}
