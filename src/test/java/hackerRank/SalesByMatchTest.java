package hackerRank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SalesByMatchTest {

    @Test
    public void assertSalesByMatchClassExist(){
        SalesByMatch match = new SalesByMatch();
        Assertions.assertNotNull(match);
    }

    @Test
    public void test_canCountSockAndPairSockByColor(){
        SalesByMatch salesByMatch = new SalesByMatch();
        int sockVariable = salesByMatch.sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2});
        Assertions.assertEquals(2, sockVariable, "No socks was paired.");
    }

    @Test
    public void test_canPairAndCountSocks(){
        SalesByMatch salesByMatch = new SalesByMatch();
        int newSocks = salesByMatch.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        Assertions.assertEquals(3, newSocks, "No socks was paired.");
    }
}