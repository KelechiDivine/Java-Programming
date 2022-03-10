package chapterFour.exercises.bankMonie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankMonieTest {

    private BankMonie bankMonie;

    private UserData userData;

    @BeforeEach
    public void initSetup(){
        bankMonie = new BankMonie();
    }

    @Test
    public void test_registerANewUser(){

        userData.setPhoneNumber("08082167764");
        userData.setPassword("I love jesus");
        userData.setLastname("Okoroafor");
        userData.setFirstname("Divine");

//        bankMonie.
    }
}