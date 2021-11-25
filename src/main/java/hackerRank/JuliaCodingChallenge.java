package hackerRank;

import hackerRank.Exception.HackerException;

import java.util.ArrayList;
import java.util.List;

public class JuliaCodingChallenge {

    private int hackerId;
    private String hackerName;
    private int challengeId;

    List<String> arrayList = new ArrayList<>();


    public boolean hackerExist(){
        arrayList.contains(hackerName);
        return false;
    }
    public void setHackerId(int hackerId) {
        this.hackerId = hackerId;
    }

    public void setHackerName(String hackerName) {
        this.hackerName = hackerName;
    }

    public void setChallengeId(int challengeId) {
        this.challengeId = challengeId;
    }

    public int getHackerId() {
        return hackerId;
    }

    public String getHackerName() {
        return hackerName;
    }

    public int getChallengeId() {
        return challengeId;
    }

    public void displayHackersDetail() {
        System.out.println("Hacker's name       |       Hacker's id         | challenge id");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%s                | %s                         | %s ", getHackerName(), getHackerId(), getChallengeId());
    }

    public void registerHacker(String name, int id, int challengeId) throws HackerException {

        if (hackerExist()){
            throw new HackerException("Hacker with that name already exist.");
        }
        else {
            setChallengeId(challengeId);
            setHackerId(id);
            setHackerName(name);
            arrayList.add(name);
            System.out.println(arrayList.add(name));
        }
    }
}
