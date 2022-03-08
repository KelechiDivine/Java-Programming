package chapterFour.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AcTest {

    private Ac ac;

    @BeforeEach
    public void initSetup(){
        ac = new Ac();
    }

    @Test
    public void test_acIsOn(){
        int acIsOn = ac.acIsOn("on");
        Assertions.assertEquals(acIsOn, 16);
    }

    @Test
    public void test_acIsOff(){
        boolean acIsOff = ac.acIsOff("off");
        Assertions.assertTrue(acIsOff);
    }

    @Test
    public void test_changeAcTemperature(){
        int temperatureVariable = ac.acTemperature(22);
        Assertions.assertEquals(temperatureVariable, 22);

    }

}