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
        int number = stringCalculation.addTwoStringNumbers("2", "3");
        Assertions.assertEquals(5, number, "Error trying to calculate number.");
    }

    @Test
    public void test_calculateNegativeNumber(){
        StringCalculation stringCalculation = new StringCalculation();
        int number = stringCalculation.subtractTwoStringNumbers("4", "8");
        Assertions.assertEquals(-4, number, "error was encountered.");
    }

    @Test
    public void test_divideTwoNumbers(){
        StringCalculation stringCalculation = new StringCalculation();
        int number = stringCalculation.divideTwoStringNumbers("4", "2");
        Assertions.assertEquals(2, number, "error");
    }

    @Test
    public void test_multiplyTwoNumbers(){
        StringCalculation stringCalculation = new StringCalculation();
        int number = stringCalculation.multiplyTwoStringNumbers("4", "3");
        Assertions.assertEquals(12, number, "error encountered  while calculating....");
    }
}