package hackerRank;

public class StringCalculation {

    public int readFromStringToInt(String number){
        int counter = number.length();
        int newNumber = 0;
        int value = 0;

        for (int indexOf = 0; indexOf < number.length(); indexOf++) {
            if (number.charAt(indexOf) == '0') value = 0;
            if (number.charAt(indexOf) == '1') value = 1;
            if (number.charAt(indexOf) == '2') value = 2;
            if (number.charAt(indexOf) == '3') value = 3;
            if (number.charAt(indexOf) == '4') value = 4;
            if (number.charAt(indexOf) == '5') value = 5;
            if (number.charAt(indexOf) == '6') value = 6;
            if (number.charAt(indexOf) == '7') value = 7;
            if (number.charAt(indexOf) == '8') value = 8;
            if (number.charAt(indexOf) == '9') value = 9;
            newNumber += value * ((int)Math.pow(10, (number.length() - 1) - indexOf));
        }
        return newNumber;
    }

    public String addTwoStringNumbers(String firstNumber, String secondNumber){
        return String.valueOf(readFromStringToInt(firstNumber) + readFromStringToInt(secondNumber));
    }
    public String subtractTwoStringNumbers(String firstNumber, String secondNumber){
        return String.valueOf(readFromStringToInt(firstNumber) - readFromStringToInt(secondNumber));
    }
    public String multiplyTwoStringNumbers(String firstNumber, String secondNumber){
        return String.valueOf(readFromStringToInt(firstNumber) * readFromStringToInt(secondNumber));
    }
    public String divideTwoStringNumbers(String firstNumber, String secondNumber){
        return String.valueOf(readFromStringToInt(firstNumber) / readFromStringToInt(secondNumber));
    }
}
