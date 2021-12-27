package hackerRank.algo_expert;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ValueInBstTest {

    private ValueInBst valueInBst;

    @Before
    public void setValueInBst(){
        valueInBst = new ValueInBst();
    }

    @Test
    public void test_valueInBstClassExist(){
        ValueInBst valueInBstClassExist = new ValueInBst();
        assert valueInBstClassExist != null;
        System.out.println("Class exist.");
    }

}