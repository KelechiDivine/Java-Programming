package hackerRank;

public class JuliaCodingChallenge {

    private int hackerId;
    private String hackerName;
    private int challengeId;

    public JuliaCodingChallenge(){}

    public int getHackerId() {
        return hackerId;
    }

    public String getHackerName() {
        return hackerName;
    }

    public int getChallengeId() {
        return challengeId;
    }

    public void displayHackersDetail() throws Exception {
        System.out.println("Hacker's name       |       Hacker's id         | challenge id");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%s                | %s                         | %s ", getHackerName(), getHackerId(), getChallengeId());
    }
}
