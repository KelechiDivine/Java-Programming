package hackerRank.algo_expert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileTest {

    private Profile profile;

    @BeforeEach
    public void initSetup(){
        profile = new Profile();
    }

    @Test
    public void test_canCreateProfile(){
        profile.setFirstname("Kelechi");
        profile.setLastname("Divine");
        profile.setPassword("keLechi5363@#");
        profile.setPhoneNumber("08082167764");

        Assertions.assertNotNull(profile);
    }

}