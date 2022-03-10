package chapterFour.exercises.bankMonie;

import java.util.ArrayList;

public class UserData {

    ArrayList<UserData> userDataArrayList = new ArrayList<>();

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String password;

    public UserData(String firstname, String lastname, String phoneNumber, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void create(UserData newUserData){
//        if (newUserData.getPhoneNumber().contains(getPhoneNumber()))
        newUserData.setPassword(newUserData.getPassword());
        newUserData.setPhoneNumber(newUserData.getPhoneNumber());
        newUserData.setLastname(newUserData.getLastname());
        newUserData.setFirstname(newUserData.getFirstname());
    }
}
