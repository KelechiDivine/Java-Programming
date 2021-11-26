package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountingValleyTest {

    private CountingValley countingValley;

    @BeforeEach
    public  void setCountingValley(){
        countingValley = new CountingValley();
    }

    @Test
    public void assertCountingValleyClassExist(){
        CountingValley countingValley = new CountingValley();
        Assertions.assertNotNull(countingValley);
    }

    @Test
    public void test_eightStepsValleyHike(){
        int fromHike = countingValley.countingValley("UDDDUDUU", 8);
        Assertions.assertEquals(1, fromHike, "NO hike value found.");
    }

    @Test
    public void test_tenStepsValleyHike(){
        int fromHike = countingValley.countingValley("UDDDUDUUDU", 10);
        Assertions.assertEquals(2, fromHike, "No hike value found");
    }

    @Test
    public void test_oneStepValleyHike(){
        int fromHike = countingValley.countingValley("DU", 1);
        Assertions.assertEquals(1, fromHike, "No hike value found.");
    }

    @Test
    public void test_threeStepsValleyHike(){
        int fromHike = countingValley.countingValley("DDU", 3);
        Assertions.assertEquals(1, fromHike, "No hike value found.");
    }

    @Test
    public void test_tenMillionValleyHike(){
        int fromHike = countingValley.countingValley("DDU", 1000001);
        Assertions.assertEquals(1, fromHike, "No hike value found.");
    }

    @Test
    public void test_twentyValleyHike(){
        int fromHike = countingValley.countingValley("DDUUDDUUDDUUDDUUDDUU", 20);
        Assertions.assertEquals(5, fromHike, "No hike value found.");
    }

    @Test
    public void test_tenNegativeValleyHike(){
        int fromHike = countingValley.countingValley("UUUUUDUUUU", 10);
        Assertions.assertEquals(0, fromHike, "No hike value found.");
    }
}