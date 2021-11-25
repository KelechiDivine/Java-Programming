package hackerRank;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class JuliaCodingChallengeTest {

//    private JuliaCodingChallenge juliaCodingChallenge;
//
//    @BeforeEach
//    public void setJuliaCodingChallenge(){
//        juliaCodingChallenge = new JuliaCodingChallenge();
//    }

    @Test
    public void assertJuliaCodingChallengeClassExist(){
        JuliaCodingChallenge juliaCodingChallenge1 = new JuliaCodingChallenge();
        Assertions.assertNotNull(juliaCodingChallenge1);
    }

    @Test
    public void test_canDisplayHackersInformationInTableFormat() throws Exception {
        JuliaCodingChallenge juliaCodingChallenge = new JuliaCodingChallenge();
        juliaCodingChallenge.displayHackersDetail();
        Assertions.assertTrue(true);
    }
}