/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laundryApp.model;

/**
 *
 * @author apilghimire
 * version 1.1
 */

public class Laundry {
    private int laundryId ;
    private double laundryWeight ;
    private double launderyPrice ;
    private String laundryType ;
    private boolean laundryPickup ;
    private boolean laundryDropoff ;
    private String laundryStatus;
    private String laundryCondition ;
    private int CustomerId;    

    public Laundry(int laundryId, double laundryWeight, String laundryType, boolean laundryPickup, boolean laundryDropoff, String laundryStatus, String laundrycondition, int CustomerId) {
        this.laundryId = laundryId;
        this.laundryWeight = laundryWeight;
        this.laundryType = laundryType;
        this.laundryPickup = laundryPickup;
        this.laundryDropoff = laundryDropoff;
        this.CustomerId = CustomerId;
    }

    public Laundry(int laundryId, double laundryWeight, String laundryType, int CustomerId) {
        this.laundryId = laundryId;
        this.laundryWeight = laundryWeight;
        this.laundryType = laundryType;
        this.CustomerId = CustomerId;
        this.laundryDropoff = false;
        this.laundryPickup= false;
    }

    public Laundry(int laundryId, double laundryWeight, String laundryType, boolean laundryPickup,boolean lundryDropoff, int CustomerId) {
        this.laundryId = laundryId;
        this.laundryWeight = laundryWeight;
        this.laundryType = laundryType;
        this.laundryPickup = laundryPickup;
        this.laundryStatus = "Sort Clothes";
        this.laundryCondition = "Active";
        this.CustomerId = CustomerId;
        this.laundryDropoff=false;
    }

    public int getLaundryId() {
        return laundryId;
    }

    public double getLaundryWeight() {
        return laundryWeight;
    }

    public double getLaunderyPrice() {
        return launderyPrice;
    }

    public String getLaundryType() {
        return laundryType;
    }

    public boolean isLaundryPickup() {
        return laundryPickup;
    }

    public boolean isLaundryDropoff() {
        return laundryDropoff;
    }

    public String getLaundryStatus() {
        return laundryStatus;
    }

    public String getLaundryCondition() {
        return laundryCondition;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setLaundryId(int laundryId) {
        this.laundryId = laundryId;
    }

    public void setLaundryWeight(int laundryWeight) {
        this.laundryWeight = laundryWeight;
    }

    public void setLaunderyPrice() {
        if("Dry Cleaning".equals(this.laundryType)){
            this.launderyPrice = this.laundryWeight*175;
        }
        else if("Wash".equals(this.laundryType)){
            this.launderyPrice = this.laundryWeight*95;
        }
        else {
            this.launderyPrice = this.laundryWeight*55;
        }
        
        if(this.isLaundryDropoff()){
            this.launderyPrice += 100;
        }
        if(this.isLaundryPickup()){
            this.launderyPrice += 100;
        }
    }
    public void setLaundryType(String laundryType) {
        this.laundryType = laundryType;
    }

    public void setLaundryPickup(boolean laundryPickup) {
        this.laundryPickup = laundryPickup;
    }

    public void setLaundryDropoff(boolean laundryDropoff) {
        this.laundryDropoff = laundryDropoff;
    }

    public void setLaundryStatus(String laundryStatus) {
        this.laundryStatus = laundryStatus;
    }

    public void setLaundryCondition(String laundrycondition) {
        this.laundryCondition = laundrycondition;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    @Override
public String toString() {
    return """
           Laundry Details:
           Laundry ID: """ + laundryId + "\n" +
           "Laundry Weight: " + laundryWeight + " kg\n" +
           "Laundry Price: $" + launderyPrice + "\n" +
           "Laundry Type: " + laundryType + "\n" +
           "Pickup Service: " + (laundryPickup ? "Yes" : "No") + "\n" +
           "Dropoff Service: " + (laundryDropoff ? "Yes" : "No") + "\n" +
           "Laundry Status: " + laundryStatus + "\n" +
           "Laundry Condition: " + laundryCondition + "\n" +
           "Customer ID: " + CustomerId;
}

    
    
}
