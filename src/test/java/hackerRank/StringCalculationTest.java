package hackerRank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringCalculationTest {

    @Test
    public void assertStringCalculationClassExist(){
        StringCalculation stringCalculation = new StringCalculation();
        Assertions.assertNotNull(stringCalculation);
    }


    @Test
    public void test_canCalculateNumbersInString(){
        StringCalculation stringCalculation = new StringCalculation();
        String addedNumber = stringCalculation.addTwoStringNumbers("2", "3");
        Assertions.assertEquals("5", addedNumber, "An error was encountered when trying to add numbers.");
    }

    @Test
    public void test_calculateNegativeNumber(){
        StringCalculation stringCalculation = new StringCalculation();
        String subtractedNumber = stringCalculation.subtractTwoStringNumbers("4", "8");
        Assertions.assertEquals("-4", subtractedNumber, "An error was encountered when trying to subtract numbers.");
    }

    @Test
    public void test_divideTwoNumbers(){
        StringCalculation stringCalculation = new StringCalculation();
        String dividedNumber = stringCalculation.divideTwoStringNumbers("4", "2");
        Assertions.assertEquals("2", dividedNumber, "An error was encountered when trying to dicide numbers.");
    }

    @Test
    public void test_multiplyTwoNumbers(){
        StringCalculation stringCalculation = new StringCalculation();
        String multipliedNumber = stringCalculation.multiplyTwoStringNumbers("4", "3");
        Assertions.assertEquals("12", multipliedNumber, "An error was encountered  while trying to multiply numbers.");
    }
}
