package chapterFour.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirConditionalTest {

    private AirConditional airConditional;

    @BeforeEach
    public void initSetup(){
        airConditional = new AirConditional();
    }

    @Test
    public void test_acIsOn(){
        int acIsOn = airConditional.acIsOn("on");
        Assertions.assertEquals(acIsOn, 16);
    }

    @Test
    public void test_acIsOff(){
        boolean acIsOff = airConditional.acIsOff("off");
        Assertions.assertTrue(acIsOff);
    }

    @Test
    public void test_changeAcTemperature(){
        int temperatureVariable = airConditional.acTemperature(17);
        Assertions.assertEquals(temperatureVariable, 17);

    }
}