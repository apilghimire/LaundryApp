package com.laundryApp.model;

/**
 *
 * @author apilghimire
 */
public class Admin extends User {
    private String userPassword;

    public Admin(int userID, String userName, int contactNumber, String userEmail, String userAddress, String userPassword) {
        super(userID, userName, contactNumber, userEmail, userAddress);
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean checkPassword(String userPassword) {
        return userPassword.equals(getUserPassword());
    }
}
