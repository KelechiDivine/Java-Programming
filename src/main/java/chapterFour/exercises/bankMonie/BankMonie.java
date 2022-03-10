package chapterFour.exercises.bankMonie;

import java.util.ArrayList;

public class BankMonie {

    UserData userData;

    private String accountNumber;

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    ArrayList<BankMonie> bankMonieArrayList = new ArrayList<>();

    public UserData registerCustomer(UserData newUserData) {
        if (userData.getPhoneNumber().equals(newUserData.getPhoneNumber())) {
            System.out.println("A user with that phone number already exist.");
        }
        userData.setFirstname(newUserData.getFirstname());
        userData.setLastname(newUserData.getLastname());
        userData.setPassword(newUserData.getPassword());
        userData.setPhoneNumber(newUserData.getPhoneNumber());

        userData.userDataArrayList.add(newUserData);
        return newUserData;
    }
}
