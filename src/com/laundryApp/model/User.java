/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laundryApp.model;
/**
 *
 * @author apilghimire
 */
public class User {
    
    private int userID ;
    private String userName;
    private int contactNumber;
    private String userEmail;
    private String userAddress;

    public User(int userID, String userName, int contactNumber, String userEmail, String userAddress) {
        this.userID = userID;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
    
}
