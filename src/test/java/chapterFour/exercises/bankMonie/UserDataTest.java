package chapterFour.exercises.bankMonie;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserDataTest {

    private UserData userData;

    @BeforeEach
    public void initSetup(){
        userData = new UserData(
                userData.getFirstname(),
                userData.getLastname(),
                userData.getPhoneNumber(),
                userData.getPassword());
    }

    @Test
    public void test_createAUser(){
        userData.setFirstname("Divine");
        userData.setLastname("Okoroafor");
        userData.setPassword("keLechi5363@#");
        userData.setPhoneNumber("08082167764");

        assert userData != null;
        assert userData.getPhoneNumber() != null;
        Assertions.assertEquals("08082167764");
    }
}