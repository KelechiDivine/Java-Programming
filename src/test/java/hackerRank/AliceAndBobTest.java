package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AliceAndBobTest {

    private AliceAndBob aliceAndBob;

    @BeforeEach
    public void initSetUp(){
        aliceAndBob = new AliceAndBob();
    }

    @Test
    public void test_aliceAndBobClassExist(){
        AliceAndBob aliceAndBob1 = new AliceAndBob();
        Assertions.assertNotNull(aliceAndBob1);
        System.out.println(aliceAndBob1);
    }
}